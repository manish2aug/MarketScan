package in.co.trish.marketscan.configurations;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableScheduling;

import in.co.trish.marketscan.configurations.persistence.MarketScanPersistenceConfiguration;
import in.co.trish.marketscan.configurations.swagger.MarketScanSwaggerConfiguration;
import in.co.trish.marketscan.configurations.web.MarketScanWebConfigurations;
import in.co.trish.marketscan.web.MarketScanResponseMessage;

@Configuration
@ComponentScan(basePackages = {
		"co.in.trish.marketscan" }, excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = {
				"co.in.trish.marketscan.web.filters.*" }))
@PropertySource(value = { "classpath:application.properties" })
@EnableScheduling
@EnableAspectJAutoProxy
@EnableCaching
@Import({ MarketScanSwaggerConfiguration.class, MarketScanPersistenceConfiguration.class,
		MarketScanWebConfigurations.class })
public class MarketScanConfiguration {

	@Autowired
	private Environment env;

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager();
	}

	@Bean
	public JavaMailSenderImpl javaMailSenderImpl() {
		JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
		mailSenderImpl.setHost(env.getProperty("smtp.host"));
		mailSenderImpl.setPort(env.getProperty("smtp.port", Integer.class));
		mailSenderImpl.setProtocol(env.getProperty("smtp.protocol"));
		mailSenderImpl.setUsername(env.getProperty("smtp.username"));
		mailSenderImpl.setPassword(env.getProperty("smtp.password"));

		Properties javaMailProps = new Properties();
		javaMailProps.put("mail.smtp.auth", true);
		javaMailProps.put("mail.smtp.starttls.enable", true);
		mailSenderImpl.setJavaMailProperties(javaMailProps);

		return mailSenderImpl;
	}

	@Bean
	public MarketScanResponseMessage httpResponse(){
		return new MarketScanResponseMessage();
	}
}

/**
 *
 */
package in.co.trish.marketscan.web.configurations;

import java.util.Properties;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Configuration
@ComponentScan(basePackages = { "in.co.trish.marketscan.web" })
@EnableWebMvc
public class MarketScanWebConfigurations extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
    }

    @Bean(name = "messageSource")
    public MessageSource configureMessageSource() {
	ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	messageSource.setBasename("classpath:messages");
	messageSource.setCacheSeconds(5);
	messageSource.setDefaultEncoding("UTF-8");
	return messageSource;
    }

    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
	SimpleMappingExceptionResolver b = new SimpleMappingExceptionResolver();
	Properties mappings = new Properties();
	mappings.put("org.springframework.dao.DataAccessException", "error");
	b.setExceptionMappings(mappings);
	return b;
    }
}
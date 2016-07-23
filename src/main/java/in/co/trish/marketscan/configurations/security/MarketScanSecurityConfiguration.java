package in.co.trish.marketscan.configurations.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import in.co.trish.marketscan.security.MySavedRequestAwareAuthenticationSuccessHandler;
import in.co.trish.marketscan.security.RestAuthenticationEntryPoint;

@Configuration
@EnableWebSecurity
@ComponentScan("in.co.trish.marketscan.security")
public class MarketScanSecurityConfiguration extends WebSecurityConfigurerAdapter {
 
    @Autowired
    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;
 
    @Autowired
    private MySavedRequestAwareAuthenticationSuccessHandler authenticationSuccessHandler;
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().
          withUser("admin").password("password").roles("ADMIN").and().
          withUser("user").password("password").roles("USER");
    }
 
//    @Override
//    protected void configure(HttpSecurity http) throws Exception { 
//        http
//        .csrf().disable()
//        .exceptionHandling()
//        .authenticationEntryPoint(restAuthenticationEntryPoint)
//        .and()
//        .authorizeRequests()
//        .antMatchers("/*").authenticated()
//        .and()
//        .formLogin()
//        .successHandler(authenticationSuccessHandler)
//        .failureHandler(new SimpleUrlAuthenticationFailureHandler())
//        .and()
//        .logout();
//    }
 
    @Override
	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.antMatcher("/v1/**")
//			.authorizeRequests()
//				.anyRequest().hasRole("ADMIN")
//				.and()
//			.httpBasic();
		
		http
			.antMatcher("/v1/**")
			.authorizeRequests()
			.anyRequest().hasRole("ADMIN")
//			.authenticated()
			.and()
			.httpBasic()
			.and()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
			.and().requiresChannel().anyRequest().requiresSecure();
	}
    
    @Bean
    public MySavedRequestAwareAuthenticationSuccessHandler mySuccessHandler(){
        return new MySavedRequestAwareAuthenticationSuccessHandler();
    }
    @Bean
    public SimpleUrlAuthenticationFailureHandler myFailureHandler(){
        return new SimpleUrlAuthenticationFailureHandler();
    }
}
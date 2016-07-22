package in.co.trish.marketscan.configurations.web;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import ch.qos.logback.access.servlet.TeeFilter;
import in.co.trish.marketscan.configurations.MarketScanConfiguration;
import in.co.trish.marketscan.configurations.security.MarketScanSecurityConfiguration;
import in.co.trish.marketscan.web.filters.CORSFilter;

public class MarketScanWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { MarketScanSecurityConfiguration.class, MarketScanConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { MarketScanWebConfigurations.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() { 
		
		// For cross origin protections
		CORSFilter corsFilter = new CORSFilter();
		// For capturing incoming HTTP requests and outgoing responses
		TeeFilter teeFilter = new TeeFilter();
		Filter[] filters = { corsFilter, teeFilter };
		return filters;
	}

}

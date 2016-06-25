package in.co.trish.marketscan.configurations.web;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import in.co.trish.marketscan.configurations.MarketScanConfiguration;
import in.co.trish.marketscan.web.filters.CORSFilter;

public class MarketScanWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { MarketScanConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { MarketScanWebConfigurations.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {
		Filter[] filters = { new CORSFilter() };
		return filters;
	}

}

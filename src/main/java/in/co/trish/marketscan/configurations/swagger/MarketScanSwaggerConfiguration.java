package in.co.trish.marketscan.configurations.swagger;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.co.trish.marketscan.application.MarketScanApplicationConstants;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class MarketScanSwaggerConfiguration {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("in.co.trish.marketscan.web.controllers"))
				.paths(PathSelectors.any())
				.build()
				.produces(getAllProduceContentTypes())
				.apiInfo(apiInfo());
	}

	private Set<String> getAllConcumeContentTypes() {
		Set<String> consumes = new HashSet<>();
		// Add other media types if required in future
//		consumes.add(MarketScanApplicationConstants.ACCEPTED_CONTENT_TYPE_VERSION_1);
		
		return consumes;
	}

	private Set<String> getAllProduceContentTypes() {
		Set<String> consumes = new HashSet<>();
		// Add other media types if required in future
		consumes.add(MarketScanApplicationConstants.ACCEPTED_CONTENT_TYPE_VERSION_1);
		
		return consumes;
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfo(
				"MarketScan API", "This API provides a convinient way to scan surrounding market and the whole city as well in a restful manner. The starting end-point is Product search and keeps all possible further states", 
				"1.0.0", 
				"TBE", 
				"manish2aug@gmail.com", 
				"TBE", 
				"TBE");
		
	}
}
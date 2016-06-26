package in.co.trish.marketscan.configurations.swagger;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class MarketScanSwaggerConfiguration {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("market-scan")
				.select()
				.apis(RequestHandlerSelectors.basePackage("in.co.trish.marketscan.web.controllers"))
				.paths(PathSelectors.any())
				.build()
				.consumes(getAllConsumeContentTypes())
				.produces(getAllProduceContentTypes())
				.apiInfo(apiInfo());
	}

	private Set<String> getAllConsumeContentTypes() {
		Set<String> consumes = new HashSet<>();
		// Add other media types if required in future
		consumes.add("application/vnd.market-scan.v1+json");
		return consumes;
	}

	private Set<String> getAllProduceContentTypes() {
		Set<String> produces = new HashSet<>();
		// Add other media types if required in future
		produces.add("application/json");
		return produces;
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
                .title("Market Scan API")
                .description("This API provides a convinient way to scan surrounding market and the whole city as well in a restful manner. "
                		+ "The starting end-point is Product search and keeps all possible further states")
                .termsOfServiceUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("Manish Kumar", "", "manish2aug@gmail.com"))
                .license("Apache License Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .version("1.0")
                .build();
	}
}
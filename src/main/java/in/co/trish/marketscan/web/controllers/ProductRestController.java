package in.co.trish.marketscan.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import in.co.trish.marketscan.application.MarketScanApplicationConstants;
import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.web.MarketScanResponseMessage;
import in.co.trish.marketscan.web.assemblers.ProductResourceAssembler;
import in.co.trish.marketscan.web.resources.read.ProductResource;
import in.co.trish.marketscan.web.services.BrandService;
import in.co.trish.marketscan.web.services.CityService;
import in.co.trish.marketscan.web.services.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ResponseHeader;

@RequestMapping(value = "/v1/{cityCode}/products")
@RestController
@Api(tags = {"Available products in a city"}, 
				produces="application/json", 
				consumes="application/vnd.market-scan.v1+json", 
				protocols="http")
public class ProductRestController {

	private static final Logger log = LoggerFactory.getLogger(ProductRestController.class);
	
	@Autowired
	ProductService productService;

	@Autowired
	CityService cityService;

	@Autowired
	BrandService brandService;

	@Autowired
	ProductResourceAssembler assembler;

	@Autowired
	MarketScanResponseMessage response;
	
	@RequestMapping(method = RequestMethod.GET, consumes = {MarketScanApplicationConstants.ACCEPTED_CONTENT_TYPE_VERSION_1}, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ApiOperation(value = "Find available products matching with supplied identifier in user's current city", notes = "System would build a nice description of found product by combining brand and category", response = Product.class, responseContainer = "List")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "JSON representation of collection of products including other accessible application states", responseHeaders = @ResponseHeader(name = "Content-Type", description = MediaType.APPLICATION_JSON_VALUE, response = String.class)), 
			@ApiResponse(code = 404, message = "No product found"), 
			@ApiResponse(code = 500, message = "Something went wrong!"),
			@ApiResponse(code = 415, message = "Unsupported media type")
		}
	)
	public ResponseEntity<List<ProductResource>> getItems(
			@ApiParam(value = "Search string contained in product name", required = true) @RequestParam(name = "searchString", required = true) String searchString,
			@ApiParam(value = "City from where user initiates the product search", required = true) @PathVariable("cityCode") String cityCode) {

		// provide all path parameters
		assembler.pathParameters.add(cityCode);
		// retrieve all products as per the search criteria 
		City city = cityService.findByCode(cityCode);
		List<Product> products = productService.findMatchingProductsInCity(searchString, city);
		
		if (products.isEmpty()) {
			return new ResponseEntity<List<ProductResource>>(HttpStatus.NO_CONTENT);
		}

		List<ProductResource> resourceList = assembler.toResources(products);
		return new ResponseEntity<List<ProductResource>>(resourceList, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = {MarketScanApplicationConstants.ACCEPTED_CONTENT_TYPE_VERSION_1}, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ApiOperation(value = "Adds new product", notes = "would return a payload stating the transaction status")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "successful response"), @ApiResponse(code = 500, message = "Something went wrong!")})
	private ResponseEntity<MarketScanResponseMessage> saveProduct(@PathVariable("cityCode") String cityCode, @RequestBody(required = true) @Valid Product productPayload) {
		log.debug("create product method called");
		// provide all path parameters
		Product product = productService.addProduct(cityCode, productPayload);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(product.getId()).toUri());
		response.setStatus("Success"); 
		response.setDetail("Product created successfully!");
		return new ResponseEntity<MarketScanResponseMessage>(response,httpHeaders, HttpStatus.CREATED);
	}
	
}

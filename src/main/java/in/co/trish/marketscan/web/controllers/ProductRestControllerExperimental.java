package in.co.trish.marketscan.web.controllers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
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
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.web.MarketScanResponseMessage;
import in.co.trish.marketscan.web.assemblers.ProductResourceAssembler;
import in.co.trish.marketscan.web.criterias.ProductSearchCriteria;
import in.co.trish.marketscan.web.resources.read.ProductResource;
import in.co.trish.marketscan.web.services.BrandService;
import in.co.trish.marketscan.web.services.CityService;
import in.co.trish.marketscan.web.services.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping(value = "/v1/products")
@RestController
@Api(tags = {"Available products in a city"}, 
				produces="application/json", 
				consumes="application/vnd.market-scan.v1+json", 
				protocols="http")
public class ProductRestControllerExperimental {

	private static final Logger log = LoggerFactory.getLogger(ProductRestControllerExperimental.class);
	
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
	@ApiOperation(value = "Find available products matching with supplied identifier in user's current city", 
					notes = "System would build a nice description of found product by combining brand and category", 
					response = Product.class, 
					responseContainer = "List")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "All retrieved products"), 
			@ApiResponse(code = 404, message = "No product found"), 
			@ApiResponse(code = 500, message = "Something went wrong!"),
			@ApiResponse(code = 415, message = "Unsupported media type")
		}
	)
	public ResponseEntity<List<ProductResource>> getItems(
			@ApiParam(value = "City for which the search should be performed", defaultValue="User's current city") @RequestParam(name = "city", required=true) @NotBlank String city, // TODO: the default value should be user's current city, server should retrieve value if ui doesn't send
			@ApiParam(value = "Search string contained in product name") @RequestParam(name = "name", required=true) @NotBlank String name,
			@ApiParam(value = "Radius in Kilometers of the area in which search should be performed") @RequestParam(name = "distance", defaultValue="2") @Min(value=2) long distance,
			@ApiParam(value = "Seller name for which search should be performed") @RequestParam(name = "seller", required=false) String seller,
			@ApiParam(value = "Locality name in which the search should be performed") @RequestParam(name = "locality", required=false) String locality,
			@ApiParam(value = "Category name in which the searched item lies") @RequestParam(name = "category", required=false) String category,
			@ApiParam(value = "Sub category name in which the searched item lies") @RequestParam(name = "sub_category", required=false) String sub_category,
			@ApiParam(value = "Maximum cost of the item for which search should be performed") @RequestParam(name = "max_cost", required=false, defaultValue="0") @Min(value=0) double max_cost,
			@ApiParam(value = "Minimum cost of the item for which search should be performed") @RequestParam(name = "min_cost", required=false, defaultValue="0") @Min(value=0) double min_cost,
			@ApiParam(value = "Brand of the product for which search should be performed") @RequestParam(name = "brand", required=false) String brand,
			@ApiParam(value = "Author name of book for which search should be performed") @RequestParam(name = "author", required=false) String author,
			@ApiParam(value = "Whether the searched product is a service, true or false") @RequestParam(name = "is_service", required=false) boolean is_service,
			@ApiParam(value = "Should the searched product is expired") @RequestParam(name = "is_expired", defaultValue="false", required=false) boolean is_expired,
			@ApiParam(value = "Whether the searched product is on deal") @RequestParam(name = "is_deal", defaultValue="false", required=false) boolean is_deal,
			@ApiParam(value = "Comma separated list of the fields, should be included in response") @RequestParam(name = "fields", required=false) String fields) 
	{
		
		ProductSearchCriteria criteria = new ProductSearchCriteria(city, name, distance, seller, locality, category, sub_category, max_cost, min_cost, brand, author, is_service, is_expired, is_deal, fields);
		criteria.setOperation(":");
		// retrieve all products as per the search criteria 
		log.debug(criteria.toString());
		List<Product> products = productService.findProductsByCriteria(criteria);
		
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

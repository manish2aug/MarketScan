package in.co.trish.marketscan.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.co.trish.marketscan.application.MarketScanApplicationConstants;
import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.web.representation.assembler.ProductResourceAssembler;
import in.co.trish.marketscan.web.representation.read.ProductResource;
import in.co.trish.marketscan.web.services.BrandService;
import in.co.trish.marketscan.web.services.CityService;
import in.co.trish.marketscan.web.services.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping(value = "/v1/{cityCode}/products")
@Api("/v1/{cityCode}/products")
@RestController
public class ProductRestController {

	@Autowired
	ProductService productService;

	@Autowired
	CityService cityService;

	@Autowired
	BrandService brandService;

	@Autowired
	ProductResourceAssembler assembler;

	@RequestMapping(method = RequestMethod.GET, consumes = {MarketScanApplicationConstants.ACCEPTED_CONTENT_TYPE_VERSION_1 })
	@ApiOperation(value = "Find the person with the specified guid")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "JSON representation of person including other accessible application states"), 
			@ApiResponse(code = 404, message = "No person found with supplied guid"), 
			@ApiResponse(code = 500, message = "Server error occurred")
		}
	)
	public ResponseEntity<List<ProductResource>> getItems(
			@RequestParam(name = "searchString", required = true) String searchString,
			@PathVariable("cityCode") String cityCode) {

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

}

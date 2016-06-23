package in.co.trish.marketscan.web.controllers;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.web.representation.assembler.ProductResourceAssembler;
import in.co.trish.marketscan.web.representation.read.ProductResource;
import in.co.trish.marketscan.web.services.BrandService;
import in.co.trish.marketscan.web.services.CityService;
import in.co.trish.marketscan.web.services.ProductService;

@RequestMapping(value = "/V1/{cityCode}/items")
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
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ProductResource>> getItems(@RequestParam("searchString") String searchString, @PathVariable("cityCode") String cityCode) {
		
		HashSet<City> cities = new HashSet<>();
		City city = cityService.findByCode(cityCode);
		System.out.println("city name = "+city.getName());
		cities.add(city);
		City[] cities1 = {city};
		List<Product> items = productService.findAll(searchString, cities1,brandService.findAll());
        
		
        if (items.isEmpty()) {
			return new ResponseEntity<List<ProductResource>>(HttpStatus.NO_CONTENT);
		}

		assembler.setPathParameters(new Object[]{cityCode});
		List<ProductResource> resourceList = assembler.toResources(items);
		
		return new ResponseEntity<List<ProductResource>>(resourceList, HttpStatus.OK);
	}
	
}

package in.co.trish.marketscan.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.co.trish.marketscan.web.representation.assembler.ProductResourceAssembler;
import in.co.trish.marketscan.web.representation.read.ProductResource;
import in.co.trish.marketscan.web.services.ProductService;

@RequestMapping(value = "/V1/cities")
@RestController
public class CItyRestController {
	
	@Autowired
	ProductService service;
	
	@Autowired
	ProductResourceAssembler assembler;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<ProductResource>> getItems(@RequestParam("searchString") String searchString, @PathVariable("city") String city) {
		
//		List<Product> items = service.findAll(searchString);
//
//		if (items.isEmpty()) {
//			return new ResponseEntity<List<ProductResource>>(HttpStatus.NO_CONTENT);
//		}
//
//		assembler.setPathParameters(new Object[]{city});
//		List<ProductResource> resourceList = assembler.toResources(items);
		
		return null;
	}
	
}

package in.co.trish.marketscan.web.controllers;

import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.web.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/V1/{city}/items/{itemId}/compare")
@RestController
public class MarketComparisonRestController {

	@Autowired
	ProductService itemService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Product>> getCompareResult(@RequestParam("searchString") String searchString) {
		List<Product> items = itemService.findAll(searchString);
		if (items.isEmpty()) {
			return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Product>>(items, HttpStatus.OK);
	}

}

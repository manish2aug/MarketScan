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

import in.co.trish.marketscan.persistence.entities.Item;
import in.co.trish.marketscan.web.representation.assembler.ItemResourceAssembler;
import in.co.trish.marketscan.web.representation.read.ItemReadRepresentation;
import in.co.trish.marketscan.web.services.ItemService;

@RequestMapping(value = "/V1/{city}/items")
@RestController
public class ItemRestController {
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<ItemReadRepresentation>> getItems(@RequestParam("searchString") String searchString, @PathVariable("city") String city) {
		
		List<Item> items = itemService.findAll(searchString);
		if (items.isEmpty()) {
			return new ResponseEntity<List<ItemReadRepresentation>>(HttpStatus.NO_CONTENT);
		}
		
		ItemResourceAssembler assembler = new ItemResourceAssembler(city); 
		List<ItemReadRepresentation> resourceList = assembler.toResources(items);
		
		System.out.println("subcategory: " + items.get(0).getSubCategory().getNameEnglish());
		return new ResponseEntity<List<ItemReadRepresentation>>(resourceList, HttpStatus.OK);
	}
	
}

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
import in.co.trish.marketscan.web.representation.read.ItemReadResource;
import in.co.trish.marketscan.web.services.ItemService;

@RequestMapping(value = "/V1/{city}/items")
@RestController
public class ItemRestController {
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	ItemResourceAssembler assembler;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<ItemReadResource>> getItems(@RequestParam("searchString") String searchString, @PathVariable("city") String city) {
		
		List<Item> items = itemService.findAll(searchString);
		if (items.isEmpty()) {
			return new ResponseEntity<List<ItemReadResource>>(HttpStatus.NO_CONTENT);
		}

		assembler.setPathParameters(new Object[]{city});
		List<ItemReadResource> resourceList = assembler.toResources(items);
		
		return new ResponseEntity<List<ItemReadResource>>(resourceList, HttpStatus.OK);
	}
	
}

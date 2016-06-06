package in.co.trish.marketscan.web.controllers;

import in.co.trish.marketscan.persistence.entities.Item;
import in.co.trish.marketscan.web.services.ItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemRestController {

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public ResponseEntity<List<Item>> listAllUsers() {
	List<Item> items = itemService.findAllItems();
	if (items.isEmpty()) {
	    return new ResponseEntity<List<Item>>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
    }

}

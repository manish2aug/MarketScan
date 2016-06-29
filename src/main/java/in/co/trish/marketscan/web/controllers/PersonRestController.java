package in.co.trish.marketscan.web.controllers;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.co.trish.marketscan.application.MarketScanApplicationConstants;
import in.co.trish.marketscan.persistence.entities.Person;
import in.co.trish.marketscan.web.representation.read.PersonResource;
import in.co.trish.marketscan.web.representation.read.ProductResource;
import in.co.trish.marketscan.web.services.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping(value = "/v1/{cityCode}/person")
@RestController
@Api(tags = {"sellers in a city"}, 
				produces="application/json", 
				consumes="application/vnd.market-scan.v1+json", 
				protocols="http")
public class PersonRestController {

	private static final Logger logger = LoggerFactory.getLogger(PersonRestController.class);
	
	@Autowired
	PersonService personService;

	@RequestMapping(method = RequestMethod.POST, consumes = {MarketScanApplicationConstants.ACCEPTED_CONTENT_TYPE_VERSION_1 },produces={"application/json"})
	@ApiOperation(value = "Saves a seller", notes = "would return a payload stating the transaction status")
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "successful response"),
			@ApiResponse(code = 500, message = "Something went wrong!") })
	public ResponseEntity<List<ProductResource>> register(@PathVariable("cityCode") String cityCode, @RequestBody Person input) {
		logger.debug("create person method called");
		// provide all path parameters
		Person person = personService.save(input);
		HttpHeaders httpHeaders = new HttpHeaders();
        Link forOnePerson = new PersonResource(person).getLink("self");
        httpHeaders.setLocation(URI.create(forOnePerson.getHref()));
        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
	}

}

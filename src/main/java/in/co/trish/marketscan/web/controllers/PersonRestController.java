package in.co.trish.marketscan.web.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import in.co.trish.marketscan.application.MarketScanApplicationConstants;
import in.co.trish.marketscan.persistence.entities.Person;
import in.co.trish.marketscan.web.exception.MarketScanBadRequestException;
import in.co.trish.marketscan.web.representation.read.PersonResource;
import in.co.trish.marketscan.web.representation.read.ProductResource;
import in.co.trish.marketscan.web.services.CityService;
import in.co.trish.marketscan.web.services.PersonService;
import in.co.trish.marketscan.web.services.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping(value = "/v1/{cityCode}/person")
@ExposesResourceFor(PersonResource.class)
@RestController
@Transactional
@Api(tags = {"sellers in a city"}, produces = "application/json", protocols = "http", consumes="application/json")
public class PersonRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonRestController.class);
	
	@Autowired
	PersonService personService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	CityService cityService;
	
	@RequestMapping(method = RequestMethod.POST, produces = {"application/json"}, consumes="application/json")
	@ApiOperation(value = "Registers a person", notes = "would return a payload stating the transaction status")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "successful response"), @ApiResponse(code = 500, message = "Something went wrong!")})
	public ResponseEntity<Void> register(@PathVariable("cityCode") String cityCode, @RequestBody(required = true) Person personPayload, @RequestParam(required = true) @ApiParam(value = "Is this a seller?", required = true, defaultValue = "false", allowableValues = "true, false", example = "true") boolean isSeller) {
		
		logger.debug("create person method called");
		
		//temp code
		if(personPayload.getIpAddress()== null){
			throw new MarketScanBadRequestException("Ipaddress is missing");
		}
		
		// provide all path parameters
		personPayload.setRole(roleService.findByCode((isSeller) ? "S" : "B"));
		Person person = personService.save(cityService.findByCode(cityCode), personPayload);
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(person.getId()).toUri());
		
		// TODO: Implement like https://spring.io/guides/tutorials/bookmarks/
		//		HttpHeaders httpHeaders = new HttpHeaders();
		//        Link forOneBookmark = new PersonResource(person).getLink("self");
		//        httpHeaders.setLocation(URI.create(forOneBookmark.getHref()));
		
		return new ResponseEntity<Void>(httpHeaders, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = {MarketScanApplicationConstants.ACCEPTED_CONTENT_TYPE_VERSION_1}, produces = {"application/json"})
	@ApiOperation(value = "Saves a seller", notes = "would return a payload stating the transaction status")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "successful response"), @ApiResponse(code = 500, message = "Something went wrong!")})
	public ResponseEntity<List<ProductResource>> getSellers(@PathVariable("cityCode") String cityCode) {
		
		logger.debug("Retrieving all sellers within a city");
		//		Collection<Person> persons = personService.findAllSellers();
		return null;
	}
	
}

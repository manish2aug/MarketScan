package in.co.trish.marketscan.web.controllers;

import java.util.Collection;
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
import in.co.trish.marketscan.persistence.entities.Offer;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.web.representation.assembler.OfferResourceAssembler;
import in.co.trish.marketscan.web.representation.read.OfferReadResource;
import in.co.trish.marketscan.web.services.OffersService;
import in.co.trish.marketscan.web.services.ProductService;

@RequestMapping(value = "/v1/{cityCode}/products/{productId}/offers")
@RestController
public class OfferRestController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	OffersService offerService;
	
	@Autowired
	OfferResourceAssembler assembler;
	
	@RequestMapping(method = RequestMethod.GET, consumes = {MarketScanApplicationConstants.ACCEPTED_CONTENT_TYPE_VERSION_1})
	public ResponseEntity<List<OfferReadResource>> retrieveBestOffersInMarket(@RequestParam(name = "distance", required = true, defaultValue = "0") String searchString, @PathVariable("cityCode") String cityCode, @PathVariable("productId") int productId) {
		// TODO: At the same time save this search to search history 
		// provide all path parameters
		assembler.pathParameters.add(cityCode);
		assembler.pathParameters.add(productId);
		Product product = productService.findById(productId);
		Collection<Offer> offers = offerService.retrieveBestOffersInMarket(product);
		List<OfferReadResource> offerComparisonResources = assembler.toResources(offers);
		if (offerComparisonResources.isEmpty()) {
			return new ResponseEntity<List<OfferReadResource>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<OfferReadResource>>(offerComparisonResources, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = {MarketScanApplicationConstants.ACCEPTED_CONTENT_TYPE_VERSION_1}, path={"/{offerId}"})
	public ResponseEntity<OfferReadResource> getOfferDetails(
			@RequestParam(name = "distance", required = true, defaultValue = "0") String searchString, 
			@PathVariable("cityCode") String cityCode, 
			@PathVariable("productId") int productId,
			@PathVariable("offerId") int offerId
			) {
		// TODO: At the same time save this to user view history 
		// provide all path parameters
		assembler.pathParameters.add(cityCode);
		assembler.pathParameters.add(productId);
		Offer offers = offerService.getOffer(offerId);
		OfferReadResource offerComparisonResource = assembler.toResource(offers);
		if (null == offerComparisonResource) {
			return new ResponseEntity<OfferReadResource>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<OfferReadResource>(offerComparisonResource, HttpStatus.OK);
	}
	
	
}

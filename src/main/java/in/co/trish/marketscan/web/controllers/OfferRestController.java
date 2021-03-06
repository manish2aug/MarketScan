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
import in.co.trish.marketscan.web.assemblers.OfferDetailResourceAssembler;
import in.co.trish.marketscan.web.assemblers.OfferResourceAssembler;
import in.co.trish.marketscan.web.resources.read.OfferDetailReadResource;
import in.co.trish.marketscan.web.resources.read.OfferReadResource;
import in.co.trish.marketscan.web.services.OffersService;
import in.co.trish.marketscan.web.services.ProductService;
import io.swagger.annotations.ApiParam;

@RequestMapping(value = "/v1/{cityCode}/products/{productId}/offers")
@RestController
public class OfferRestController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	OffersService offerService;
	
	@Autowired
	OfferResourceAssembler offerAssembler;
	
	@Autowired
	OfferDetailResourceAssembler offerDetailAssembler;
	
	@RequestMapping(method = RequestMethod.GET, consumes = {MarketScanApplicationConstants.ACCEPTED_CONTENT_TYPE_VERSION_1})
	public ResponseEntity<List<OfferReadResource>> retrieveBestOffersInMarket(
			
			// User's information 
			@RequestParam(name = "imeiNo", required = true, defaultValue = "00000000") @ApiParam(value = "User's request initiating device's IMEI no", required = true) String imeiNo, 
			@RequestParam(name = "latitude", required = true, defaultValue = "00.000000") @ApiParam(value = "User's requesting initiating device's location GPS coordinate, Latitude (precision value =10 and scale = 7)", required = true) double latitude, 
			@RequestParam(name = "longitude", required = true, defaultValue = "00.000000") @ApiParam(value = "User's requesting initiating device's location GPS coordinate, Longitude (precision value =10 and scale = 7)", required = true) double longitude, 
			@RequestParam(name = "ipAddr", required = true, defaultValue = "000.000.000.000") @ApiParam(value = "User's requesting initiating device's IP address", required = true) String ipAddr, 
			@RequestParam(name = "macAddr", required = true, defaultValue = "00-00-00-00-00-00") @ApiParam(value = "User's requesting initiating device's mac address", required = true) String macAddr, 
			@RequestParam(name = "deviceId", required = true, defaultValue = "0000000000") @ApiParam(value = "User's requesting mmobile/tablet initiating device id", required = true) String deviceId, 
			@RequestParam(name = "mobileNo", required = true, defaultValue = "0000000000") @ApiParam(value = "User's mobile no", required = true) String mobileNo, 
			// other required parameters to process the request 
			@RequestParam(name = "distance", required = true, defaultValue = "0.00") @ApiParam(value = "Radial distance in which search should be done", required = true) String searchString, 
			@PathVariable("cityCode") @ApiParam(value = "Search string contained in product name", required = true) String cityCode, 
			@PathVariable("productId") @ApiParam(value = "Search string contained in product name", required = true) int productId
			) {
		
		// TODO: At the same time save this search to search history 
		// searchHistoryService.save(all parameters to be saved);
		
		// provide all necessary value to assembler 
		offerAssembler.pathParameters.add(cityCode);
		offerAssembler.pathParameters.add(productId);
		offerAssembler.userLatitude = latitude;
		offerAssembler.userLongitude = longitude;
		
		Product product = productService.find(productId);
		
		Collection<Offer> offers = offerService.retrieveBestOffersInMarket(product);
		List<OfferReadResource> offerComparisonResources = offerAssembler.toResources(offers);
		
		if (offerComparisonResources.isEmpty()) {
			return new ResponseEntity<List<OfferReadResource>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<OfferReadResource>>(offerComparisonResources, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = {MarketScanApplicationConstants.ACCEPTED_CONTENT_TYPE_VERSION_1}, path={"/{offerId}"})
	public ResponseEntity<OfferDetailReadResource> getOfferDetails(

			// User's information 
			@RequestParam(name = "imeiNo", required = true, defaultValue = "00000000") @ApiParam(value = "User's request initiating device's IMEI no", required = true) String imeiNo, 
			@RequestParam(name = "latitude", required = true, defaultValue = "00.000000") @ApiParam(value = "User's requesting initiating device's location GPS coordinate, Latitude (precision value =10 and scale = 7)", required = true) double latitude, 
			@RequestParam(name = "longitude", required = true, defaultValue = "00.000000") @ApiParam(value = "User's requesting initiating device's location GPS coordinate, Longitude (precision value =10 and scale = 7)", required = true) double longitude, 
			@RequestParam(name = "ipAddr", required = true, defaultValue = "000.000.000.000") @ApiParam(value = "User's requesting initiating device's IP address", required = true) String ipAddr, 
			@RequestParam(name = "macAddr", required = true, defaultValue = "00-00-00-00-00-00") @ApiParam(value = "User's requesting initiating device's mac address", required = true) String macAddr, 
			@RequestParam(name = "deviceId", required = true, defaultValue = "0000000000") @ApiParam(value = "User's requesting mmobile/tablet initiating device id", required = true) String deviceId, 
			@RequestParam(name = "mobileNo", required = true, defaultValue = "0000000000") @ApiParam(value = "User's mobile no", required = true) String mobileNo, 
			// other required parameters to process the request 
			@PathVariable("cityCode") @ApiParam(value = "Search string contained in product name", required = true) String cityCode, 
			@PathVariable("productId") @ApiParam(value = "Search string contained in product name", required = true) int productId,
			@PathVariable("offerId") @ApiParam(value = "offer id", required = true) int offerId) {
		
		// TODO: At the same time save this to user view history 
		// provide all path parameters
		offerDetailAssembler.pathParameters.add(cityCode);
		offerDetailAssembler.pathParameters.add(productId);
		offerDetailAssembler.userLatitude = latitude;
		offerDetailAssembler.userLongitude = longitude;
		
		Offer offers = offerService.getOffer(offerId);
		
		OfferDetailReadResource offerComparisonResource = offerDetailAssembler.toResource(offers);
		if (null == offerComparisonResource) {
			return new ResponseEntity<OfferDetailReadResource>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<OfferDetailReadResource>(offerComparisonResource, HttpStatus.OK);
	}
	
	
}

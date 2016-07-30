package in.co.trish.marketscan.web.assemblers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import in.co.trish.marketscan.application.MarketScanUtils;
import in.co.trish.marketscan.persistence.entities.Offer;
import in.co.trish.marketscan.persistence.entities.Person;
import in.co.trish.marketscan.persistence.entities.Review;
import in.co.trish.marketscan.web.controllers.OfferRestController;
import in.co.trish.marketscan.web.resources.read.OfferReadResource;

@Component
public class OfferResourceAssembler extends ResourceAssemblerSupport<Offer, OfferReadResource> {

	public List<Object> pathParameters = new ArrayList<>();
	public double userLatitude;
	public double userLongitude;

	public OfferResourceAssembler() {
		super(OfferRestController.class, OfferReadResource.class);
	}

	@Override
	public OfferReadResource toResource(Offer offer) {
		OfferReadResource representation = instantiateResource(offer);
		prepareRepresentationData(offer, representation);
		representation.add(ControllerLinkBuilder.linkTo(OfferRestController.class, pathParameters.toArray()).slash(offer.getId()).withSelfRel());
		return representation;
	}

	/**
	 * Copy data from entity to make it available on view
	 * 
	 * @param item
	 * @param representation
	 */
	private void prepareRepresentationData(Offer offer, OfferReadResource representation) {
		representation.price = offer.getPrice();
		Person seller = offer.getSeller();
		representation.isDeliveryAvailable = seller.isDeliveryAvailable();
		representation.rating = retrieveRating(offer);
		representation.distance = MarketScanUtils.distanceInMeter(seller.getLattitude(), seller.getLongitude(), userLatitude, userLongitude);
	}

	private int retrieveRating(Offer offer) {
		Collection<Review> reviews = offer.getSeller().getReviews();
		int rating = 0;
		for (Review sellerReview : reviews) {
			rating =rating + sellerReview.getOverallRating();
		}
		if(reviews.size() == 0)
			return 0;
		return rating/reviews.size();
	}

}

package in.co.trish.marketscan.web.representation.assembler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import in.co.trish.marketscan.persistence.entities.Offer;
import in.co.trish.marketscan.web.controllers.OfferRestController;
import in.co.trish.marketscan.web.representation.read.OfferReadResource;

@Component
public class OfferResourceAssembler extends ResourceAssemblerSupport<Offer, OfferReadResource> {

	public List<Object> pathParameters = new ArrayList<>();

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
		representation.distance = calculateDistance();
		representation.rating = retrieveRating();
		representation.isDeliveryAvailable = offer.getSeller().isDeliveryAvailable();
	}

	private int retrieveRating() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double calculateDistance() {
		// TODO: compute the distance
		return 0;
	}

}

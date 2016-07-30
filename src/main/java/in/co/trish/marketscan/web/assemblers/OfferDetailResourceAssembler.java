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
import in.co.trish.marketscan.web.resources.read.OfferDetailReadResource;

@Component
public class OfferDetailResourceAssembler extends ResourceAssemblerSupport<Offer, OfferDetailReadResource> {
	
	public List<Object> pathParameters = new ArrayList<>();
	public double userLatitude;
	public double userLongitude;
	
	public OfferDetailResourceAssembler() {
		super(OfferRestController.class, OfferDetailReadResource.class);
	}
	
	@Override
	public OfferDetailReadResource toResource(Offer offer) {
		OfferDetailReadResource representation = instantiateResource(offer);
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
	private void prepareRepresentationData(Offer offer, OfferDetailReadResource representation) {
		
		// populate offer details
		representation.price = offer.getPrice();
		Person seller = offer.getSeller();
		representation.sellerName = seller.getFullName();
		representation.sellerEmailAddress = seller.getEmailAddress();
		representation.isDeliveryAvailable = seller.isDeliveryAvailable();
		representation.distance = MarketScanUtils.distanceInMeter(seller.getLattitude(), seller.getLongitude(), userLatitude, userLongitude);
		
		// populate seller's details
		StringBuilder temp = new StringBuilder();
		representation.sellerAddress = temp.append(seller.getShopName())
								.append("\n").append(seller.getPhysicalAddressLine1()).append(", ").append(seller.getPhysicalAddressLine2())
								.append("\n").append(seller.getSubLocality()).append(", ").append(seller.getLocality()).append(", ").append(seller.getTown())
								.append("\n").append(seller.getPinCode()).toString(); 
		temp.setLength(0);
		representation.sellerGpsLocation = temp.append(seller.getLattitude()).append(", ").append(seller.getLongitude()).toString();
		temp.setLength(0);
		representation.sellerContactDetails = temp.append("Phone: ").append(seller.getMobileNo()).append("(Business)").append(((!seller.getLandlineNo().isEmpty()) ? ", "+seller.getLandlineNo():"")).toString();
		
		Collection<Review> reviews = seller.getReviews();
		temp.setLength(0);
		setRatingAndReviews(reviews,temp,representation);
	}
	
	private void setRatingAndReviews(Collection<Review> reviews, StringBuilder temp, OfferDetailReadResource representation) {
		int rating = 0;
		int i=0;
		for (Review sellerReview : reviews) {
			rating =rating + sellerReview.getOverallRating();
			if(i==1){
				temp.append(" \n ");
			}
			if(i<2){
				temp.append("'").append(sellerReview.getComment()).append("'").append(" Rating out of 5: ").append(sellerReview.getOverallRating()).append(" - ").append(sellerReview.getReviewer().getFullName());
			}
			i++;
		}
		
		representation.rating = (reviews.size() == 0)?0:rating/reviews.size();
		representation.reviews = temp.toString();
		temp.setLength(0);
	}
}

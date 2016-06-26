package in.co.trish.marketscan.web.representation.assembler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import in.co.trish.marketscan.persistence.entities.Offer;
import in.co.trish.marketscan.persistence.entities.Person;
import in.co.trish.marketscan.persistence.entities.SellerReview;
import in.co.trish.marketscan.web.controllers.OfferRestController;
import in.co.trish.marketscan.web.representation.read.OfferDetailReadResource;

@Component
public class OfferDetailResourceAssembler extends ResourceAssemblerSupport<Offer, OfferDetailReadResource> {
	
	public List<Object> pathParameters = new ArrayList<>();
	
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
	 * @param res
	 */
	private void prepareRepresentationData(Offer offer, OfferDetailReadResource res) {
		// populate seller's details
		Person seller = offer.getSeller();
		res.isDeliveryAvailable = seller.isDeliveryAvailable();
		StringBuilder temp = new StringBuilder();
		res.sellerAddress = temp.append(seller.getShopName())
								.append("\n").append(seller.getPhysicalAddressLine1()).append(", ").append(seller.getPhysicalAddressLine2())
								.append("\n").append(seller.getSubLocality()).append(", ").append(seller.getLocality()).append(", ").append(seller.getTown())
								.append("\n").append(seller.getPinCode()).toString(); 
		temp.setLength(0);
		res.sellerGpsLocation = temp.append(seller.getLattitude()).append(", ").append(seller.getLongitude()).toString();
		temp.setLength(0);
		res.sellerContactDetails = temp.append("Phone: ").append(seller.getMobileNo()).append("(Business)").append(((!seller.getLandlineNo().isEmpty()) ? ", "+seller.getLandlineNo():"")).toString();
		
		Collection<SellerReview> reviews = seller.getReviews();
		temp.setLength(0);
		int i=0;
		for (SellerReview sellerReview : reviews) {
			if(i==1){
				temp.append(" \n ");
			}
			temp.append("\"").append(sellerReview.getComment()).append("\"").append(" Rating out of 5: ").append(sellerReview.getOverallRating()).append(" - ").append(sellerReview.getReviewer().getFullName());
			if(i==1) break;
			i++;
		}
	}
	
	
}

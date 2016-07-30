package in.co.trish.marketscan.web.resources.read;

import org.springframework.hateoas.ResourceSupport;

public class OfferReadResource extends ResourceSupport{
	
	public String price;
	public double distance;
	public int rating;
	public boolean isDeliveryAvailable;
}

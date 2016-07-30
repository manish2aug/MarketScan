package in.co.trish.marketscan.web.resources.read;

import java.math.BigDecimal;

import org.springframework.hateoas.ResourceSupport;

public class MarketReadResource extends ResourceSupport{
	
	public BigDecimal price;
	public double distance;
	public int rating;
	public boolean deliveryAvailability;
}

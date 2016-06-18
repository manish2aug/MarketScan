package in.co.trish.marketscan.web.representation.read;

import java.math.BigDecimal;

import org.springframework.hateoas.ResourceSupport;

public class MarketComparisonReadResource extends ResourceSupport{
	
	public BigDecimal price;
	public double distance;
	public int rating;
	public boolean deliveryAvailability;
}

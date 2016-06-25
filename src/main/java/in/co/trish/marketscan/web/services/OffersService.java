package in.co.trish.marketscan.web.services;

import java.util.Collection;

import in.co.trish.marketscan.persistence.entities.Offer;
import in.co.trish.marketscan.persistence.entities.Product;

public interface OffersService {

	Collection<Offer> retrieveBestOffersInMarket(Product product);

}
package in.co.trish.marketscan.web.services.implementations;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.co.trish.marketscan.persistence.entities.Offer;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.persistence.repositories.OfferRepository;
import in.co.trish.marketscan.web.services.OffersService;

@Service("offersComparisonService")
@Transactional
public class OffersComparisonServiceImpl implements OffersService {

	@Autowired
	private OfferRepository offerRrepository;
	
	@Override
	public Collection<Offer> retrieveBestOffersInMarket(Product product) {
		return offerRrepository.findTop5ByProductOrderByPrice(product);
	}

}
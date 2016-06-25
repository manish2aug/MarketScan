package in.co.trish.marketscan.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.Offer;
import in.co.trish.marketscan.persistence.entities.Product;

public interface OfferRepository extends JpaRepository<Offer, Integer> {
	
	List<Offer> findTop5ByProductOrderByPrice(Product product);
	
}

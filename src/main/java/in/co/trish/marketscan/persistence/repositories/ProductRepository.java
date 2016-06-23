package in.co.trish.marketscan.persistence.repositories;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.Brand;
import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByNameIgnoreCaseContainingAndCitiesInAndBrandsIn(String searchString, City[] cities, Collection<Brand> brands);
	List<Product> findByCitiesIn(HashSet<City> cities);
	List<Product> findByBrandsIn(HashSet<Brand> brands);
}

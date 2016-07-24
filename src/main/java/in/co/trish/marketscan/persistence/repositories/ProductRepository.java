package in.co.trish.marketscan.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>, JpaSpecificationExecutor<Product> {

	List<Product> findByNameIgnoreCaseContainingAndCity(String searchString, City city);

	List<Product> findByNameIgnoreCaseContaining(String searchString, City city);

}

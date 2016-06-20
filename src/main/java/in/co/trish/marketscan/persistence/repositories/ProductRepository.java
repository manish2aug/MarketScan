package in.co.trish.marketscan.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByNameIgnoreCaseContaining(String searchString);
}

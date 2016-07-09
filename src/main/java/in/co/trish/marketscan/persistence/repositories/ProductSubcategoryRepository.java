package in.co.trish.marketscan.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.ProductSubcategory;

public interface ProductSubcategoryRepository extends JpaRepository<ProductSubcategory, Integer> {
	ProductSubcategory findByCode(String code);
}

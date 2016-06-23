package in.co.trish.marketscan.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	Brand findByCode(String code);
}

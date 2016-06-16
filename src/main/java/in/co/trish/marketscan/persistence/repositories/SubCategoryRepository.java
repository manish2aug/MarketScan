package in.co.trish.marketscan.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {

}

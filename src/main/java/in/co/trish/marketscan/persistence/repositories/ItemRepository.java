package in.co.trish.marketscan.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

	List<Item> findByNameEnglishContaining(String searchString);
}

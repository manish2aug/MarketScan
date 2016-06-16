package in.co.trish.marketscan.persistence.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Serializable> {

	List<Item> findByNameEnglishContaining(String searchString);
}

package in.co.trish.marketscan.persistence.repositories;

import in.co.trish.marketscan.persistence.entities.Item;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Serializable> {

}

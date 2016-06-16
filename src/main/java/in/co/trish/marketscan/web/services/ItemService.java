package in.co.trish.marketscan.web.services;

import in.co.trish.marketscan.persistence.entities.Item;

import java.util.List;

public interface ItemService {

    List<Item> findAll();
    List<Item> findAll(String searchString);

}
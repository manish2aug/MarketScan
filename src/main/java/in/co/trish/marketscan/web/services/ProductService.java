package in.co.trish.marketscan.web.services;

import in.co.trish.marketscan.persistence.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
    List<Product> findAll(String searchString);

}
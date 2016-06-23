package in.co.trish.marketscan.web.services;

import java.util.Collection;
import java.util.List;

import in.co.trish.marketscan.persistence.entities.Brand;
import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Product;

public interface ProductService {

	List<Product> findAll();

	List<Product> findAll(String searchString, City[] cities, Collection<Brand> brands);

}
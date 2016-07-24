package in.co.trish.marketscan.web.services;

import java.util.List;

import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.web.representation.read.ProductSearchCriteria;

public interface ProductService {
	
	List<Product> findMatchingProductsInCity(String searchString, City city);

	Product find(int productId);

	Product addProduct(String cityCode, Product product);

	List<Product> findProductsByCriteria(ProductSearchCriteria criteria);
}
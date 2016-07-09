package in.co.trish.marketscan.web.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.persistence.repositories.ProductRepository;
import in.co.trish.marketscan.web.services.ProductService;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

	// for saving item using auto generated no, eg. counter.incrementAndGet()
	// private static final AtomicLong counter = new AtomicLong();

	@Autowired
	private ProductRepository repository;

	@Override
	public List<Product> findMatchingProductsInCity(String searchString, City city) {
		return repository.findByNameIgnoreCaseContainingAndCity(searchString, city);
	}
	
	@Override
	public Product find(int productId) {
		return repository.findOne(productId);
	}
	
	@Override
	public Product add(City city, Product product) {
		product.setCity(city);
		return repository.saveAndFlush(product);
	}
	
	
	
}

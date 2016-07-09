package in.co.trish.marketscan.web.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.co.trish.marketscan.persistence.entities.Brand;
import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.persistence.entities.ProductSubcategory;
import in.co.trish.marketscan.persistence.entities.Unit;
import in.co.trish.marketscan.persistence.repositories.BrandRepository;
import in.co.trish.marketscan.persistence.repositories.CityRepository;
import in.co.trish.marketscan.persistence.repositories.ProductRepository;
import in.co.trish.marketscan.persistence.repositories.ProductSubcategoryRepository;
import in.co.trish.marketscan.persistence.repositories.UnitRepository;
import in.co.trish.marketscan.web.services.ProductService;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

	// for saving item using auto generated no, eg. counter.incrementAndGet()
	// private static final AtomicLong counter = new AtomicLong();

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private BrandRepository brandRepository;
	
	@Autowired
	private ProductSubcategoryRepository productSubcategoryRepository;
	
	@Autowired
	private UnitRepository unitRepository;
	
	@Override
	public List<Product> findMatchingProductsInCity(String searchString, City city) {
		return productRepository.findByNameIgnoreCaseContainingAndCity(searchString, city);
	}
	
	@Override
	public Product find(int productId) {
		return productRepository.findOne(productId);
	}
	
	@Override
	public Product addProduct(String cityCode, Product product) {
		
		// Add city
		City city = cityRepository.findByCode(cityCode);
		product.setCity(city);
		// Add brand
		Brand brand = brandRepository.findByCode(product.getBrand().getCode());
		product.setBrand(brand);
		// Add product sub category
		ProductSubcategory productSubcategory = productSubcategoryRepository.findByCode(product.getSubCategory().getCode());
		product.setSubCategory(productSubcategory);
		// Add unit
		Unit unit = unitRepository.findByCode(product.getUnit().getCode());
		product.setUnit(unit);
		
		return productRepository.saveAndFlush(product);
	}
	
	
	
}

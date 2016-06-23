package in.co.trish.marketscan.web.services.implementations;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.co.trish.marketscan.persistence.entities.Brand;
import in.co.trish.marketscan.persistence.repositories.BrandRepository;
import in.co.trish.marketscan.web.services.BrandService;

@Service("brandService")
@Transactional
public class BrandServiceImpl implements BrandService {

	// for saving item using auto generated no, eg. counter.incrementAndGet()
	// private static final AtomicLong counter = new AtomicLong();

	@Autowired
	private BrandRepository repository;

	@Override
	public Brand findByCode(String code) {
		return repository.findByCode(code);
	}

	@Override
	public Collection<Brand> findAll() {
		return repository.findAll();
	}

}

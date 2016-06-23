package in.co.trish.marketscan.web.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.repositories.CityRepository;
import in.co.trish.marketscan.web.services.CityService;

@Service("cityService")
@Transactional
public class CityServiceImpl implements CityService {

	// for saving item using auto generated no, eg. counter.incrementAndGet()
	// private static final AtomicLong counter = new AtomicLong();

	@Autowired
	private CityRepository repository;

	@Override
	public City findByCode(String code) {
		return repository.findByCode(code);
	}

}

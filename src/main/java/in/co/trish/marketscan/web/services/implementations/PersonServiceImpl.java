package in.co.trish.marketscan.web.services.implementations;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Person;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.persistence.repositories.PersonRepository;
import in.co.trish.marketscan.web.services.PersonService;

@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService {

	// for saving item using auto generated no, eg. counter.incrementAndGet()
	// private static final AtomicLong counter = new AtomicLong();

	@Autowired
	private PersonRepository repository;

	@Override
	public Person save(Person person) {
		return repository.save(person);		
	}
	
	@Override
	public List<Person> findAll() {
		return repository.findAll();		
	}
	
	@Override
	public Person find(int id) {
		return repository.getOne(id);
	}

	@Override
	public Collection<Person> findAllSellers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person saveSeller(City city, Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person updateSeller(City city, Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Person> FindAllSeller(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Person> FindAllSellerByPinCode(String pinCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Person> FindAllPersonsWhoSearchedFor(City city, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Person> FindAllSellersByProduct(City city, Product product) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

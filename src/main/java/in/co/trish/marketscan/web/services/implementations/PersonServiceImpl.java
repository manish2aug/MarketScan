package in.co.trish.marketscan.web.services.implementations;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Person;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.persistence.entities.Role;
import in.co.trish.marketscan.persistence.repositories.PersonRepository;
import in.co.trish.marketscan.web.exception.MarketScanBadRequestException;
import in.co.trish.marketscan.web.services.PersonService;

@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository repository;

	@Override
	public List<Person> FindAllPersons(City city, Role role) {
		return repository.findAll();
	}

	@Override
	public Person FindPerson(int id) {
		return repository.getOne(id);
	}

	@Override
	public Person save(City city, Person person) {
		person.setCity(city);
		return repository.save(person);
	}

	@Override
	public Person update(City city, Person person) {
		if (person.getId() == null) {
			throw new MarketScanBadRequestException("");
		}
		return save(city, person);
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

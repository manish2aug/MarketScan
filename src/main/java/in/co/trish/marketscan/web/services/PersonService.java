package in.co.trish.marketscan.web.services;

import java.util.Collection;
import java.util.List;

import in.co.trish.marketscan.persistence.entities.Person;

public interface PersonService {
	
	Person save(Person person);

	Person find(int id);

	List<Person> findAll();

	Collection<Person> findAllSellers();
}
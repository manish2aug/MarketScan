package in.co.trish.marketscan.web.services;

import java.util.Collection;
import java.util.List;

import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Person;
import in.co.trish.marketscan.persistence.entities.Product;

public interface PersonService {
	
	// Add a new seller
	Person saveSeller(City city, Person person);

	// Update a new seller
	Person updateSeller(City city, Person person);
	
	// Find all sellers in a city
	Collection<Person> FindAllSeller(City city);
	
	// Find all sellers by pin code
	Collection<Person> FindAllSellerByPinCode(String pinCode);
	
	// Find all persons who searched a particular item in a city
	Collection<Person> FindAllPersonsWhoSearchedFor(City city, Product product);
	
	// Find all sellers who are selling a particular item in a city
	Collection<Person> FindAllSellersByProduct(City city, Product product);
	
	Person save(Person person);

	Person find(int id);

	List<Person> findAll();

	Collection<Person> findAllSellers();
}
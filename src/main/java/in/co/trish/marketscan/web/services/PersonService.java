package in.co.trish.marketscan.web.services;

import java.util.Collection;

import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Person;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.persistence.entities.Role;

public interface PersonService {
	
	/**
	 * Add a new user (Buyer\Seller)
	 * 
	 * @param city - City in which user needs to be created
	 * @param person - person pay-load
	 * @return Newly added person
	 */
	Person save(City city, Person person);

	/**
	 * Update an user (Buyer\Seller)
	 * 
	 * @param city - City, the user belongs to
	 * @param person - person pay-load with updated information
	 * @return updated person 
	 */
	Person update(City city, Person person);
	
	/**
	 * Find all persons in a city
	 * 
	 * @param city - City, the user belongs to
	 * @return 
	 */
	Collection<Person> FindAllPersons(City city, Role role);
	
	/**
	 * Find all persons who searched a particular product in a city
	 * 
	 * @param city
	 * @param product
	 * @return
	 */
	Collection<Person> FindAllPersonsWhoSearchedFor(City city, Product product);
	
	/**
	 * Find all sellers who are selling a particular item in a city
	 * 
	 * @param city
	 * @param product
	 * @return
	 */
	Collection<Person> FindAllSellersByProduct(City city, Product product);
	
	/**
	 * Find any user
	 * 
	 * @param city
	 * @return
	 */
	Person FindPerson(int id);
	
}
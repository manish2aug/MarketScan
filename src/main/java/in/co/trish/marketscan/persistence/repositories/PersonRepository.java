package in.co.trish.marketscan.persistence.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.City;
import in.co.trish.marketscan.persistence.entities.Person;
import in.co.trish.marketscan.persistence.entities.Role;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	Collection<Person> findByCityAndRole(City city, Role role);
	Collection<Person> findByCityAndTown(City city, String town);
	Collection<Person> findByCityAndLocality(City city, String locality);
	Collection<Person> findByCityAndSubLocality(City city, String subLocality);
	
	
}

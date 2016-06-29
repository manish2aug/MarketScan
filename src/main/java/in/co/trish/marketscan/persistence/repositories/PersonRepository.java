package in.co.trish.marketscan.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}

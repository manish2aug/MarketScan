package in.co.trish.marketscan.web.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.co.trish.marketscan.persistence.entities.Person;
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
	
}

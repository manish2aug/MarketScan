package in.co.trish.marketscan.web.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.co.trish.marketscan.persistence.entities.Person;


public class PersonValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Person.class.equals(clazz);
	}
	
	@Override
	public void validate(Object obj, Errors e) {
//		ValidationUtils.rejectIfEmpty(e, "emailAddress", "emailAddress.empty");
//        Person p = (Person) obj;
        
//        if (p.getAge() < 0) {
//            e.rejectValue("age", "negativevalue");
//        } else if (p.getAge() > 110) {
//            e.rejectValue("age", "too.darn.old");
//        }		
	}
	
}

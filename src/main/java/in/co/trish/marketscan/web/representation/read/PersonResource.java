package in.co.trish.marketscan.web.representation.read;

import org.springframework.hateoas.ResourceSupport;

import in.co.trish.marketscan.persistence.entities.Person;

public class PersonResource extends ResourceSupport {

	public final Person person;

	public PersonResource(Person person) {
		this.person = person;
		// this.add(new Link(person.getUri(), "bookmark-uri"));
		// this.add(linkTo(BookmarkRestController.class,
		// username).withRel("bookmarks"));
		// this.add(linkTo(methodOn(BookmarkRestController.class,
		// username).readBookmark(username, person.getId())).withSelfRel());
	}

}

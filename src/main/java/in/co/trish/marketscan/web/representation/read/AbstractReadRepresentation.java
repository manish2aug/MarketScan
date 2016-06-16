package in.co.trish.marketscan.web.representation.read;

import org.springframework.hateoas.ResourceSupport;

public abstract class AbstractReadRepresentation<E> extends ResourceSupport {
	
	public abstract void AbstractReadRepresentation(E e);
}

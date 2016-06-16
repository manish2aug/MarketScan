package in.co.trish.marketscan.web.representation.read;

import org.springframework.hateoas.ResourceSupport;

import in.co.trish.marketscan.persistence.entities.Item;

public class ItemReadRepresentation extends ResourceSupport {

	private String name;
	private String category;
	private int id;
	
	public ItemReadRepresentation(){}
	
	public ItemReadRepresentation(Item item) {
		this.name = item.getNameEnglish();
		this.category = item.getSubCategory().getNameEnglish();
		this.id = item.getId();
	}

}

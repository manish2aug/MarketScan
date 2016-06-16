package in.co.trish.marketscan.web.representation.read;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;

import in.co.trish.marketscan.persistence.entities.Item;

public class ItemReadRepresentation extends ResourceSupport {

	private String name;
	private String category;
	public int pk;

	@JsonCreator
	public ItemReadRepresentation(Item item) {
		this.name = item.getNameEnglish();
		this.category = item.getSubCategory().getNameEnglish();
		this.pk = item.getId();
	}

	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}

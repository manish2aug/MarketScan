package in.co.trish.marketscan.web.representation.assembler;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import in.co.trish.marketscan.persistence.entities.Item;
import in.co.trish.marketscan.web.controllers.ItemRestController;
import in.co.trish.marketscan.web.representation.read.ItemReadRepresentation;

public class ItemResourceAssembler extends ResourceAssemblerSupport<Item, ItemReadRepresentation> {

	Object[] pathParameters;
	public ItemResourceAssembler(Object...objects) {
		super(ItemRestController.class, ItemReadRepresentation.class);
		pathParameters = objects;
	}

	@Override
	public ItemReadRepresentation toResource(Item item) {
		ItemReadRepresentation representation = createResourceWithId(item.getId(), item,pathParameters);
		representation.category = item.getSubCategory().getNameEnglish();
		representation.name = item.getNameEnglish();
		System.out.println("Id is :"+item.getId());
		return representation;
	}

}

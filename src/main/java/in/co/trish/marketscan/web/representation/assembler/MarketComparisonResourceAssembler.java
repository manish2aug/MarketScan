package in.co.trish.marketscan.web.representation.assembler;

import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import in.co.trish.marketscan.persistence.entities.Item;
import in.co.trish.marketscan.persistence.entities.SubCategory;
import in.co.trish.marketscan.web.controllers.ItemRestController;
import in.co.trish.marketscan.web.representation.read.ItemReadResource;

@Component
public class MarketComparisonResourceAssembler extends ResourceAssemblerSupport<Item, ItemReadResource> {

	private Object[] pathParameters;

	public MarketComparisonResourceAssembler() {
		super(ItemRestController.class, ItemReadResource.class);
	}

	@Override
	public ItemReadResource toResource(Item item) {
		ItemReadResource representation = instantiateResource(item);
		prepareRepresentationData(item, representation);
		representation.add(ControllerLinkBuilder.linkTo(ItemRestController.class, pathParameters).slash(item.getId())
				.withSelfRel());

		return representation;
	}

	/**
	 * Copy data from entity to make it available on view
	 * 
	 * @param item
	 * @param representation
	 */
	private void prepareRepresentationData(Item item, ItemReadResource representation) {
		SubCategory subCategory = item.getSubCategory();
		representation.availableItem = new StringBuilder(item.getNameEnglish()).append(" IN [")
				.append(subCategory.getNameEnglish()).append(" ").append(subCategory.getCategory().getNameEnglish())
				.append("]").toString();
	}

	public void setPathParameters(Object... pathParameters) {
		this.pathParameters = pathParameters;
	}

}

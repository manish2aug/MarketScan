package in.co.trish.marketscan.web.representation.assembler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.persistence.entities.ProductSubcategory;
import in.co.trish.marketscan.web.controllers.OfferRestController;
import in.co.trish.marketscan.web.controllers.ProductRestController;
import in.co.trish.marketscan.web.representation.read.ProductResource;

@Component
public class ProductResourceAssembler extends ResourceAssemblerSupport<Product, ProductResource> {

	public List<Object> pathParameters = new ArrayList<>();

	public ProductResourceAssembler() {
		super(ProductRestController.class, ProductResource.class);
	}

	@Override
	public ProductResource toResource(Product product) {
		ProductResource representation = instantiateResource(product);
		prepareRepresentationData(product, representation);
		Integer productId = product.getId();
		representation.add(ControllerLinkBuilder.linkTo(ProductRestController.class, pathParameters.toArray())
				.slash(productId).withSelfRel());

		pathParameters.add(productId);
		// add link to price comparison
		representation.add(ControllerLinkBuilder.linkTo(OfferRestController.class, pathParameters.toArray())
				.withRel("offers"));

		return representation;
	}

	/**
	 * Copy data from entity to make it available on view
	 * 
	 * @param item
	 * @param representation
	 */
	private void prepareRepresentationData(Product item, ProductResource representation) {
		ProductSubcategory productSubcategory = item.getSubCategory();
		representation.product = new StringBuilder(item.getName()).append(" IN [").append(productSubcategory.getName())
				.append(" ").append(productSubcategory.getProductCategory().getName()).append("]").toString();
		representation.brand = item.getBrand().getName();
	}

}

//package in.co.trish.marketscan.web.representation.assembler;
//
//import org.springframework.hateoas.mvc.ControllerLinkBuilder;
//import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
//import org.springframework.stereotype.Component;
//
//import in.co.trish.marketscan.persistence.entities.Product;
//import in.co.trish.marketscan.persistence.entities.SubCategory;
//import in.co.trish.marketscan.web.controllers.ProductRestController;
//import in.co.trish.marketscan.web.representation.read.ProductResource;
//
//@Component
//public class MarketComparisonResourceAssembler extends ResourceAssemblerSupport<Product, ProductResource> {
//
//	private Object[] pathParameters;
//
//	public MarketComparisonResourceAssembler() {
//		super(ProductRestController.class, ProductResource.class);
//	}
//
//	@Override
//	public ProductResource toResource(Product item) {
//		ProductResource representation = instantiateResource(item);
//		prepareRepresentationData(item, representation);
//		representation.add(ControllerLinkBuilder.linkTo(ProductRestController.class, pathParameters).slash(item.getId())
//				.withSelfRel());
//
//		return representation;
//	}
//
//	/**
//	 * Copy data from entity to make it available on view
//	 * 
//	 * @param item
//	 * @param representation
//	 */
//	private void prepareRepresentationData(Product item, ProductResource representation) {
//		SubCategory subCategory = item.getSubCategory();
//		representation.availableItem = new StringBuilder(item.getNameEnglish()).append(" IN [")
//				.append(subCategory.getNameEnglish()).append(" ").append(subCategory.getCategory().getNameEnglish())
//				.append("]").toString();
//	}
//
//	public void setPathParameters(Object... pathParameters) {
//		this.pathParameters = pathParameters;
//	}
//
//}

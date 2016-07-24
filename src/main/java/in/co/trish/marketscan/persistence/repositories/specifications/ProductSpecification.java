package in.co.trish.marketscan.persistence.repositories.specifications;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import in.co.trish.marketscan.persistence.entities.Brand;
import in.co.trish.marketscan.persistence.entities.Product;
import in.co.trish.marketscan.web.representation.read.ProductSearchCriteria;

public class ProductSpecification implements Specification<Product> {

	private ProductSearchCriteria criteria;

	public ProductSpecification(ProductSearchCriteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

		List<Predicate> predicates = new ArrayList<>();
		
		if (!StringUtils.isEmpty(criteria.getBrand())) {
			predicates.add(builder.equal(root.<Brand>get("brand").<String>get("name"), criteria.getBrand()));
		}
		if (!StringUtils.isEmpty(criteria.getName())) {
			predicates.add(builder.like(builder.upper(root.<String>get("name")), "%" + criteria.getName().toUpperCase() + "%"));
		}
		if(criteria.getMax_cost() > 0){
			predicates.add(builder.lessThanOrEqualTo(root.join("offers").<Long>get("price"), criteria.getMax_cost()));
		}
		
		query.distinct(true);
		return builder.and(predicates.toArray(new Predicate[]{}));
	}

}

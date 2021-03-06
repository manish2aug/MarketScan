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
import in.co.trish.marketscan.persistence.entities.Offer;
import in.co.trish.marketscan.web.criterias.OfferSearchCriteria;

public class OfferSpecification implements Specification<Offer> {
	
	private OfferSearchCriteria criteria;
	
	public OfferSpecification(OfferSearchCriteria criteria) {
		this.criteria = criteria;
	}
	
	@Override
	public Predicate toPredicate(Root<Offer> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
		
		List<Predicate> predicates = new ArrayList<>();
		
		addCityCriteria(root, builder, predicates); // Check whether offer's city is same as the specified one
		addNameCriteria(root, builder, predicates); // Check whether offer's name does contain the specified string in fuzzy order
		addDistanceCriteria(root, builder, predicates); // Check whether offer's availability location is less than or equals to the specified distance
		addSellerCriteria(root, builder, predicates); // Check whether offer's seller same is same as the specified one
		addLocalityCriteria(root, builder, predicates); // Check whether offer's availability location's locality is same as the specified one
		addCategoryCriteria(root, builder, predicates); // Check whether offer's category is same as the specified one
		addSubCategoryCriteria(root, builder, predicates); // Check whether offer's sub category is same as the specified one
		addMaxCostCriteria(root, builder, predicates); // Check whether offer's cost is less than or equals to the specified one
		addMinCostCriteria(root, builder, predicates); // Check whether offer's cost is greater than or equals to the specified one
		addBrandCriteria(root, builder, predicates); // Check whether offer's brand is same as the specified one
		addAuthorCriteria(root, builder, predicates); // Check whether offer's author (only if this a book) is same as the specified one
		addOfferTypeCriteria(root, builder, predicates); // Check whether offer's type (product or service) is same as the specified one
		addDealCriteria(root, builder, predicates); // Check whether offer's availability is on deal as per the specified switch
		addDealExpiryCriteria(root, builder, predicates); // Check whether product is on deal and expire of deal as per the the specified switch
		
		query.distinct(true);
		return builder.and(predicates.toArray(new Predicate[] {}));
	}
	
	private void addLocalityCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		// TODO Auto-generated method stub
		
	}

	private void addDealExpiryCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		// TODO Auto-generated method stub
		
	}
	
	private void addDealCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		// TODO Auto-generated method stub
		
	}
	
	private void addOfferTypeCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		// TODO Auto-generated method stub
		
	}
	
	private void addAuthorCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		// TODO Auto-generated method stub
		
	}
	
	private void addSubCategoryCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		// TODO Auto-generated method stub
		
	}
	
	private void addCategoryCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		// TODO Auto-generated method stub
		
	}
	
	private void addMinCostCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		if (criteria.getMin_cost() > 0) {
			predicates.add(builder.greaterThanOrEqualTo(root.join("offers").<Double> get("price"), criteria.getMin_cost()));
		}
	}
	
	private void addSellerCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		if (!StringUtils.isEmpty(criteria.getSeller())) {
			predicates.add(builder.like(builder.upper(root.<String> get("name")), "%" + criteria.getName().toUpperCase() + "%"));
		}
	}
	
	private void addDistanceCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		// TODO Auto-generated method stub
	}
	
	private void addCityCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		// TODO Auto-generated method stub
		
	}
	
	private void addMaxCostCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		if (criteria.getMax_cost() > 0) {
			predicates.add(builder.lessThanOrEqualTo(root.join("offers").<Double> get("price"), criteria.getMax_cost()));
		}
	}
	
	private void addNameCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		if (!StringUtils.isEmpty(criteria.getName())) {
			predicates.add(builder.like(builder.upper(root.<String> get("name")), "%" + criteria.getName().toUpperCase() + "%"));
		}
	}
	
	private void addBrandCriteria(Root<Offer> root, CriteriaBuilder builder, List<Predicate> predicates) {
		if (!StringUtils.isEmpty(criteria.getBrand())) {
			predicates.add(builder.equal(root.<Brand> get("brand").<String> get("name"), criteria.getBrand()));
		}
	}
	
}

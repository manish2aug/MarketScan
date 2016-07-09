package in.co.trish.marketscan.persistence.entities;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "PRODUCT_CATEGORY", schema = "MARKET_SCAN")
public class ProductCategory extends IdEntity {
	
	@NotNull
	@NotEmpty
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@NotNull
	@NotEmpty
	@Column(name = "code", nullable = false, length = 30)
	private String code;
	
	@OneToMany(mappedBy = "productCategory")
	private Collection<ProductSubcategory> productSubcategories = new HashSet<>();
	
	public ProductCategory() {
	}
	
	public ProductCategory(String name, String code, Collection<ProductSubcategory> productSubcategories) {
		this.name = name;
		this.code = code;
		this.productSubcategories = productSubcategories;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductCategory [name=").append(name).append(", code=").append(code).append(", productSubcategories=").append(productSubcategories).append("]");
		return builder.toString();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public Collection<ProductSubcategory> getProductSubcategories() {
		return productSubcategories;
	}
	
	public void setProductSubcategories(Collection<ProductSubcategory> productSubcategories) {
		this.productSubcategories = productSubcategories;
	}
	
}

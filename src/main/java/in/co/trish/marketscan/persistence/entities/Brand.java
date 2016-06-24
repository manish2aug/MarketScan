package in.co.trish.marketscan.persistence.entities;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BRAND", schema = "MARKET_SCAN")
public class Brand extends IdEntity {
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@Column(name = "code", nullable = false, length = 30, unique = true)
	private String code;
	
	@OneToMany(mappedBy = "brand")
	private Collection<Product> products = new HashSet<>();
	
	public Brand() {
	}
	
	public Brand(String name, String code, Collection<Product> products) {
		this.name = name;
		this.code = code;
		this.products = products;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brand [name=").append(name).append(", code=").append(code).append(", products=").append(products).append("]");
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
	
	public Collection<Product> getProducts() {
		return products;
	}
	
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	
}

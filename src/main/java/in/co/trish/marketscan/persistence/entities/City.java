package in.co.trish.marketscan.persistence.entities;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "CITY", schema = "MARKET_SCAN")
public class City extends IdEntity {
	
	@NotNull
	@NotEmpty
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@NotNull
	@NotEmpty
	@Column(name = "code", nullable = false, length = 30, unique = true)
	private String code;
	
	@ManyToOne
	@JoinColumn(name = "state_id")
	private State state;
	
	@OneToMany(mappedBy = "city")
	private Collection<Product> products = new HashSet<>();
	
	public City() {
	}
	
	public City(String name, String code, State state, Collection<Product> products) {
		this.name = name;
		this.code = code;
		this.state = state;
		this.products = products;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("City [name=").append(name).append(", code=").append(code).append(", state=").append(state).append(", products=").append(products).append("]");
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
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public Collection<Product> getProducts() {
		return products;
	}
	
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	
}

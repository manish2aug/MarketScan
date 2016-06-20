package in.co.trish.marketscan.persistence.entities;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author manish2aug
 * 
 * This entity has a unidirectional relation with {@link State}
 *
 */
@Entity
@Table(name = "CITY", schema = "MARKET_SCAN")
public class City extends IdEntity {

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "code", nullable = false, length = 50, unique = true)
	private String code;
	
	@ManyToOne
	@JoinColumn(name = "state_id")
	private State state;

	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(schema="MARKET_SCAN", name = "CITY_BRAND_PRODUCT", joinColumns = @JoinColumn(name = "BRAND_PRODUCT_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "CITY_ID", referencedColumnName = "ID"))
	private Collection<Product> products = new HashSet<>();

	public City() {}

	public City(String name, String code, State state) {
		this.name = name;
		this.code = code;
		this.state = state;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("City [name=").append(name).append(", code=").append(code).append(", state=").append(state)
				.append("]");
		return builder.toString();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * @return the products
	 */
	public Collection<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	
}

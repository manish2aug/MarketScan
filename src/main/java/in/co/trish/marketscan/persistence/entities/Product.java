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

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "PRODUCT", schema = "MARKET_SCAN")
public class Product extends IdEntity {

	@NotEmpty
	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "unit", nullable = false, length = 50)
	private String unit;

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_subcategory_id")
	private ProductSubcategory subCategory;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(schema = "MARKET_SCAN", name = "BRAND_PRODUCT", joinColumns = @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "BRAND_ID", referencedColumnName = "ID"))
	private Collection<Brand> brands = new HashSet<>();
	
	@ManyToMany
	@JoinTable(schema="MARKET_SCAN", name = "CITY_PRODUCT", joinColumns = @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "CITY_ID", referencedColumnName = "ID"))
	private Collection<City> cities = new HashSet<>();
	
	public Product() {}

	public Product(long id, String name, String unit, ProductSubcategory subCategory) {
		this.id = id;
		this.name = name;
		this.unit = unit;
		this.subCategory = subCategory;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=").append(id).append(", name=").append(name).append(", unit=").append(unit)
				.append(", subCategory=").append(subCategory).append("]");
		return builder.toString();
	}

	/**
	 * @return the brands
	 */
	public Collection<Brand> getBrands() {
		return brands;
	}

	/**
	 * @param brands the brands to set
	 */
	public void setBrands(Collection<Brand> brands) {
		this.brands = brands;
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
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @return the subCategory
	 */
	public ProductSubcategory getSubCategory() {
		return subCategory;
	}

	/**
	 * @param subCategory the subCategory to set
	 */
	public void setSubCategory(ProductSubcategory subCategory) {
		this.subCategory = subCategory;
	}

	/**
	 * @return the cities
	 */
	public Collection<City> getCities() {
		return cities;
	}

	/**
	 * @param cities the cities to set
	 */
	public void setCities(Collection<City> cities) {
		this.cities = cities;
	}

}

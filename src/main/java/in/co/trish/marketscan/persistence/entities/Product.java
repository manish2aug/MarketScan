package in.co.trish.marketscan.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(value="Product", description="Product to be searched")
@Entity
@Table(name = "PRODUCT", schema = "MARKET_SCAN")
public class Product extends IdEntity {
	
	@Column(name = "name", nullable = false, length = 150)
	private String name;
	
	@OneToOne
	@JoinColumn(name = "unit_id", nullable = false)
	private Unit unit;
	
	@ManyToOne
	@JoinColumn(name = "product_subcategory_id")
	private ProductSubcategory subCategory;
	
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	public Product() {
	}
	
	public Product(String name, Unit unit, ProductSubcategory subCategory, Brand brand, City city) {
		this.name = name;
		this.unit = unit;
		this.subCategory = subCategory;
		this.brand = brand;
		this.city = city;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [name=").append(name).append(", unit=").append(unit).append(", subCategory=").append(subCategory).append(", brand=").append(brand).append(", city=").append(city).append("]");
		return builder.toString();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Unit getUnit() {
		return unit;
	}
	
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	public ProductSubcategory getSubCategory() {
		return subCategory;
	}
	
	public void setSubCategory(ProductSubcategory subCategory) {
		this.subCategory = subCategory;
	}
	
	public Brand getBrand() {
		return brand;
	}
	
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public City getCity() {
		return city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}
	
}

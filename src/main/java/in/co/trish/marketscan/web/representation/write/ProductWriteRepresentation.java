package in.co.trish.marketscan.web.representation.write;

import javax.validation.constraints.NotNull;

import in.co.trish.marketscan.persistence.entities.Product;

public class ProductWriteRepresentation implements WriteRepresentation<Product>{

	@NotNull
	private String name;
	
	@NotNull
	private String unitCode;
	
	@NotNull
	private String productSubcategoryCode;
	
	@NotNull
	private String brandCode;
	
	@NotNull
	private String cityCode;
	
	@NotNull
	private String description;
	
	@Override
	public Product convertToDomainObject() {
		
		
		return null;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductWriteRepresentation [name=").append(name).append(", unitCode=").append(unitCode)
				.append(", productSubcategoryCode=").append(productSubcategoryCode).append(", brandCode=")
				.append(brandCode).append(", cityCode=").append(cityCode).append(", description=").append(description)
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
	 * @return the unitCode
	 */
	public String getUnitCode() {
		return unitCode;
	}

	/**
	 * @param unitCode the unitCode to set
	 */
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	/**
	 * @return the productSubcategoryCode
	 */
	public String getProductSubcategoryCode() {
		return productSubcategoryCode;
	}

	/**
	 * @param productSubcategoryCode the productSubcategoryCode to set
	 */
	public void setProductSubcategoryCode(String productSubcategoryCode) {
		this.productSubcategoryCode = productSubcategoryCode;
	}

	/**
	 * @return the brandCode
	 */
	public String getBrandCode() {
		return brandCode;
	}

	/**
	 * @param brandCode the brandCode to set
	 */
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}

package in.co.trish.marketscan.web.criterias;

public class ProductSearchCriteria {
	private String city; // TODO: the default value should be user's current city; server should retrieve value if ui doesn't send
	private String name;
	private long distance;
	private String seller;
	private String locality;
	private String category;
	private String sub_category;
	private double max_cost;
	private double min_cost;
	private String brand;
	private String author;
	private boolean is_service;
	private boolean is_expired;
	private boolean is_deal;
	private String fields;
	private String operation; 
	
	
	/**
	 * @param city
	 * @param name
	 * @param distance
	 * @param seller
	 * @param locality
	 * @param category
	 * @param sub_category
	 * @param max_cost
	 * @param min_cost
	 * @param brand
	 * @param author
	 * @param is_service
	 * @param is_expired
	 * @param is_deal
	 * @param fields
	 */
	public ProductSearchCriteria(String city, String name, long distance, String seller, String locality,
			String category, String sub_category, double max_cost, double min_cost, String brand, String author,
			boolean is_service, boolean is_expired, boolean is_deal, String fields) {
		super();
		this.city = city;
		this.name = name;
		this.distance = distance;
		this.seller = seller;
		this.locality = locality;
		this.category = category;
		this.sub_category = sub_category;
		this.max_cost = max_cost;
		this.min_cost = min_cost;
		this.brand = brand;
		this.author = author;
		this.is_service = is_service;
		this.is_expired = is_expired;
		this.is_deal = is_deal;
		this.fields = fields;
	}
	
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the distance
	 */
	public long getDistance() {
		return distance;
	}
	/**
	 * @return the seller
	 */
	public String getSeller() {
		return seller;
	}
	/**
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @return the sub_category
	 */
	public String getSub_category() {
		return sub_category;
	}
	/**
	 * @return the max_cost
	 */
	public double getMax_cost() {
		return max_cost;
	}
	/**
	 * @return the min_cost
	 */
	public double getMin_cost() {
		return min_cost;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @return the is_service
	 */
	public boolean isIs_service() {
		return is_service;
	}
	/**
	 * @return the is_expired
	 */
	public boolean isIs_expired() {
		return is_expired;
	}
	/**
	 * @return the is_deal
	 */
	public boolean isIs_deal() {
		return is_deal;
	}
	/**
	 * @return the fields
	 */
	public String getFields() {
		return fields;
	}
	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}
	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductSearchCriteria [");
		if (city != null)
			builder.append("city=").append(city).append(", ");
		if (name != null)
			builder.append("name=").append(name).append(", ");
		builder.append("distance=").append(distance).append(", ");
		if (seller != null)
			builder.append("seller=").append(seller).append(", ");
		if (locality != null)
			builder.append("locality=").append(locality).append(", ");
		if (category != null)
			builder.append("category=").append(category).append(", ");
		if (sub_category != null)
			builder.append("sub_category=").append(sub_category).append(", ");
		builder.append("max_cost=").append(max_cost).append(", min_cost=").append(min_cost).append(", ");
		if (brand != null)
			builder.append("brand=").append(brand).append(", ");
		if (author != null)
			builder.append("author=").append(author).append(", ");
		builder.append("is_service=").append(is_service).append(", is_expired=").append(is_expired).append(", is_deal=")
				.append(is_deal).append(", ");
		if (fields != null)
			builder.append("fields=").append(fields).append(", ");
		if (operation != null)
			builder.append("operation=").append(operation);
		builder.append("]");
		return builder.toString();
	}

}

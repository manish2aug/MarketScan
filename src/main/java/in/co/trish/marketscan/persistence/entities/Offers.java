package in.co.trish.marketscan.persistence.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OFFERS", schema = "MARKET_SCAN")
public class Offers extends IdEntity {
	
	@ManyToOne
	@JoinColumn(name = "seller_id", nullable = false)
	private Person seller;
	
	@ManyToOne
	@JoinColumn(name = "city_brand_product_id", nullable = false)
	private Product product;
	
	@Column(name = "price", nullable = false)
	private BigDecimal price;
	
	@Column(name = "is_deal", nullable = false)
	private boolean isDeal = false;
	
	@Column(name = "published_date", nullable = false)
	private Date publishedDate;
	
	public Offers() {
	}
	
	public Offers(Person seller, Product product, BigDecimal price, boolean isDeal, Date publishedDate) {
		this.seller = seller;
		this.product = product;
		this.price = price;
		this.isDeal = isDeal;
		this.publishedDate = publishedDate;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Offers [seller=").append(seller).append(", product=").append(product).append(", price=").append(price).append(", isDeal=").append(isDeal).append(", publishedDate=").append(publishedDate).append("]");
		return builder.toString();
	}
	
	/**
	 * @return the seller
	 */
	public Person getSeller() {
		return seller;
	}
	
	/**
	 * @param seller the seller to set
	 */
	public void setSeller(Person seller) {
		this.seller = seller;
	}
	
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	/**
	 * @return the isDeal
	 */
	public boolean isDeal() {
		return isDeal;
	}
	
	/**
	 * @param isDeal the isDeal to set
	 */
	public void setDeal(boolean isDeal) {
		this.isDeal = isDeal;
	}
	
	/**
	 * @return the publishedDate
	 */
	public Date getPublishedDate() {
		return publishedDate;
	}
	
	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	
}

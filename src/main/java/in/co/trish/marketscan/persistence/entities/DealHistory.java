package in.co.trish.marketscan.persistence.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEAL_HISTORY", schema = "MARKET_SCAN")
public class DealHistory extends IdEntity {

	@ManyToOne
	@JoinColumn(name = "seller_id", nullable = false)
	private Person seller;
	
	@ManyToOne
	@JoinColumn(name = "city_brand_product_id", nullable = false)
	private Product cityBrandProductId;
	
	@Column(name = "deal_published", nullable = false)
	private Date dealPublished;
	
	@Column(name = "deal_removed", nullable = false)
	private Date dealRemoved;
	
	@Column(name = "deal_viewed_count", nullable = false)
	private int dealViewedCount;
	
	@Column(name = "lowest_price", nullable = false)
	private BigDecimal lowestPrice;
	
	@Column(name = "deal_price", nullable = false)
	private BigDecimal dealPrice;

	public DealHistory() {}

	/**
	 * @param seller
	 * @param cityBrandProductId
	 * @param dealPublished
	 * @param dealRemoved
	 * @param dealViewedCount
	 * @param lowestPrice
	 * @param dealPrice
	 */
	public DealHistory(Person seller, Product cityBrandProductId, Date dealPublished, Date dealRemoved,
			int dealViewedCount, BigDecimal lowestPrice, BigDecimal dealPrice) {
		super();
		this.seller = seller;
		this.cityBrandProductId = cityBrandProductId;
		this.dealPublished = dealPublished;
		this.dealRemoved = dealRemoved;
		this.dealViewedCount = dealViewedCount;
		this.lowestPrice = lowestPrice;
		this.dealPrice = dealPrice;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DealHistory [seller=").append(seller).append(", cityBrandProductId=").append(cityBrandProductId)
				.append(", dealPublished=").append(dealPublished).append(", dealRemoved=").append(dealRemoved)
				.append(", dealViewedCount=").append(dealViewedCount).append(", lowestPrice=").append(lowestPrice)
				.append(", dealPrice=").append(dealPrice).append("]");
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
	 * @return the cityBrandProductId
	 */
	public Product getCityBrandProductId() {
		return cityBrandProductId;
	}

	/**
	 * @param cityBrandProductId the cityBrandProductId to set
	 */
	public void setCityBrandProductId(Product cityBrandProductId) {
		this.cityBrandProductId = cityBrandProductId;
	}

	/**
	 * @return the dealPublished
	 */
	public Date getDealPublished() {
		return dealPublished;
	}

	/**
	 * @param dealPublished the dealPublished to set
	 */
	public void setDealPublished(Date dealPublished) {
		this.dealPublished = dealPublished;
	}

	/**
	 * @return the dealRemoved
	 */
	public Date getDealRemoved() {
		return dealRemoved;
	}

	/**
	 * @param dealRemoved the dealRemoved to set
	 */
	public void setDealRemoved(Date dealRemoved) {
		this.dealRemoved = dealRemoved;
	}

	/**
	 * @return the dealViewedCount
	 */
	public int getDealViewedCount() {
		return dealViewedCount;
	}

	/**
	 * @param dealViewedCount the dealViewedCount to set
	 */
	public void setDealViewedCount(int dealViewedCount) {
		this.dealViewedCount = dealViewedCount;
	}

	/**
	 * @return the lowestPrice
	 */
	public BigDecimal getLowestPrice() {
		return lowestPrice;
	}

	/**
	 * @param lowestPrice the lowestPrice to set
	 */
	public void setLowestPrice(BigDecimal lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	/**
	 * @return the dealPrice
	 */
	public BigDecimal getDealPrice() {
		return dealPrice;
	}

	/**
	 * @param dealPrice the dealPrice to set
	 */
	public void setDealPrice(BigDecimal dealPrice) {
		this.dealPrice = dealPrice;
	}
	
}

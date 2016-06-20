package in.co.trish.marketscan.persistence.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SEARCH_HISTORY", schema = "MARKET_SCAN")
public class SearchHistory extends IdEntity {

	@ManyToOne
	@JoinColumn(name = "person_id", nullable = false)
	private Person person;

	@ManyToOne
	@JoinColumn(name = "city_brand_product_id", nullable = false)
	private Product product;

	@Column(name = "item_opened", nullable = false)
	private boolean itemOpened;

	@Column(name = "search_date", nullable = false)
	private Date searchDate;

	SearchHistory() {
	}

	public SearchHistory(Person person, Product product, boolean itemOpened, Date searchDate) {
		super();
		this.person = person;
		this.product = product;
		this.itemOpened = itemOpened;
		this.searchDate = searchDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SearchHistory [person=").append(person).append(", product=").append(product)
				.append(", itemOpened=").append(itemOpened).append(", searchDate=").append(searchDate).append("]");
		return builder.toString();
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person
	 *            the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the itemOpened
	 */
	public boolean isItemOpened() {
		return itemOpened;
	}

	/**
	 * @param itemOpened
	 *            the itemOpened to set
	 */
	public void setItemOpened(boolean itemOpened) {
		this.itemOpened = itemOpened;
	}

	/**
	 * @return the searchDate
	 */
	public Date getSearchDate() {
		return searchDate;
	}

	/**
	 * @param searchDate
	 *            the searchDate to set
	 */
	public void setSearchDate(Date searchDate) {
		this.searchDate = searchDate;
	}

}

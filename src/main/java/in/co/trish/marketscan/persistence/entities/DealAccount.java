package in.co.trish.marketscan.persistence.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEAL_ACCOUNT", schema = "MARKET_SCAN")
public class DealAccount extends IdEntity {
	
	@ManyToOne
	@JoinColumn(name = "deal_package_id")
	private DealPackage dealPackageId;
	
	@Column(name = "purchase_date", nullable = false)
	private Date purchaseDate;
	
	@Column(name = "available_deal_balance", nullable = false)
	private int availableDealBalance;
	
	public DealAccount() {
	}
	
	public DealAccount(DealPackage dealPackageId, Date purchaseDate, int availableDealBalance) {
		this.dealPackageId = dealPackageId;
		this.purchaseDate = purchaseDate;
		this.availableDealBalance = availableDealBalance;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DealAccount [dealPackageId=").append(dealPackageId).append(", purchaseDate=").append(purchaseDate).append(", availableDealBalance=").append(availableDealBalance).append("]");
		return builder.toString();
	}
	
	/**
	 * @return the dealPackageId
	 */
	public DealPackage getDealPackageId() {
		return dealPackageId;
	}
	
	/**
	 * @param dealPackageId the dealPackageId to set
	 */
	public void setDealPackageId(DealPackage dealPackageId) {
		this.dealPackageId = dealPackageId;
	}
	
	/**
	 * @return the purchaseDate
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	
	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	/**
	 * @return the availableDealBalance
	 */
	public int getAvailableDealBalance() {
		return availableDealBalance;
	}
	
	/**
	 * @param availableDealBalance the availableDealBalance to set
	 */
	public void setAvailableDealBalance(int availableDealBalance) {
		this.availableDealBalance = availableDealBalance;
	}
	
}

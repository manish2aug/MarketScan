package in.co.trish.marketscan.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SELLER_REVIEW", schema = "MARKET_SCAN")
public class SellerReview extends IdEntity {
	
	@Column(name = "respectful", nullable = false)
	private boolean isRrespectful;
	
	@Column(name = "was_quality_ok", nullable = false)
	private boolean wasQualityOk;
	
	@Column(name = "was_quantity_ok", nullable = false)
	private boolean wasQuantityOk;
	
	@Column(name = "is_recommended", nullable = false)
	private boolean isRecommended;
	
	@Column(name = "overall_rating", nullable = false, length = 500)
	private int overallRating;
	
	@Column(name = "review_comment", nullable = false)
	private String reviewComment;
	
	@ManyToOne
	@JoinColumn(name = "seller_id", nullable = false)
	private Person seller;
	
	@ManyToOne
	@JoinColumn(name = "reviewer_id", nullable = false)
	private Person reviewer;
	
	public SellerReview() {
	}
	
	public SellerReview(boolean isRrespectful, boolean wasQualityOk, boolean wasQuantityOk, boolean isRecommended, int overallRating, String reviewComment, Person seller, Person reviewer) {
		this.isRrespectful = isRrespectful;
		this.wasQualityOk = wasQualityOk;
		this.wasQuantityOk = wasQuantityOk;
		this.isRecommended = isRecommended;
		this.overallRating = overallRating;
		this.reviewComment = reviewComment;
		this.seller = seller;
		this.reviewer = reviewer;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SellerReview [isRrespectful=").append(isRrespectful).append(", wasQualityOk=").append(wasQualityOk).append(", wasQuantityOk=").append(wasQuantityOk).append(", isRecommended=").append(isRecommended).append(", overallRating=").append(overallRating).append(", reviewComment=").append(reviewComment).append(", seller=").append(seller).append(", reviewer=").append(reviewer).append("]");
		return builder.toString();
	}
	
	/**
	 * @return the isRrespectful
	 */
	public boolean isRrespectful() {
		return isRrespectful;
	}
	
	/**
	 * @param isRrespectful the isRrespectful to set
	 */
	public void setRrespectful(boolean isRrespectful) {
		this.isRrespectful = isRrespectful;
	}
	
	/**
	 * @return the wasQualityOk
	 */
	public boolean isWasQualityOk() {
		return wasQualityOk;
	}
	
	/**
	 * @param wasQualityOk the wasQualityOk to set
	 */
	public void setWasQualityOk(boolean wasQualityOk) {
		this.wasQualityOk = wasQualityOk;
	}
	
	/**
	 * @return the wasQuantityOk
	 */
	public boolean isWasQuantityOk() {
		return wasQuantityOk;
	}
	
	/**
	 * @param wasQuantityOk the wasQuantityOk to set
	 */
	public void setWasQuantityOk(boolean wasQuantityOk) {
		this.wasQuantityOk = wasQuantityOk;
	}
	
	/**
	 * @return the isRecommended
	 */
	public boolean isRecommended() {
		return isRecommended;
	}
	
	/**
	 * @param isRecommended the isRecommended to set
	 */
	public void setRecommended(boolean isRecommended) {
		this.isRecommended = isRecommended;
	}
	
	/**
	 * @return the overallRating
	 */
	public int getOverallRating() {
		return overallRating;
	}
	
	/**
	 * @param overallRating the overallRating to set
	 */
	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}
	
	/**
	 * @return the comment
	 */
	public String getComment() {
		return reviewComment;
	}
	
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String reviewComment) {
		this.reviewComment = reviewComment;
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
	 * @return the reviewer
	 */
	public Person getReviewer() {
		return reviewer;
	}
	
	/**
	 * @param reviewer the reviewer to set
	 */
	public void setReviewer(Person reviewer) {
		this.reviewer = reviewer;
	}
	
}

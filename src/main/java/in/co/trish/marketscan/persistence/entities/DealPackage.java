package in.co.trish.marketscan.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DEAL_PACKAGE", schema = "MARKET_SCAN")
public class DealPackage extends IdEntity {
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	
	@Column(name = "code", nullable = false, length = 10, unique = true)
	private String code;
	
	@Column(name = "deal_count", nullable = false)
	private int dealCount;
	
	@Column(name = "package_validity", nullable = false)
	private int packageValidity;
	
	@Column(name = "deal_validity", nullable = false)
	private int dealValidity;
	
	/**
	 * 
	 */
	public DealPackage() {
	}
	
	public DealPackage(String name, String code, int dealCount, int packageValidity, int dealValidity) {
		this.name = name;
		this.code = code;
		this.dealCount = dealCount;
		this.packageValidity = packageValidity;
		this.dealValidity = dealValidity;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DealPackage [name=").append(name).append(", code=").append(code).append(", dealCount=").append(dealCount).append(", packageValidity=").append(packageValidity).append(", dealValidity=").append(dealValidity).append("]");
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
	 * @return the dealCount
	 */
	public int getDealCount() {
		return dealCount;
	}
	
	/**
	 * @param dealCount the dealCount to set
	 */
	public void setDealCount(int dealCount) {
		this.dealCount = dealCount;
	}
	
	/**
	 * @return the packageValidity
	 */
	public int getPackageValidity() {
		return packageValidity;
	}
	
	/**
	 * @param packageValidity the packageValidity to set
	 */
	public void setPackageValidity(int packageValidity) {
		this.packageValidity = packageValidity;
	}
	
	/**
	 * @return the dealValidity
	 */
	public int getDealValidity() {
		return dealValidity;
	}
	
	/**
	 * @param dealValidity the dealValidity to set
	 */
	public void setDealValidity(int dealValidity) {
		this.dealValidity = dealValidity;
	}
	
}

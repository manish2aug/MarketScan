package in.co.trish.marketscan.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE", schema = "MARKET_SCAN")
public class Role extends IdEntity {

	@Column(name = "name", nullable = false, length = 10)
	private String name;

	@Column(name = "code", nullable = false, length = 1, unique = true)
	private String code;

	public Role() {}

	public Role(String name, String code) {
		this.name = name;
		this.code = code;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brand [id=").append(id).append(", name=").append(name).append(", code=").append(code)
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
	 * @param name
	 *            the name to set
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
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

}

package in.co.trish.marketscan.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author manish2aug
 * 
 * This entity has a unidirectional relation with {@link City}
 *
 */
@Entity
@Table(name = "STATE", schema = "MARKET_SCAN")
public class State extends IdEntity {

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "code", nullable = false, length = 50)
	private String code;

	public State() {
	}

	public State(long id, String name, String code) {
		this.id = id;
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
		builder.append("State [id=").append(id).append(", name=").append(name).append(", code=").append(code)
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

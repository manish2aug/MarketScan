package in.co.trish.marketscan.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author manish2aug
 * 
 * This entity has a unidirectional relation with {@link City}
 *
 */
@Entity
@Table(name = "STATE", schema = "MARKET_SCAN")
public class State extends IdEntity {
	
	@NotNull
	@NotEmpty
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@NotNull
	@NotEmpty
	@Column(name = "code", nullable = false, length = 30, unique = true)
	private String code;
	
	public State() {
	}
	
	public State(String name, String code) {
		this.name = name;
		this.code = code;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("State [id=").append(id).append(", name=").append(name).append(", code=").append(code).append("]");
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

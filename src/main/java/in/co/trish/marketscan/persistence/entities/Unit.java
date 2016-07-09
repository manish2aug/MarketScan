package in.co.trish.marketscan.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "UNIT", schema = "MARKET_SCAN")
public class Unit extends IdEntity {
	
	@NotNull
	@NotEmpty
	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@NotNull
	@NotEmpty
	@Column(name = "code", nullable = false, length = 10, unique = true)
	private String code;
	
	public Unit(){}

	public Unit(String name, String code) {
		this.name = name;
		this.code = code;
	}

	@Override
	public String toString() {
		return "Unit [name=" + name + ", code=" + code + "]";
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getCode() {
		return code;
	}

	
	public void setCode(String code) {
		this.code = code;
	}
	
}

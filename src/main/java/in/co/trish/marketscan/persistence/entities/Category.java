package in.co.trish.marketscan.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CATEGORY", schema = "market_scan")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name_english", nullable = false, length = 100)
	private String nameEnglish;

	@JsonIgnore
	@Column(name = "name_hindi", nullable = false, length = 100)
	private String nameHindi;

	public String getNameEnglish() {
		return nameEnglish;
	}

	public void setNameEnglish(String nameEnglish) {
		this.nameEnglish = nameEnglish;
	}

	public String getNameHindi() {
		return nameHindi;
	}

	public void setNameHindi(String nameHindi) {
		this.nameHindi = nameHindi;
	}

	public int getId() {
		return id;
	}

	public Category(){
		
	}
	
	public Category(int id, String nameEnglish, String nameHindi) {
		super();
		this.id = id;
		this.nameEnglish = nameEnglish;
		this.nameHindi = nameHindi;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [id=").append(id).append(", nameEnglish=").append(nameEnglish).append(", nameHindi=")
				.append(nameHindi).append("]");
		return builder.toString();
	}

	public void setId(int id) {
		this.id = id;
	}
}

package in.co.trish.marketscan.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "SUBCATEGORY", schema = "market_scan")
public class SubCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name_english", nullable = false, length = 100)
	private String nameEnglish;

	@JsonIgnore
	@Column(name = "name_hindi", nullable = false, length = 100)
	private String nameHindi;
	
	@JoinColumn(name = "name_english", nullable = false, table="category")
	private String category;

	public SubCategory(){
		
	}
	
	public SubCategory(int id, String nameEnglish, String nameHindi, String category) {
		super();
		this.id = id;
		this.nameEnglish = nameEnglish;
		this.nameHindi = nameHindi;
		this.category = category;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubCategory [id=").append(id).append(", nameEnglish=").append(nameEnglish)
				.append(", nameHindi=").append(nameHindi).append(", category=").append(category).append("]");
		return builder.toString();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nameEnglish
	 */
	public String getNameEnglish() {
		return nameEnglish;
	}

	/**
	 * @param nameEnglish the nameEnglish to set
	 */
	public void setNameEnglish(String nameEnglish) {
		this.nameEnglish = nameEnglish;
	}

	/**
	 * @return the nameHindi
	 */
	public String getNameHindi() {
		return nameHindi;
	}

	/**
	 * @param nameHindi the nameHindi to set
	 */
	public void setNameHindi(String nameHindi) {
		this.nameHindi = nameHindi;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

}

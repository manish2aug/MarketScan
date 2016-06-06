package in.co.trish.marketscan.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author katsi02
 *
 */
@Entity
@Table(name = "ITEM", schema = "bazaar_bargain")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name_english", nullable = false, length = 100)
    private String nameEnglish;

    @Column(name = "name_hindi", nullable = false, length = 100)
    private String nameHindi;

    @Column(name = "unit", nullable = false, length = 50)
    private String unit;

    @Column(name = "subcategory", nullable = false)
    private int subCategory;

    @Column(name = "brand", nullable = false)
    private int brand;

    public Item() {
    }

    public Item(int id, String nameEnglish, String nameHindi, String unit, int subCategory, int brand) {
	super();
	this.id = id;
	this.nameEnglish = nameEnglish;
	this.nameHindi = nameHindi;
	this.unit = unit;
	this.subCategory = subCategory;
	this.brand = brand;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Item [id=").append(id).append(", nameEnglish=").append(nameEnglish).append(", nameHindi=").append(nameHindi).append(", unit=").append(unit).append(", subCategory=")
	.append(subCategory).append(", brand=").append(brand).append("]");
	return builder.toString();
    }

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
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
     * @param nameEnglish
     *            the nameEnglish to set
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
     * @param nameHindi
     *            the nameHindi to set
     */
    public void setNameHindi(String nameHindi) {
	this.nameHindi = nameHindi;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
	return unit;
    }

    /**
     * @param unit
     *            the unit to set
     */
    public void setUnit(String unit) {
	this.unit = unit;
    }

    /**
     * @return the subCategory
     */
    public int getSubCategory() {
	return subCategory;
    }

    /**
     * @param subCategory
     *            the subCategory to set
     */
    public void setSubCategory(int subCategory) {
	this.subCategory = subCategory;
    }

    /**
     * @return the brand
     */
    public int getBrand() {
	return brand;
    }

    /**
     * @param brand
     *            the brand to set
     */
    public void setBrand(int brand) {
	this.brand = brand;
    }

}

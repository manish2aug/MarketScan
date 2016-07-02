package in.co.trish.marketscan.persistence.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "PERSON", schema = "MARKET_SCAN")
@TypeDefs(value = {@TypeDef(name = "pgInet", typeClass = PgInetType.class), @TypeDef(name = "PgMacAddr", typeClass = PgMacAddreType.class)})
public class Person extends IdEntity {
	
	@Column(name = "full_name", nullable = false, length = 100)
	private String fullName;
	
	@Column(name = "user_name", nullable = true, length = 20)
	private String userName;
	
	@Column(name = "password", nullable = true, length = 20)
	private String password;
	
	@Column(name = "uuid", nullable = true, length = 50)
	private String uuid;
	
	@Column(name = "mac_address", nullable = true)
	@Type(type = "PgMacAddr")
	@JsonProperty(defaultValue="00:00:00:00:00:00")
	private PgMacAddr macAddress;
	
	@Column(name = "ip_address", nullable = true)
	@Type(type = "pgInet")
	private PgInet ipAddress;
	
	@Column(name = "device_id", nullable = true, length = 50)
	private String deviceId;
	
	@Column(name = "shop_name", nullable = true, length = 100)
	private String shopName;
	
	@Column(name = "mobile_no", nullable = true, length = 10)
	private String mobileNo;
	
	@Column(name = "landline_no", nullable = true, length = 20)
	private String landlineNo;
	
	@Column(name = "whatsapp_no", nullable = true, length = 10)
	private String whatsappNo;
	
	@Column(name = "email_address", nullable = true, length = 150)
	private String emailAddress;
	
	@Column(name = "physical_address_line1", nullable = true, length = 150)
	private String physicalAddressLine1;
	
	@Column(name = "physical_address_line2", nullable = true, length = 150)
	private String physicalAddressLine2;
	
	@Column(name = "landmark", nullable = true, length = 150)
	private String landmark;
	
	@Column(name = "town", nullable = true, length = 100)
	private String town;
	
	@Column(name = "locality", nullable = true, length = 100)
	private String locality;
	
	@Column(name = "sub_locality", nullable = true, length = 100)
	private String subLocality;
	
	@Column(name = "pin_code", nullable = true, length = 6)
	private String pinCode;
	
	@Column(name = "longitude", nullable = false, length = 100)
	private double longitude;;
	
	@Column(name = "lattitude", nullable = false, length = 20)
	private double lattitude;
	
	@Column(name = "last_login_date", nullable = true, length = 100)
	private Date lastLoginDate;
	
	@Column(name = "last_activity", nullable = true, length = 100)
	private String lastActivity;
	
	@Column(name = "is_delivery_available", nullable = true)
	private boolean isDeliveryAvailable;
	
	@Column(name = "registration_date", nullable = true)
	private Date registrationDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "role_id")
	private Role role;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@OneToOne
	private DealAccount dealAccount;
	
	@OneToMany(mappedBy = "seller", fetch = FetchType.EAGER)
	private Collection<Review> reviews;
	
	public Person() {
	}
	
	public Person(String fullName, String userName, String password, String uuid, PgMacAddr macAddress, PgInet ipAddress, String deviceId, String shopName, String mobileNo, String landlineNo, String whatsappNo, String emailAddress, String physicalAddressLine1, String physicalAddressLine2, String landmark, String town, String locality, String subLocality, String pinCode, double longitude, double lattitude, Date lastLoginDate, String lastActivity, boolean isDeliveryAvailable, Date registrationDate, Role role, City city, DealAccount dealAccount, Collection<Review> reviews) {
		super();
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
		this.uuid = uuid;
		this.macAddress = macAddress;
		this.ipAddress = ipAddress;
		this.deviceId = deviceId;
		this.shopName = shopName;
		this.mobileNo = mobileNo;
		this.landlineNo = landlineNo;
		this.whatsappNo = whatsappNo;
		this.emailAddress = emailAddress;
		this.physicalAddressLine1 = physicalAddressLine1;
		this.physicalAddressLine2 = physicalAddressLine2;
		this.landmark = landmark;
		this.town = town;
		this.locality = locality;
		this.subLocality = subLocality;
		this.pinCode = pinCode;
		this.longitude = longitude;
		this.lattitude = lattitude;
		this.lastLoginDate = lastLoginDate;
		this.lastActivity = lastActivity;
		this.isDeliveryAvailable = isDeliveryAvailable;
		this.registrationDate = registrationDate;
		this.role = role;
		this.city = city;
		this.dealAccount = dealAccount;
		this.reviews = reviews;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [fullName=").append(fullName).append(", userName=").append(userName).append(", password=").append(password).append(", uuid=").append(uuid).append(", macAddress=").append(macAddress).append(", ipAddress=").append(ipAddress).append(", deviceId=").append(deviceId).append(", shopName=").append(shopName).append(", mobileNo=").append(mobileNo).append(", landlineNo=").append(landlineNo).append(", whatsappNo=").append(whatsappNo).append(", emailAddress=").append(emailAddress).append(", physicalAddressLine1=").append(physicalAddressLine1).append(", physicalAddressLine2=").append(physicalAddressLine2).append(", landmark=").append(landmark).append(", town=").append(town).append(", locality=").append(locality).append(", subLocality=").append(subLocality).append(", pinCode=").append(pinCode).append(", longitude=").append(longitude).append(", lattitude=").append(lattitude).append(", lastLoginDate=").append(lastLoginDate).append(", lastActivity=").append(lastActivity).append(", isDeliveryAvailable=").append(isDeliveryAvailable).append(", registrationDate=").append(registrationDate).append(", role=").append(role).append(", city=").append(city).append(", dealAccount=").append(dealAccount).append(", reviews=").append(reviews).append("]");
		return builder.toString();
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUuid() {
		return uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	public PgMacAddr getMacAddress() {
		return macAddress;
	}
	
	public void setMacAddress(PgMacAddr macAddress) {
		if (macAddress ==  null){
			this.macAddress = new PgMacAddr("00:00:00:00:00:00");
		}
		this.macAddress = macAddress;
	}
	
	public PgInet getIpAddress() {
		return ipAddress;
	}
	
	public void setIpAddress(PgInet ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getLandlineNo() {
		return landlineNo;
	}
	
	public void setLandlineNo(String landlineNo) {
		this.landlineNo = landlineNo;
	}
	
	public String getWhatsappNo() {
		return whatsappNo;
	}
	
	public void setWhatsappNo(String whatsappNo) {
		this.whatsappNo = whatsappNo;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getPhysicalAddressLine1() {
		return physicalAddressLine1;
	}
	
	public void setPhysicalAddressLine1(String physicalAddressLine1) {
		this.physicalAddressLine1 = physicalAddressLine1;
	}
	
	public String getPhysicalAddressLine2() {
		return physicalAddressLine2;
	}
	
	public void setPhysicalAddressLine2(String physicalAddressLine2) {
		this.physicalAddressLine2 = physicalAddressLine2;
	}
	
	public String getLandmark() {
		return landmark;
	}
	
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	public String getTown() {
		return town;
	}
	
	public void setTown(String town) {
		this.town = town;
	}
	
	public String getLocality() {
		return locality;
	}
	
	public void setLocality(String locality) {
		this.locality = locality;
	}
	
	public String getSubLocality() {
		return subLocality;
	}
	
	public void setSubLocality(String subLocality) {
		this.subLocality = subLocality;
	}
	
	public String getPinCode() {
		return pinCode;
	}
	
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public double getLattitude() {
		return lattitude;
	}
	
	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}
	
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
	public String getLastActivity() {
		return lastActivity;
	}
	
	public void setLastActivity(String lastActivity) {
		this.lastActivity = lastActivity;
	}
	
	public boolean isDeliveryAvailable() {
		return isDeliveryAvailable;
	}
	
	public void setDeliveryAvailable(boolean isDeliveryAvailable) {
		this.isDeliveryAvailable = isDeliveryAvailable;
	}
	
	public Date getRegistrationDate() {
		return registrationDate;
	}
	
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public City getCity() {
		return city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}
	
	public DealAccount getDealAccount() {
		return dealAccount;
	}
	
	public void setDealAccount(DealAccount dealAccount) {
		this.dealAccount = dealAccount;
	}
	
	public Collection<Review> getReviews() {
		return reviews;
	}
	
	public void setReviews(Collection<Review> reviews) {
		this.reviews = reviews;
	}
	
}

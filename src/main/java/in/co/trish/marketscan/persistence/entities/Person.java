package in.co.trish.marketscan.persistence.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON", schema = "MARKET_SCAN")
public class Person extends IdEntity {

	@Column(name = "full_name", nullable = false, length = 100)
	private String fullName;
	
	@Column(name = "user_name", nullable = true, length = 20)
	private String userName;
	
	@Column(name = "password", nullable = true, length = 20)
	private String password;

	@Column(name = "uuid", nullable = true, length = 50)
	private String uuid;

	@Column(name = "mac_address", nullable = true, length = 50)
	private String macAddress;

	@Column(name = "ip_address", nullable = true, length = 20)
	private String ipAddress;

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

	@Column(name = "longitude", nullable = false, length = 100)
	private String longitude;;

	@Column(name = "lattitude", nullable = false, length = 20)
	private String lattitude;

	@Column(name = "last_login_date", nullable = true, length = 100)
	private Date lastLoginDate;

	@Column(name = "last_activity", nullable = true, length = 100)
	private String lastActivity;

	@Column(name = "is_delivery_available", nullable = true)
	private boolean isDeliveryAvailable;

	@Column(name = "registration_date", nullable = true)
	private Date registrationDate;
	
	@ManyToOne
    @JoinColumn(name = "role_id")
	private Role role;
	
	@ManyToOne
    @JoinColumn(name = "city_id")
	private City city;

	@OneToOne
	private DealAccount dealAccount;

	@OneToMany
	private Collection<SellerReview> reviews;
	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fullName
	 * @param userName
	 * @param password
	 * @param uuid
	 * @param macAddress
	 * @param ipAddress
	 * @param deviceId
	 * @param shopName
	 * @param mobileNo
	 * @param landlineNo
	 * @param whatsappNo
	 * @param emailAddress
	 * @param physicalAddressLine1
	 * @param physicalAddressLine2
	 * @param landmark
	 * @param town
	 * @param locality
	 * @param longitude
	 * @param lattitude
	 * @param lastLoginDate
	 * @param lastActivity
	 * @param isDeliveryAvailable
	 * @param registrationDate
	 * @param role
	 * @param city
	 * @param dealAccount
	 */
	public Person(String fullName, String userName, String password, String uuid, String macAddress, String ipAddress,
			String deviceId, String shopName, String mobileNo, String landlineNo, String whatsappNo,
			String emailAddress, String physicalAddressLine1, String physicalAddressLine2, String landmark, String town,
			String locality, String longitude, String lattitude, Date lastLoginDate, String lastActivity,
			boolean isDeliveryAvailable, Date registrationDate, Role role, City city, DealAccount dealAccount) {
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
		this.longitude = longitude;
		this.lattitude = lattitude;
		this.lastLoginDate = lastLoginDate;
		this.lastActivity = lastActivity;
		this.isDeliveryAvailable = isDeliveryAvailable;
		this.registrationDate = registrationDate;
		this.role = role;
		this.city = city;
		this.dealAccount = dealAccount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [fullName=").append(fullName).append(", userName=").append(userName)
				.append(", password=").append(password).append(", uuid=").append(uuid).append(", macAddress=")
				.append(macAddress).append(", ipAddress=").append(ipAddress).append(", deviceId=").append(deviceId)
				.append(", shopName=").append(shopName).append(", mobileNo=").append(mobileNo).append(", landlineNo=")
				.append(landlineNo).append(", whatsappNo=").append(whatsappNo).append(", emailAddress=")
				.append(emailAddress).append(", physicalAddressLine1=").append(physicalAddressLine1)
				.append(", physicalAddressLine2=").append(physicalAddressLine2).append(", landmark=").append(landmark)
				.append(", town=").append(town).append(", locality=").append(locality).append(", longitude=")
				.append(longitude).append(", lattitude=").append(lattitude).append(", lastLoginDate=")
				.append(lastLoginDate).append(", lastActivity=").append(lastActivity).append(", isDeliveryAvailable=")
				.append(isDeliveryAvailable).append(", registrationDate=").append(registrationDate).append(", role=")
				.append(role).append(", city=").append(city).append(", dealAccount=").append(dealAccount).append("]");
		return builder.toString();
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid
	 *            the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress
	 *            the macAddress to set
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress
	 *            the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId
	 *            the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * @param shopName
	 *            the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo
	 *            the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the landlineNo
	 */
	public String getLandlineNo() {
		return landlineNo;
	}

	/**
	 * @param landlineNo
	 *            the landlineNo to set
	 */
	public void setLandlineNo(String landlineNo) {
		this.landlineNo = landlineNo;
	}

	/**
	 * @return the whatsappNo
	 */
	public String getWhatsappNo() {
		return whatsappNo;
	}

	/**
	 * @param whatsappNo
	 *            the whatsappNo to set
	 */
	public void setWhatsappNo(String whatsappNo) {
		this.whatsappNo = whatsappNo;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress
	 *            the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the physicalAddressLine1
	 */
	public String getPhysicalAddressLine1() {
		return physicalAddressLine1;
	}

	/**
	 * @param physicalAddressLine1
	 *            the physicalAddressLine1 to set
	 */
	public void setPhysicalAddressLine1(String physicalAddressLine1) {
		this.physicalAddressLine1 = physicalAddressLine1;
	}

	/**
	 * @return the physicalAddressLine2
	 */
	public String getPhysicalAddressLine2() {
		return physicalAddressLine2;
	}

	/**
	 * @param physicalAddressLine2
	 *            the physicalAddressLine2 to set
	 */
	public void setPhysicalAddressLine2(String physicalAddressLine2) {
		this.physicalAddressLine2 = physicalAddressLine2;
	}

	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}

	/**
	 * @param landmark
	 *            the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town
	 *            the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * @param locality
	 *            the locality to set
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the lattitude
	 */
	public String getLattitude() {
		return lattitude;
	}

	/**
	 * @param lattitude
	 *            the lattitude to set
	 */
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}

	/**
	 * @return the lastLoginDate
	 */
	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	/**
	 * @param lastLoginDate
	 *            the lastLoginDate to set
	 */
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	/**
	 * @return the lastActivity
	 */
	public String getLastActivity() {
		return lastActivity;
	}

	/**
	 * @param lastActivity
	 *            the lastActivity to set
	 */
	public void setLastActivity(String lastActivity) {
		this.lastActivity = lastActivity;
	}

	/**
	 * @return the isDeliveryAvailable
	 */
	public boolean isDeliveryAvailable() {
		return isDeliveryAvailable;
	}

	/**
	 * @param isDeliveryAvailable
	 *            the isDeliveryAvailable to set
	 */
	public void setDeliveryAvailable(boolean isDeliveryAvailable) {
		this.isDeliveryAvailable = isDeliveryAvailable;
	}

	/**
	 * @return the registrationDate
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate
	 *            the registrationDate to set
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @return the dealAccount
	 */
	public DealAccount getDealAccount() {
		return dealAccount;
	}

	/**
	 * @param dealAccount
	 *            the dealAccount to set
	 */
	public void setDealAccount(DealAccount dealAccount) {
		this.dealAccount = dealAccount;
	}

}

package ige.integration.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllGuestInfos", query = "select myGuestInfo from GuestInfo myGuestInfo"),
		@NamedQuery(name = "findGuestInfoByAl", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.al = ?1"),
		@NamedQuery(name = "findGuestInfoByEmail", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.email = ?1"),
		@NamedQuery(name = "findGuestInfoByAlContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.al like ?1"),
		@NamedQuery(name = "findGuestInfoByBonusAl", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.bonusAl = ?1"),
		@NamedQuery(name = "findGuestInfoByBonusAlContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.bonusAl like ?1"),
		@NamedQuery(name = "findGuestInfoByBonusCode", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.bonusCode = ?1"),
		@NamedQuery(name = "findGuestInfoByBonusCodeContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.bonusCode like ?1"),
		@NamedQuery(name = "findGuestInfoByConfirmationNumber", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.confirmationNumber = ?1"),
		@NamedQuery(name = "findGuestInfoByConfirmationNumberContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.confirmationNumber like ?1"),
		@NamedQuery(name = "findGuestInfoByFirstName", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.firstName = ?1"),
		@NamedQuery(name = "findGuestInfoByFirstNameContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.firstName like ?1"),
		@NamedQuery(name = "findGuestInfoByFullAddress", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.fullAddress = ?1"),
		@NamedQuery(name = "findGuestInfoByFullAddressContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.fullAddress like ?1"),
		@NamedQuery(name = "findGuestInfoByGroupName", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.groupName = ?1"),
		@NamedQuery(name = "findGuestInfoByGroupNameContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.groupName like ?1"),
		@NamedQuery(name = "findGuestInfoByHhNumber", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.hhNumber = ?1"),
		@NamedQuery(name = "findGuestInfoByHhNumberContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.hhNumber like ?1"),
		@NamedQuery(name = "findGuestInfoById", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.id = ?1"),
		@NamedQuery(name = "findGuestBillInfo", query = "select myGuestInfo from GuestStayInfo myGuestStayInfo, GuestTransactions myGuestTransactions, GuestInfo myGuestInfo where myGuestInfo.email = ?1 and myGuestInfo.lastName = ?2 and myGuestStayInfo.roomNumber = ?3"),
		@NamedQuery(name = "findGuestInfoByEmailLastNameRoom", query = "select myGuestInfo from GuestStayInfo myGuestStayInfo, GuestInfo myGuestInfo, GuestTransactions myGuestTransactions where myGuestInfo.lastName = ?1 and myGuestInfo.email = ?2 and myGuestStayInfo.roomNumber = ?3"),		
		@NamedQuery(name = "findGuestInfoByLastName", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.lastName = ?1"),
		@NamedQuery(name = "findGuestInfoByLastNameContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.lastName like ?1"),
		@NamedQuery(name = "findGuestInfoByMembershipNumber", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.membershipNumber = ?1"),
		@NamedQuery(name = "findGuestInfoByMembershipNumberContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.membershipNumber like ?1"),
		@NamedQuery(name = "findGuestInfoByMobileNumber", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.mobileNumber = ?1"),
		@NamedQuery(name = "findGuestInfoByMobileNumberContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.mobileNumber like ?1"),
		@NamedQuery(name = "findGuestInfoByPrimaryKey", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.id = ?1"),
		@NamedQuery(name = "findGuestInfoByRatePlan", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.ratePlan = ?1"),
		@NamedQuery(name = "findGuestInfoByRatePlanContaining", query = "select myGuestInfo from GuestInfo myGuestInfo where myGuestInfo.ratePlan like ?1") })
@Table(catalog = "pms", name = "guest_info")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "StubPMS/ige/integration/domain", name = "GuestInfo")
@XmlRootElement(namespace = "StubPMS/ige/integration/domain")
public class GuestInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "first_name", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String firstName;
	/**
	 */

	@Column(name = "last_name", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String lastName;
	/**
	 */

	@Column(name = "full_address", length = 250)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String fullAddress;
	/**
	 */

	@Column(name = "mobile_number", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String mobileNumber;
	/**
	 */

	@Column(name = "rate_plan", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String ratePlan;
	/**
	 */

	@Column(name = "hh_number", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String hhNumber;
	/**
	 */

	@Column(name = "AL", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String al;
	/**
	 */

	@Column(name = "bonus_al", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String bonusAl;
	/**
	 */

	@Column(name = "confirmation_number", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String confirmationNumber;
	/**
	 */

	@Column(name = "email", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
	/**
	 */

	@Column(name = "membership_number", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String membershipNumber;
	/**
	 */

	@Column(name = "bonus_code", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String bonusCode;
	/**
	 */

	@Column(name = "group_name", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String groupName;

	/**
	 */
	@OneToMany(mappedBy = "guestInfo", cascade = { CascadeType.REMOVE }, fetch = FetchType.EAGER)
	@XmlElement(name = "", namespace = "")
	java.util.Set<ige.integration.domain.GuestStayInfo> guestStayInfos;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	/**
	 */
	public String getFullAddress() {
		return this.fullAddress;
	}

	/**
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 */
	public String getMobileNumber() {
		return this.mobileNumber;
	}

	/**
	 */
	public void setRatePlan(String ratePlan) {
		this.ratePlan = ratePlan;
	}

	/**
	 */
	public String getRatePlan() {
		return this.ratePlan;
	}

	/**
	 */
	public void setHhNumber(String hhNumber) {
		this.hhNumber = hhNumber;
	}

	/**
	 */
	public String getHhNumber() {
		return this.hhNumber;
	}

	/**
	 */
	public void setAl(String al) {
		this.al = al;
	}

	/**
	 */
	public String getAl() {
		return this.al;
	}

	/**
	 */
	public void setBonusAl(String bonusAl) {
		this.bonusAl = bonusAl;
	}

	/**
	 */
	public String getBonusAl() {
		return this.bonusAl;
	}

	/**
	 */
	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	/**
	 */
	public String getConfirmationNumber() {
		return this.confirmationNumber;
	}

	/**
	 */
	public void setMembershipNumber(String membershipNumber) {
		this.membershipNumber = membershipNumber;
	}

	/**
	 */
	public String getMembershipNumber() {
		return this.membershipNumber;
	}

	/**
	 */
	public void setBonusCode(String bonusCode) {
		this.bonusCode = bonusCode;
	}

	/**
	 */
	public String getBonusCode() {
		return this.bonusCode;
	}

	/**
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 */
	public String getGroupName() {
		return this.groupName;
	}

	/**
	 */
	public void setGuestStayInfos(Set<GuestStayInfo> guestStayInfos) {
		this.guestStayInfos = guestStayInfos;
	}

	/**
	 */
	public Set<GuestStayInfo> getGuestStayInfos() {
		if (guestStayInfos == null) {
			guestStayInfos = new java.util.LinkedHashSet<ige.integration.domain.GuestStayInfo>();
		}
		return guestStayInfos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public GuestInfo() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(GuestInfo that) {
		setId(that.getId());
		setFirstName(that.getFirstName());
		setLastName(that.getLastName());
		setFullAddress(that.getFullAddress());
		setMobileNumber(that.getMobileNumber());
		setRatePlan(that.getRatePlan());
		setHhNumber(that.getHhNumber());
		setAl(that.getAl());
		setBonusAl(that.getBonusAl());
		setConfirmationNumber(that.getConfirmationNumber());
		setMembershipNumber(that.getMembershipNumber());
		setBonusCode(that.getBonusCode());
		setGroupName(that.getGroupName());
		setGuestStayInfos(new java.util.LinkedHashSet<ige.integration.domain.GuestStayInfo>(that.getGuestStayInfos()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("firstName=[").append(firstName).append("] ");
		buffer.append("lastName=[").append(lastName).append("] ");
		buffer.append("fullAddress=[").append(fullAddress).append("] ");
		buffer.append("mobileNumber=[").append(mobileNumber).append("] ");
		buffer.append("ratePlan=[").append(ratePlan).append("] ");
		buffer.append("hhNumber=[").append(hhNumber).append("] ");
		buffer.append("al=[").append(al).append("] ");
		buffer.append("bonusAl=[").append(bonusAl).append("] ");
		buffer.append("confirmationNumber=[").append(confirmationNumber).append("] ");
		buffer.append("membershipNumber=[").append(membershipNumber).append("] ");
		buffer.append("bonusCode=[").append(bonusCode).append("] ");
		buffer.append("groupName=[").append(groupName).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof GuestInfo))
			return false;
		GuestInfo equalCheck = (GuestInfo) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}

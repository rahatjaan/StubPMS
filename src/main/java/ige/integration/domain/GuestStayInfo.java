package ige.integration.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllGuestStayInfos", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo"),
		@NamedQuery(name = "findGuestStayInfoByArrivalDate", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.arrivalDate = ?1"),
		@NamedQuery(name = "findGuestStayInfoByBalanceAmount", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.balanceAmount = ?1"),
		@NamedQuery(name = "findGuestStayInfoByCardNumber", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.cardNumber = ?1"),
		@NamedQuery(name = "findGuestStayInfoByCardNumberContaining", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.cardNumber like ?1"),
		@NamedQuery(name = "findGuestStayInfoByCardType", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.cardType = ?1"),
		@NamedQuery(name = "findGuestStayInfoByCardTypeContaining", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.cardType like ?1"),
		@NamedQuery(name = "findGuestStayInfoByCreditAmount", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.creditAmount = ?1"),
		@NamedQuery(name = "findGuestStayInfoByCreditcardExpirationDate", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.creditcardExpirationDate = ?1"),
		@NamedQuery(name = "findGuestStayInfoByDepartureDate", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.departureDate = ?1"),
		@NamedQuery(name = "findGuestStayInfoByFloorNumber", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.floorNumber = ?1"),
		@NamedQuery(name = "findGuestStayInfoByFloorNumberContaining", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.floorNumber like ?1"),
		@NamedQuery(name = "findGuestStayInfoByFolioNumber", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.folioNumber = ?1"),
		@NamedQuery(name = "findGuestStayInfoByFolioNumberContaining", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.folioNumber like ?1"),
		@NamedQuery(name = "findGuestStayInfoById", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.id = ?1"),
		@NamedQuery(name = "findGuestStayInfoByNumberOfAdult", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.numberOfAdult = ?1"),
		@NamedQuery(name = "findGuestStayInfoByNumberOfChildren", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.numberOfChildren = ?1"),
		@NamedQuery(name = "findGuestStayInfoByPaymentType", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.paymentType = ?1"),
		@NamedQuery(name = "findGuestStayInfoByPaymentTypeContaining", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.paymentType like ?1"),
		@NamedQuery(name = "findGuestStayInfoByPrimaryKey", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.id = ?1"),
		@NamedQuery(name = "findGuestStayInfoByRateCode", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.rateCode = ?1"),
		@NamedQuery(name = "findGuestStayInfoByReservationType", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.reservationType = ?1"),
		@NamedQuery(name = "findGuestStayInfoByRoomNumber", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.roomNumber = ?1"),
		@NamedQuery(name = "findGuestStayInfoByRoomNumberContaining", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.roomNumber like ?1"),
		@NamedQuery(name = "findGuestStayInfoByRoomRate", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.roomRate = ?1"),
		@NamedQuery(name = "findGuestStayInfoByRoomType", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.roomType = ?1"),
		@NamedQuery(name = "findGuestStayInfoByRoomTypeContaining", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.roomType like ?1"),
		@NamedQuery(name = "findGuestStayInfoByTotalBill", query = "select myGuestStayInfo from GuestStayInfo myGuestStayInfo where myGuestStayInfo.totalBill = ?1") })
@Table(catalog = "pms", name = "guest_stay_info")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "StubPMS/ige/integration/domain", name = "GuestStayInfo")
@XmlRootElement(namespace = "StubPMS/ige/integration/domain")
public class GuestStayInfo implements Serializable {
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

	@Column(name = "room_number", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomNumber;
	/**
	 */

	@Column(name = "floor_number", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String floorNumber;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "arrival_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar arrivalDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "departure_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar departureDate;
	/**
	 */

	@Column(name = "folio_number", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String folioNumber;
	/**
	 */

	@Column(name = "total_bill", precision = 22)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal totalBill;
	/**
	 */
	
	@Column(name = "numberOfDays")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer numberOfDays;

	@Column(name = "payment_type", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String paymentType;
	
	@Column(name = "currencyCode", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String currencyCode;
	/**
	 */

	@Column(name = "credit_amount", precision = 22)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal creditAmount;
	/**
	 */

	@Column(name = "card_type", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String cardType;
	/**
	 */

	@Column(name = "card_number", length = 25)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String cardNumber;
	/**
	 */

	@Column(name = "balance_amount", precision = 22)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal balanceAmount;
	/**
	 */

	@Column(name = "room_type", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomType;
	/**
	 */

	@Column(name = "number_of_children")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer numberOfChildren;
	/**
	 */

	@Column(name = "number_of_adult")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer numberOfAdult;
	/**
	 */

	@Column(name = "room_rate", precision = 22)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal roomRate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creditcard_expiration_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar creditcardExpirationDate;
	/**
	 */

	@Column(name = "rate_code")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer rateCode;
	/**
	 */

	@Column(name = "reservation_type")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer reservationType;
	
	@Column(name = "isCheckedout")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean checkedOut;
	
	@Column(name = "roomFeatures", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomFeatures;
	
	@Column(name = "specialRequest", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String specialRequest;
	

	/**
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "guest_info_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	GuestInfo guestInfo;
	/**
	 */
	@OneToMany(mappedBy = "guestStayInfo", cascade = { CascadeType.REMOVE }, fetch = FetchType.EAGER)
	@XmlElement(name = "", namespace = "")
	java.util.Set<ige.integration.domain.GuestTransactions> guestTransactionses;

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

	
	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 */
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	/**
	 */
	public String getRoomNumber() {
		return this.roomNumber;
	}

	/**
	 */
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}

	/**
	 */
	public String getFloorNumber() {
		return this.floorNumber;
	}

	/**
	 */
	public void setArrivalDate(Calendar arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 */
	public Calendar getArrivalDate() {
		return this.arrivalDate;
	}
	
	

	public Integer getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(Integer numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	/**
	 */
	public void setDepartureDate(Calendar departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 */
	public Calendar getDepartureDate() {
		return this.departureDate;
	}

	/**
	 */
	public void setFolioNumber(String folioNumber) {
		this.folioNumber = folioNumber;
	}

	/**
	 */
	public String getFolioNumber() {
		return this.folioNumber;
	}

	/**
	 */
	public void setTotalBill(BigDecimal totalBill) {
		this.totalBill = totalBill;
	}

	/**
	 */
	public BigDecimal getTotalBill() {
		return this.totalBill;
	}

	/**
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 */
	public String getPaymentType() {
		return this.paymentType;
	}

	/**
	 */
	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	/**
	 */
	public BigDecimal getCreditAmount() {
		return this.creditAmount;
	}

	/**
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 */
	public String getCardType() {
		return this.cardType;
	}

	/**
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 */
	public String getCardNumber() {
		return this.cardNumber;
	}

	/**
	 */
	public void setBalanceAmount(BigDecimal balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	/**
	 */
	public BigDecimal getBalanceAmount() {
		return this.balanceAmount;
	}

	/**
	 */
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	/**
	 */
	public String getRoomType() {
		return this.roomType;
	}

	/**
	 */
	public void setNumberOfChildren(Integer numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	/**
	 */
	public Integer getNumberOfChildren() {
		return this.numberOfChildren;
	}

	/**
	 */
	public void setNumberOfAdult(Integer numberOfAdult) {
		this.numberOfAdult = numberOfAdult;
	}

	/**
	 */
	public Integer getNumberOfAdult() {
		return this.numberOfAdult;
	}

	/**
	 */
	public void setRoomRate(BigDecimal roomRate) {
		this.roomRate = roomRate;
	}

	/**
	 */
	public BigDecimal getRoomRate() {
		return this.roomRate;
	}

	/**
	 */
	public void setCreditcardExpirationDate(Calendar creditcardExpirationDate) {
		this.creditcardExpirationDate = creditcardExpirationDate;
	}

	/**
	 */
	public Calendar getCreditcardExpirationDate() {
		return this.creditcardExpirationDate;
	}

	/**
	 */
	public void setRateCode(Integer rateCode) {
		this.rateCode = rateCode;
	}

	/**
	 */
	public Integer getRateCode() {
		return this.rateCode;
	}

	/**
	 */
	public void setReservationType(Integer reservationType) {
		this.reservationType = reservationType;
	}

	/**
	 */
	public Integer getReservationType() {
		return this.reservationType;
	}

	/**
	 */
	public void setGuestInfo(GuestInfo guestInfo) {
		this.guestInfo = guestInfo;
	}

	/**
	 */
	public GuestInfo getGuestInfo() {
		return guestInfo;
	}

	/**
	 */
	public void setGuestTransactionses(Set<GuestTransactions> guestTransactionses) {
		this.guestTransactionses = guestTransactionses;
	}

	/**
	 */
	public Set<GuestTransactions> getGuestTransactionses() {
		if (guestTransactionses == null) {
			guestTransactionses = new java.util.LinkedHashSet<ige.integration.domain.GuestTransactions>();
		}
		return guestTransactionses;
	}

	/**
	 */
	public GuestStayInfo() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(GuestStayInfo that) {
		setId(that.getId());
		setRoomNumber(that.getRoomNumber());
		setFloorNumber(that.getFloorNumber());
		setArrivalDate(that.getArrivalDate());
		setDepartureDate(that.getDepartureDate());
		setFolioNumber(that.getFolioNumber());
		setTotalBill(that.getTotalBill());
		setPaymentType(that.getPaymentType());
		setCreditAmount(that.getCreditAmount());
		setCardType(that.getCardType());
		setCardNumber(that.getCardNumber());
		setBalanceAmount(that.getBalanceAmount());
		setRoomType(that.getRoomType());
		setNumberOfChildren(that.getNumberOfChildren());
		setNumberOfAdult(that.getNumberOfAdult());
		setRoomRate(that.getRoomRate());
		setCreditcardExpirationDate(that.getCreditcardExpirationDate());
		setRateCode(that.getRateCode());
		setReservationType(that.getReservationType());
		setGuestInfo(that.getGuestInfo());
		setGuestTransactionses(new java.util.LinkedHashSet<ige.integration.domain.GuestTransactions>(that.getGuestTransactionses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("roomNumber=[").append(roomNumber).append("] ");
		buffer.append("floorNumber=[").append(floorNumber).append("] ");
		buffer.append("arrivalDate=[").append(arrivalDate).append("] ");
		buffer.append("departureDate=[").append(departureDate).append("] ");
		buffer.append("folioNumber=[").append(folioNumber).append("] ");
		buffer.append("totalBill=[").append(totalBill).append("] ");
		buffer.append("paymentType=[").append(paymentType).append("] ");
		buffer.append("creditAmount=[").append(creditAmount).append("] ");
		buffer.append("cardType=[").append(cardType).append("] ");
		buffer.append("cardNumber=[").append(cardNumber).append("] ");
		buffer.append("balanceAmount=[").append(balanceAmount).append("] ");
		buffer.append("roomType=[").append(roomType).append("] ");
		buffer.append("numberOfChildren=[").append(numberOfChildren).append("] ");
		buffer.append("numberOfAdult=[").append(numberOfAdult).append("] ");
		buffer.append("roomRate=[").append(roomRate).append("] ");
		buffer.append("creditcardExpirationDate=[").append(creditcardExpirationDate).append("] ");
		buffer.append("rateCode=[").append(rateCode).append("] ");
		buffer.append("reservationType=[").append(reservationType).append("] ");

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
		if (!(obj instanceof GuestStayInfo))
			return false;
		GuestStayInfo equalCheck = (GuestStayInfo) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}

	public Boolean getCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(Boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	public String getRoomFeatures() {
		return roomFeatures;
	}

	public void setRoomFeatures(String roomFeatures) {
		this.roomFeatures = roomFeatures;
	}

	public String getSpecialRequest() {
		return specialRequest;
	}

	public void setSpecialRequest(String specialRequest) {
		this.specialRequest = specialRequest;
	}
	
}

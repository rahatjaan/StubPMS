package ige.integration.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllGuestTransactionss", query = "select myGuestTransactions from GuestTransactions myGuestTransactions"),
		@NamedQuery(name = "findGuestTransactionsByCharges", query = "select myGuestTransactions from GuestTransactions myGuestTransactions where myGuestTransactions.charges = ?1"),
		@NamedQuery(name = "findGuestTransactionsByDescription", query = "select myGuestTransactions from GuestTransactions myGuestTransactions where myGuestTransactions.description = ?1"),
		@NamedQuery(name = "findGuestTransactionsByDescriptionContaining", query = "select myGuestTransactions from GuestTransactions myGuestTransactions where myGuestTransactions.description like ?1"),
		@NamedQuery(name = "findGuestTransactionsById", query = "select myGuestTransactions from GuestTransactions myGuestTransactions where myGuestTransactions.id = ?1"),
		@NamedQuery(name = "findGuestTransactionsByPrimaryKey", query = "select myGuestTransactions from GuestTransactions myGuestTransactions where myGuestTransactions.id = ?1"),
		@NamedQuery(name = "findGuestTransactionsByReferenceNumber", query = "select myGuestTransactions from GuestTransactions myGuestTransactions where myGuestTransactions.referenceNumber = ?1"),
		@NamedQuery(name = "findGuestTransactionsByReferenceNumberContaining", query = "select myGuestTransactions from GuestTransactions myGuestTransactions where myGuestTransactions.referenceNumber like ?1"),
		@NamedQuery(name = "findGuestTransactionsByTransactionDate", query = "select myGuestTransactions from GuestTransactions myGuestTransactions where myGuestTransactions.transactionDate = ?1"),
		@NamedQuery(name = "findGuestTransactionsByTransactionId", query = "select myGuestTransactions from GuestTransactions myGuestTransactions where myGuestTransactions.transactionId = ?1"),
		@NamedQuery(name = "findGuestTransactionsByTransactionIdContaining", query = "select myGuestTransactions from GuestTransactions myGuestTransactions where myGuestTransactions.transactionId like ?1") })
@Table(catalog = "pms", name = "guest_transactions")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "StubPMS/ige/integration/domain", name = "GuestTransactions")
public class GuestTransactions implements Serializable {
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
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "transaction_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar transactionDate;
	/**
	 */

	@Column(name = "description", length = 60)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;
	/**
	 */

	@Column(name = "reference_number", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String referenceNumber;
	/**
	 */

	@Column(name = "transaction_id", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String transactionId;
	/**
	 */

	@Column(name = "charges", precision = 22)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal charges;

	/**
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "guest_stay_info_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	GuestStayInfo guestStayInfo;

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
	public void setTransactionDate(Calendar transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 */
	public Calendar getTransactionDate() {
		return this.transactionDate;
	}

	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	/**
	 */
	public String getReferenceNumber() {
		return this.referenceNumber;
	}

	/**
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 */
	public String getTransactionId() {
		return this.transactionId;
	}

	/**
	 */
	public void setCharges(BigDecimal charges) {
		this.charges = charges;
	}

	/**
	 */
	public BigDecimal getCharges() {
		return this.charges;
	}

	/**
	 */
	public void setGuestStayInfo(GuestStayInfo guestStayInfo) {
		this.guestStayInfo = guestStayInfo;
	}

	/**
	 */
	public GuestStayInfo getGuestStayInfo() {
		return guestStayInfo;
	}

	/**
	 */
	public GuestTransactions() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(GuestTransactions that) {
		setId(that.getId());
		setTransactionDate(that.getTransactionDate());
		setDescription(that.getDescription());
		setReferenceNumber(that.getReferenceNumber());
		setTransactionId(that.getTransactionId());
		setCharges(that.getCharges());
		setGuestStayInfo(that.getGuestStayInfo());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("transactionDate=[").append(transactionDate).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("referenceNumber=[").append(referenceNumber).append("] ");
		buffer.append("transactionId=[").append(transactionId).append("] ");
		buffer.append("charges=[").append(charges).append("] ");

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
		if (!(obj instanceof GuestTransactions))
			return false;
		GuestTransactions equalCheck = (GuestTransactions) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}

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
		@NamedQuery(name = "findAllReportProblems", query = "select myReportProblems from ReportProblem myReportProblems") })
@Table(catalog = "pms", name = "report_problem")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "StubPMS/ige/integration/domain", name = "ReportProblem")
public class ReportProblem implements Serializable {
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

	@Column(name = "last_name", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String lastName;
	/**
	 */

	@Column(name = "confirmation_number", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String confirmationNumber;
	/**
	 */

	@Column(name = "room_number", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomNumber;
	
	@Column(name = "problem_id", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String problemId;
	
	@Column(name = "problem_message", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String problemMessage;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getProblemId() {
		return problemId;
	}

	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}

	public String getProblemMessage() {
		return problemMessage;
	}

	public void setProblemMessage(String problemMessage) {
		this.problemMessage = problemMessage;
	}

	/**
	 */
	public ReportProblem() {
	}
	
	

	public ReportProblem(String lastName, String confirmationNumber,
			String roomNumber, String problemId, String problemMessage) {
		super();
		this.lastName = lastName;
		this.confirmationNumber = confirmationNumber;
		this.roomNumber = roomNumber;
		this.problemId = problemId;
		this.problemMessage = problemMessage;
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ReportProblem that) {
		setId(that.getId());
		setLastName(that.getLastName());
		setConfirmationNumber(that.getConfirmationNumber());
		setRoomNumber(that.getRoomNumber());
		setProblemId(that.getProblemId());
		setProblemMessage(that.getProblemMessage());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("lastName=[").append(lastName).append("] ");
		buffer.append("confirmationNumber=[").append(confirmationNumber).append("] ");
		buffer.append("roomNumber=[").append(roomNumber).append("] ");
		buffer.append("problemId=[").append(problemId).append("] ");
		buffer.append("problemMessage=[").append(problemMessage).append("] ");

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
		if (!(obj instanceof ReportProblem))
			return false;
		ReportProblem equalCheck = (ReportProblem) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}

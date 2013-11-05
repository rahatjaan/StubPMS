package ige.integration.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;


public class HotelFolio {
	
	
	private String terminalId;
	private String reservationNumber;
	private String folioType;
	private String folioId;
	private String folioContent;
	private String error;
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getReservationNumber() {
		return reservationNumber;
	}
	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
	public String getFolioType() {
		return folioType;
	}
	public void setFolioType(String folioType) {
		this.folioType = folioType;
	}
	public String getFolioId() {
		return folioId;
	}
	public void setFolioId(String folioId) {
		this.folioId = folioId;
	}
	public String getFolioContent() {
		return folioContent;
	}
	public void setFolioContent(String folioContent) {
		this.folioContent = folioContent;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}	
	
}

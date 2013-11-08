package ige.integration.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;


public class ReservationDetails {
	
	
	private String confirmationNumber;
	private String lastName;
	private String loyaltyCardNumber;
	private String firstName;
	private String roomFeatures;
	private int totalGuests;
	private String stayDates;
	private String specialRequests;
	private String totalForStay;
	private String namePrefix;
	private String maskedCardNumber;
	private String currencyCode;
	private String error;
	private String roomNumber;
	public String getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLoyaltyCardNumber() {
		return loyaltyCardNumber;
	}
	public void setLoyaltyCardNumber(String loyaltyCardNumber) {
		this.loyaltyCardNumber = loyaltyCardNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getRoomFeatures() {
		return roomFeatures;
	}
	public void setRoomFeatures(String roomFeatures) {
		this.roomFeatures = roomFeatures;
	}
	public int getTotalGuests() {
		return totalGuests;
	}
	public void setTotalGuests(int totalGuests) {
		this.totalGuests = totalGuests;
	}
	public String getStayDates() {
		return stayDates;
	}
	public void setStayDates(String stayDates) {
		this.stayDates = stayDates;
	}
	public String getSpecialRequests() {
		return specialRequests;
	}
	public void setSpecialRequests(String specialRequests) {
		this.specialRequests = specialRequests;
	}
	public String getTotalForStay() {
		return totalForStay;
	}
	public void setTotalForStay(String totalForStay) {
		this.totalForStay = totalForStay;
	}
	public String getNamePrefix() {
		return namePrefix;
	}
	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}
	public String getMaskedCardNumber() {
		return maskedCardNumber;
	}
	public void setMaskedCardNumber(String maskedCardNumber) {
		this.maskedCardNumber = maskedCardNumber;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
}

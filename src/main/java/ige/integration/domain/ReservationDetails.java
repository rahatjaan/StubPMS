package ige.integration.domain;

import java.io.Serializable;

public class ReservationDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private String confirmationNumber;
	private String lastName;
	private String creditCard;
	private String loyaltyNumber;
	private String guestName;
	private String roomFeatures;
	private int totalGuests;
	private String stayDates;
	private String specialRequests;
	private String totalBill;
	
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
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getLoyaltyNumber() {
		return loyaltyNumber;
	}
	public void setLoyaltyNumber(String loyaltyNumber) {
		this.loyaltyNumber = loyaltyNumber;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
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
	public String getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(String totalBill) {
		this.totalBill = totalBill;
	}
	
}

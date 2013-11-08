package ige.integration.service;

import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for GuestInfo entities
 * 
 */
public interface GuestInfoService {

	/**
	 * Delete an existing GuestInfo entity
	 * 
	 */
	public void deleteGuestInfo(GuestInfo guestinfo);

	/**
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	public GuestInfo saveGuestInfoGuestStayInfos(Integer id, GuestStayInfo related_gueststayinfos);

	/**
	 * Return all GuestInfo entity
	 * 
	 */
	public List<GuestInfo> findAllGuestInfos(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	public GuestInfo deleteGuestInfoGuestStayInfos(Integer guestinfo_id, Integer related_gueststayinfos_id);

	/**
	 * Load an existing GuestInfo entity
	 * 
	 */
	public Set<GuestInfo> loadGuestInfos();

	/**
	 * Return a count of all GuestInfo entity
	 * 
	 */
	public Integer countGuestInfos();

	/**
	 * Save an existing GuestInfo entity
	 * 
	 */
	public GuestInfo saveGuestInfo(GuestInfo guestinfo_1);

	/**
	 */
	public GuestInfo findGuestInfoByPrimaryKey(Integer id_1);
	public GuestInfo findGuestByEmailLastNameRoom(String lastName, String email, String roomNumber);
	public Object findGuestBillInfo(String emailAddress, String lastName, String roomNumber);
	public GuestInfo findGuestByEmail(String emailAddress);
	
	
	public Object findGuestInfoByConfirmationNumber(String confirmationNumber);
	public Object findGuestInfoByLastNameCreditCard(String lastName, String creditCard);
	public Object findGuestInfoByLastNameRoom(String lastName, String room);
	public Object findGuestInfoByLoyaltyNumber(String loyaltyNumber);
	public Object findGuestByReservationNumber(String reservationNumber) throws IllegalArgumentException, NullPointerException;
	
}
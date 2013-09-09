package ige.integration.service;

import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for GuestStayInfo entities
 * 
 */
public interface GuestStayInfoService {

	/**
	 * Delete an existing GuestInfo entity
	 * 
	 */
	public GuestStayInfo deleteGuestStayInfoGuestInfo(Integer gueststayinfo_id, Integer related_guestinfo_id);

	/**
	 * Return a count of all GuestStayInfo entity
	 * 
	 */
	public Integer countGuestStayInfos();

	/**
	 * Save an existing GuestTransactions entity
	 * 
	 */
	public GuestStayInfo saveGuestStayInfoGuestTransactionses(Integer id, GuestTransactions related_guesttransactionses);

	/**
	 * Save an existing GuestInfo entity
	 * 
	 */
	public GuestStayInfo saveGuestStayInfoGuestInfo(Integer id_1, GuestInfo related_guestinfo);

	/**
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	public void deleteGuestStayInfo(GuestStayInfo gueststayinfo);

	/**
	 * Return all GuestStayInfo entity
	 * 
	 */
	public List<GuestStayInfo> findAllGuestStayInfos(Integer startResult, Integer maxRows);

	/**
	 */
	public GuestStayInfo findGuestStayInfoByPrimaryKey(Integer id_2);

	/**
	 * Delete an existing GuestTransactions entity
	 * 
	 */
	public GuestStayInfo deleteGuestStayInfoGuestTransactionses(Integer gueststayinfo_id_1, Integer related_guesttransactionses_id);

	/**
	 * Load an existing GuestStayInfo entity
	 * 
	 */
	public Set<GuestStayInfo> loadGuestStayInfos();

	/**
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	public void saveGuestStayInfo(GuestStayInfo gueststayinfo_1);
}
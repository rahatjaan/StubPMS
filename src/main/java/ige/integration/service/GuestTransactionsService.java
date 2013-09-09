package ige.integration.service;

import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for GuestTransactions entities
 * 
 */
public interface GuestTransactionsService {

	/**
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	public GuestTransactions saveGuestTransactionsGuestStayInfo(Integer id, GuestStayInfo related_gueststayinfo);

	/**
	 * Return a count of all GuestTransactions entity
	 * 
	 */
	public Integer countGuestTransactionss();

	/**
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	public GuestTransactions deleteGuestTransactionsGuestStayInfo(Integer guesttransactions_id, Integer related_gueststayinfo_id);

	/**
	 * Load an existing GuestTransactions entity
	 * 
	 */
	public Set<GuestTransactions> loadGuestTransactionss();

	/**
	 * Delete an existing GuestTransactions entity
	 * 
	 */
	public void deleteGuestTransactions(GuestTransactions guesttransactions);

	/**
	 * Save an existing GuestTransactions entity
	 * 
	 */
	public void saveGuestTransactions(GuestTransactions guesttransactions_1);

	/**
	 */
	public GuestTransactions findGuestTransactionsByPrimaryKey(Integer id_1);

	/**
	 * Return all GuestTransactions entity
	 * 
	 */
	public List<GuestTransactions> findAllGuestTransactionss(Integer startResult, Integer maxRows);
}
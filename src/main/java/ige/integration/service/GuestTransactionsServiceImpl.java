package ige.integration.service;

import ige.integration.dao.GuestStayInfoDAO;
import ige.integration.dao.GuestTransactionsDAO;

import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for GuestTransactions entities
 * 
 */

@Service("GuestTransactionsService")
@Transactional
public class GuestTransactionsServiceImpl implements GuestTransactionsService {

	/**
	 * DAO injected by Spring that manages GuestStayInfo entities
	 * 
	 */
	@Autowired
	private GuestStayInfoDAO guestStayInfoDAO;

	/**
	 * DAO injected by Spring that manages GuestTransactions entities
	 * 
	 */
	@Autowired
	private GuestTransactionsDAO guestTransactionsDAO;

	/**
	 * Instantiates a new GuestTransactionsServiceImpl.
	 *
	 */
	public GuestTransactionsServiceImpl() {
	}

	/**
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	@Transactional
	public GuestTransactions saveGuestTransactionsGuestStayInfo(Integer id, GuestStayInfo related_gueststayinfo) {
		GuestTransactions guesttransactions = guestTransactionsDAO.findGuestTransactionsByPrimaryKey(id, -1, -1);
		GuestStayInfo existingguestStayInfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(related_gueststayinfo.getId());

		// copy into the existing record to preserve existing relationships
		if (existingguestStayInfo != null) {
			existingguestStayInfo.setId(related_gueststayinfo.getId());
			existingguestStayInfo.setRoomNumber(related_gueststayinfo.getRoomNumber());
			existingguestStayInfo.setFloorNumber(related_gueststayinfo.getFloorNumber());
			existingguestStayInfo.setArrivalDate(related_gueststayinfo.getArrivalDate());
			existingguestStayInfo.setDepartureDate(related_gueststayinfo.getDepartureDate());
			existingguestStayInfo.setFolioNumber(related_gueststayinfo.getFolioNumber());
			existingguestStayInfo.setTotalBill(related_gueststayinfo.getTotalBill());
			existingguestStayInfo.setPaymentType(related_gueststayinfo.getPaymentType());
			existingguestStayInfo.setCreditAmount(related_gueststayinfo.getCreditAmount());
			existingguestStayInfo.setCardType(related_gueststayinfo.getCardType());
			existingguestStayInfo.setCardNumber(related_gueststayinfo.getCardNumber());
			existingguestStayInfo.setBalanceAmount(related_gueststayinfo.getBalanceAmount());
			existingguestStayInfo.setRoomType(related_gueststayinfo.getRoomType());
			existingguestStayInfo.setNumberOfChildren(related_gueststayinfo.getNumberOfChildren());
			existingguestStayInfo.setNumberOfAdult(related_gueststayinfo.getNumberOfAdult());
			existingguestStayInfo.setRoomRate(related_gueststayinfo.getRoomRate());
			existingguestStayInfo.setCreditcardExpirationDate(related_gueststayinfo.getCreditcardExpirationDate());
			existingguestStayInfo.setRateCode(related_gueststayinfo.getRateCode());
			existingguestStayInfo.setReservationType(related_gueststayinfo.getReservationType());
			related_gueststayinfo = existingguestStayInfo;
		}

		guesttransactions.setGuestStayInfo(related_gueststayinfo);
		related_gueststayinfo.getGuestTransactionses().add(guesttransactions);
		guesttransactions = guestTransactionsDAO.store(guesttransactions);
		guestTransactionsDAO.flush();

		related_gueststayinfo = guestStayInfoDAO.store(related_gueststayinfo);
		guestStayInfoDAO.flush();

		return guesttransactions;
	}

	/**
	 * Return a count of all GuestTransactions entity
	 * 
	 */
	@Transactional
	public Integer countGuestTransactionss() {
		return ((Long) guestTransactionsDAO.createQuerySingleResult("select count(o) from GuestTransactions o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	@Transactional
	public GuestTransactions deleteGuestTransactionsGuestStayInfo(Integer guesttransactions_id, Integer related_gueststayinfo_id) {
		GuestTransactions guesttransactions = guestTransactionsDAO.findGuestTransactionsByPrimaryKey(guesttransactions_id, -1, -1);
		GuestStayInfo related_gueststayinfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(related_gueststayinfo_id, -1, -1);

		guesttransactions.setGuestStayInfo(null);
		related_gueststayinfo.getGuestTransactionses().remove(guesttransactions);
		guesttransactions = guestTransactionsDAO.store(guesttransactions);
		guestTransactionsDAO.flush();

		related_gueststayinfo = guestStayInfoDAO.store(related_gueststayinfo);
		guestStayInfoDAO.flush();

		guestStayInfoDAO.remove(related_gueststayinfo);
		guestStayInfoDAO.flush();

		return guesttransactions;
	}

	/**
	 * Load an existing GuestTransactions entity
	 * 
	 */
	@Transactional
	public Set<GuestTransactions> loadGuestTransactionss() {
		return guestTransactionsDAO.findAllGuestTransactionss();
	}

	/**
	 * Delete an existing GuestTransactions entity
	 * 
	 */
	@Transactional
	public void deleteGuestTransactions(GuestTransactions guesttransactions) {
		guestTransactionsDAO.remove(guesttransactions);
		guestTransactionsDAO.flush();
	}

	/**
	 * Save an existing GuestTransactions entity
	 * 
	 */
	@Transactional
	public void saveGuestTransactions(GuestTransactions guesttransactions) {
		GuestTransactions existingGuestTransactions = guestTransactionsDAO.findGuestTransactionsByPrimaryKey(guesttransactions.getId());

		if (existingGuestTransactions != null) {
			if (existingGuestTransactions != guesttransactions) {
				existingGuestTransactions.setId(guesttransactions.getId());
				existingGuestTransactions.setTransactionDate(guesttransactions.getTransactionDate());
				existingGuestTransactions.setDescription(guesttransactions.getDescription());
				existingGuestTransactions.setReferenceNumber(guesttransactions.getReferenceNumber());
				existingGuestTransactions.setTransactionId(guesttransactions.getTransactionId());
				existingGuestTransactions.setCharges(guesttransactions.getCharges());
			}
			guesttransactions = guestTransactionsDAO.store(existingGuestTransactions);
		} else {
			guesttransactions = guestTransactionsDAO.store(guesttransactions);
		}
		guestTransactionsDAO.flush();
	}

	/**
	 */
	@Transactional
	public GuestTransactions findGuestTransactionsByPrimaryKey(Integer id) {
		return guestTransactionsDAO.findGuestTransactionsByPrimaryKey(id);
	}

	/**
	 * Return all GuestTransactions entity
	 * 
	 */
	@Transactional
	public List<GuestTransactions> findAllGuestTransactionss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<GuestTransactions>(guestTransactionsDAO.findAllGuestTransactionss(startResult, maxRows));
	}
}

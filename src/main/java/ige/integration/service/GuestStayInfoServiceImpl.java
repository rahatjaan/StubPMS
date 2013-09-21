package ige.integration.service;

import ige.integration.dao.GuestInfoDAO;
import ige.integration.dao.GuestStayInfoDAO;
import ige.integration.dao.GuestTransactionsDAO;
import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for GuestStayInfo entities
 * 
 */

@Service("GuestStayInfoService")
@Transactional
public class GuestStayInfoServiceImpl implements GuestStayInfoService {

	/**
	 * DAO injected by Spring that manages GuestInfo entities
	 * 
	 */
	@Autowired
	private GuestInfoDAO guestInfoDAO;

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
	 * Instantiates a new GuestStayInfoServiceImpl.
	 *
	 */
	public GuestStayInfoServiceImpl() {
	}

	/**
	 * Delete an existing GuestInfo entity
	 * 
	 */
	@Transactional
	public GuestStayInfo deleteGuestStayInfoGuestInfo(Integer gueststayinfo_id, Integer related_guestinfo_id) {
		GuestStayInfo gueststayinfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(gueststayinfo_id, -1, -1);
		GuestInfo related_guestinfo = guestInfoDAO.findGuestInfoByPrimaryKey(related_guestinfo_id, -1, -1);

		gueststayinfo.setGuestInfo(null);
		related_guestinfo.getGuestStayInfos().remove(gueststayinfo);
		gueststayinfo = guestStayInfoDAO.store(gueststayinfo);
		guestStayInfoDAO.flush();

		related_guestinfo = guestInfoDAO.store(related_guestinfo);
		guestInfoDAO.flush();

		guestInfoDAO.remove(related_guestinfo);
		guestInfoDAO.flush();

		return gueststayinfo;
	}

	/**
	 * Return a count of all GuestStayInfo entity
	 * 
	 */
	@Transactional
	public Integer countGuestStayInfos() {
		return ((Long) guestStayInfoDAO.createQuerySingleResult("select count(o) from GuestStayInfo o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing GuestTransactions entity
	 * 
	 */
	@Transactional
	public GuestStayInfo saveGuestStayInfoGuestTransactionses(Integer id, GuestTransactions related_guesttransactionses) {
		GuestStayInfo gueststayinfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(id, -1, -1);
		GuestTransactions existingguestTransactionses = guestTransactionsDAO.findGuestTransactionsByPrimaryKey(related_guesttransactionses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingguestTransactionses != null) {
			existingguestTransactionses.setId(related_guesttransactionses.getId());
			existingguestTransactionses.setTransactionDate(related_guesttransactionses.getTransactionDate());
			existingguestTransactionses.setDescription(related_guesttransactionses.getDescription());
			existingguestTransactionses.setReferenceNumber(related_guesttransactionses.getReferenceNumber());
			existingguestTransactionses.setTransactionId(related_guesttransactionses.getTransactionId());
			existingguestTransactionses.setCharges(related_guesttransactionses.getCharges());
			related_guesttransactionses = existingguestTransactionses;
		}

		related_guesttransactionses.setGuestStayInfo(gueststayinfo);
		gueststayinfo.getGuestTransactionses().add(related_guesttransactionses);
		related_guesttransactionses = guestTransactionsDAO.store(related_guesttransactionses);
		guestTransactionsDAO.flush();

		gueststayinfo = guestStayInfoDAO.store(gueststayinfo);
		guestStayInfoDAO.flush();

		return gueststayinfo;
	}

	/**
	 * Save an existing GuestInfo entity
	 * 
	 */
	@Transactional
	public GuestStayInfo saveGuestStayInfoGuestInfo(Integer id, GuestInfo related_guestinfo) {
		GuestStayInfo gueststayinfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(id, -1, -1);
		GuestInfo existingguestInfo = guestInfoDAO.findGuestInfoByPrimaryKey(related_guestinfo.getId());

		// copy into the existing record to preserve existing relationships
		if (existingguestInfo != null) {
			existingguestInfo.setId(related_guestinfo.getId());
			existingguestInfo.setFirstName(related_guestinfo.getFirstName());
			existingguestInfo.setLastName(related_guestinfo.getLastName());
			existingguestInfo.setFullAddress(related_guestinfo.getFullAddress());
			existingguestInfo.setMobileNumber(related_guestinfo.getMobileNumber());
			existingguestInfo.setRatePlan(related_guestinfo.getRatePlan());
			existingguestInfo.setHhNumber(related_guestinfo.getHhNumber());
			existingguestInfo.setAl(related_guestinfo.getAl());
			existingguestInfo.setBonusAl(related_guestinfo.getBonusAl());
			existingguestInfo.setConfirmationNumber(related_guestinfo.getConfirmationNumber());
			existingguestInfo.setMembershipNumber(related_guestinfo.getMembershipNumber());
			existingguestInfo.setBonusCode(related_guestinfo.getBonusCode());
			existingguestInfo.setGroupName(related_guestinfo.getGroupName());
			related_guestinfo = existingguestInfo;
		}

		gueststayinfo.setGuestInfo(related_guestinfo);
		related_guestinfo.getGuestStayInfos().add(gueststayinfo);
		gueststayinfo = guestStayInfoDAO.store(gueststayinfo);
		guestStayInfoDAO.flush();

		related_guestinfo = guestInfoDAO.store(related_guestinfo);
		guestInfoDAO.flush();

		return gueststayinfo;
	}

	/**
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	@Transactional
	public void deleteGuestStayInfo(GuestStayInfo gueststayinfo) {
		guestStayInfoDAO.remove(gueststayinfo);
		guestStayInfoDAO.flush();
	}

	/**
	 * Return all GuestStayInfo entity
	 * 
	 */
	@Transactional
	public List<GuestStayInfo> findAllGuestStayInfos(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<GuestStayInfo>(guestStayInfoDAO.findAllGuestStayInfos(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public GuestStayInfo findGuestStayInfoByPrimaryKey(Integer id) {
		return guestStayInfoDAO.findGuestStayInfoByPrimaryKey(id);
	}

	/**
	 * Delete an existing GuestTransactions entity
	 * 
	 */
	@Transactional
	public GuestStayInfo deleteGuestStayInfoGuestTransactionses(Integer gueststayinfo_id, Integer related_guesttransactionses_id) {
		GuestTransactions related_guesttransactionses = guestTransactionsDAO.findGuestTransactionsByPrimaryKey(related_guesttransactionses_id, -1, -1);

		GuestStayInfo gueststayinfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(gueststayinfo_id, -1, -1);

		related_guesttransactionses.setGuestStayInfo(null);
		gueststayinfo.getGuestTransactionses().remove(related_guesttransactionses);

		guestTransactionsDAO.remove(related_guesttransactionses);
		guestTransactionsDAO.flush();

		return gueststayinfo;
	}

	/**
	 * Load an existing GuestStayInfo entity
	 * 
	 */
	@Transactional
	public Set<GuestStayInfo> loadGuestStayInfos() {
		return guestStayInfoDAO.findAllGuestStayInfos();
	}

	/**
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	@Transactional
	public void saveGuestStayInfo(GuestStayInfo gueststayinfo) {
		GuestStayInfo existingGuestStayInfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(gueststayinfo.getId());

		if (existingGuestStayInfo != null) {
			if (existingGuestStayInfo != gueststayinfo) {
				existingGuestStayInfo.setId(gueststayinfo.getId());
				existingGuestStayInfo.setRoomNumber(gueststayinfo.getRoomNumber());
				existingGuestStayInfo.setFloorNumber(gueststayinfo.getFloorNumber());
				existingGuestStayInfo.setArrivalDate(gueststayinfo.getArrivalDate());
				existingGuestStayInfo.setDepartureDate(gueststayinfo.getDepartureDate());
				existingGuestStayInfo.setFolioNumber(gueststayinfo.getFolioNumber());
				existingGuestStayInfo.setTotalBill(gueststayinfo.getTotalBill());
				existingGuestStayInfo.setPaymentType(gueststayinfo.getPaymentType());
				existingGuestStayInfo.setCreditAmount(gueststayinfo.getCreditAmount());
				existingGuestStayInfo.setCardType(gueststayinfo.getCardType());
				existingGuestStayInfo.setCardNumber(gueststayinfo.getCardNumber());
				existingGuestStayInfo.setBalanceAmount(gueststayinfo.getBalanceAmount());
				existingGuestStayInfo.setRoomType(gueststayinfo.getRoomType());
				existingGuestStayInfo.setNumberOfChildren(gueststayinfo.getNumberOfChildren());
				existingGuestStayInfo.setNumberOfAdult(gueststayinfo.getNumberOfAdult());
				existingGuestStayInfo.setRoomRate(gueststayinfo.getRoomRate());
				existingGuestStayInfo.setCreditcardExpirationDate(gueststayinfo.getCreditcardExpirationDate());
				existingGuestStayInfo.setRateCode(gueststayinfo.getRateCode());
				existingGuestStayInfo.setReservationType(gueststayinfo.getReservationType());
			}
			gueststayinfo = guestStayInfoDAO.store(existingGuestStayInfo);
		} else {
			gueststayinfo = guestStayInfoDAO.store(gueststayinfo);
		}
		guestStayInfoDAO.flush();
	}
}

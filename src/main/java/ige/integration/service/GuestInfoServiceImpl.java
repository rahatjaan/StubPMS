package ige.integration.service;

import ige.integration.dao.GuestInfoDAO;
import ige.integration.dao.GuestStayInfoDAO;

import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for GuestInfo entities
 * 
 */

@Service("GuestInfoService")
@Transactional
public class GuestInfoServiceImpl implements GuestInfoService {

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
	 * Instantiates a new GuestInfoServiceImpl.
	 *
	 */
	public GuestInfoServiceImpl() {
	}

	/**
	 * Delete an existing GuestInfo entity
	 * 
	 */
	@Transactional
	public void deleteGuestInfo(GuestInfo guestinfo) {
		guestInfoDAO.remove(guestinfo);
		guestInfoDAO.flush();
	}

	/**
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	@Transactional
	public GuestInfo saveGuestInfoGuestStayInfos(Integer id, GuestStayInfo related_gueststayinfos) {
		GuestInfo guestinfo = guestInfoDAO.findGuestInfoByPrimaryKey(id, -1, -1);
		GuestStayInfo existingguestStayInfos = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(related_gueststayinfos.getId());

		// copy into the existing record to preserve existing relationships
		if (existingguestStayInfos != null) {
			existingguestStayInfos.setId(related_gueststayinfos.getId());
			existingguestStayInfos.setRoomNumber(related_gueststayinfos.getRoomNumber());
			existingguestStayInfos.setFloorNumber(related_gueststayinfos.getFloorNumber());
			existingguestStayInfos.setArrivalDate(related_gueststayinfos.getArrivalDate());
			existingguestStayInfos.setDepartureDate(related_gueststayinfos.getDepartureDate());
			existingguestStayInfos.setFolioNumber(related_gueststayinfos.getFolioNumber());
			existingguestStayInfos.setTotalBill(related_gueststayinfos.getTotalBill());
			existingguestStayInfos.setPaymentType(related_gueststayinfos.getPaymentType());
			existingguestStayInfos.setCreditAmount(related_gueststayinfos.getCreditAmount());
			existingguestStayInfos.setCardType(related_gueststayinfos.getCardType());
			existingguestStayInfos.setCardNumber(related_gueststayinfos.getCardNumber());
			existingguestStayInfos.setBalanceAmount(related_gueststayinfos.getBalanceAmount());
			existingguestStayInfos.setRoomType(related_gueststayinfos.getRoomType());
			existingguestStayInfos.setNumberOfChildren(related_gueststayinfos.getNumberOfChildren());
			existingguestStayInfos.setNumberOfAdult(related_gueststayinfos.getNumberOfAdult());
			existingguestStayInfos.setRoomRate(related_gueststayinfos.getRoomRate());
			existingguestStayInfos.setCreditcardExpirationDate(related_gueststayinfos.getCreditcardExpirationDate());
			existingguestStayInfos.setRateCode(related_gueststayinfos.getRateCode());
			existingguestStayInfos.setReservationType(related_gueststayinfos.getReservationType());
			related_gueststayinfos = existingguestStayInfos;
		}

		related_gueststayinfos.setGuestInfo(guestinfo);
		guestinfo.getGuestStayInfos().add(related_gueststayinfos);
		related_gueststayinfos = guestStayInfoDAO.store(related_gueststayinfos);
		guestStayInfoDAO.flush();

		guestinfo = guestInfoDAO.store(guestinfo);
		guestInfoDAO.flush();

		return guestinfo;
	}

	/**
	 * Return all GuestInfo entity
	 * 
	 */
	@Transactional
	public List<GuestInfo> findAllGuestInfos(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<GuestInfo>(guestInfoDAO.findAllGuestInfos(startResult, maxRows));
	}

	/**
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	@Transactional
	public GuestInfo deleteGuestInfoGuestStayInfos(Integer guestinfo_id, Integer related_gueststayinfos_id) {
		GuestStayInfo related_gueststayinfos = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(related_gueststayinfos_id, -1, -1);

		GuestInfo guestinfo = guestInfoDAO.findGuestInfoByPrimaryKey(guestinfo_id, -1, -1);

		related_gueststayinfos.setGuestInfo(null);
		guestinfo.getGuestStayInfos().remove(related_gueststayinfos);

		guestStayInfoDAO.remove(related_gueststayinfos);
		guestStayInfoDAO.flush();

		return guestinfo;
	}

	/**
	 * Load an existing GuestInfo entity
	 * 
	 */
	@Transactional
	public Set<GuestInfo> loadGuestInfos() {
		return guestInfoDAO.findAllGuestInfos();
	}

	/**
	 * Return a count of all GuestInfo entity
	 * 
	 */
	@Transactional
	public Integer countGuestInfos() {
		return ((Long) guestInfoDAO.createQuerySingleResult("select count(o) from GuestInfo o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing GuestInfo entity
	 * 
	 */
	@Transactional
	public void saveGuestInfo(GuestInfo guestinfo) {
		GuestInfo existingGuestInfo = guestInfoDAO.findGuestInfoByPrimaryKey(guestinfo.getId());

		if (existingGuestInfo != null) {
			if (existingGuestInfo != guestinfo) {
				existingGuestInfo.setId(guestinfo.getId());
				existingGuestInfo.setFirstName(guestinfo.getFirstName());
				existingGuestInfo.setLastName(guestinfo.getLastName());
				existingGuestInfo.setFullAddress(guestinfo.getFullAddress());
				existingGuestInfo.setMobileNumber(guestinfo.getMobileNumber());
				existingGuestInfo.setRatePlan(guestinfo.getRatePlan());
				existingGuestInfo.setHhNumber(guestinfo.getHhNumber());
				existingGuestInfo.setAl(guestinfo.getAl());
				existingGuestInfo.setBonusAl(guestinfo.getBonusAl());
				existingGuestInfo.setConfirmationNumber(guestinfo.getConfirmationNumber());
				existingGuestInfo.setMembershipNumber(guestinfo.getMembershipNumber());
				existingGuestInfo.setBonusCode(guestinfo.getBonusCode());
				existingGuestInfo.setGroupName(guestinfo.getGroupName());
			}
			guestinfo = guestInfoDAO.store(existingGuestInfo);
		} else {
			guestinfo = guestInfoDAO.store(guestinfo);
		}
		guestInfoDAO.flush();
	}

	/**
	 */
	@Transactional
	public GuestInfo findGuestInfoByPrimaryKey(Integer id) {
		return guestInfoDAO.findGuestInfoByPrimaryKey(id);
	}

	public GuestInfo findGuestBillInfo(String emailAddress, String lastName, String roomNumber) {
		return guestInfoDAO.findGuestBillInfo(emailAddress, lastName, roomNumber);
	}
}

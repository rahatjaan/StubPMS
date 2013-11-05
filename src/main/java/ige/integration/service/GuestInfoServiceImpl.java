package ige.integration.service;

import ige.integration.dao.GuestInfoDAO;
import ige.integration.dao.GuestStayInfoDAO;
import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
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
	public GuestInfo saveGuestInfo(GuestInfo guestinfo) {
		System.out.println("PRIMARY KEY IS: "+guestinfo.getId());
		GuestInfo existingGuestInfo = guestInfoDAO.findGuestInfoByPrimaryKey(guestinfo.getId());
		
		if (existingGuestInfo != null) {
			System.out.println("FOUND");
			if (existingGuestInfo != guestinfo) {
				existingGuestInfo.setId(guestinfo.getId());
				existingGuestInfo.setFirstName(guestinfo.getFirstName());
				existingGuestInfo.setLastName(guestinfo.getLastName());
				existingGuestInfo.setFullAddress(guestinfo.getFullAddress());
				existingGuestInfo.setMobileNumber(guestinfo.getMobileNumber());
				existingGuestInfo.setRatePlan(guestinfo.getRatePlan());
				existingGuestInfo.setLoyaltyNumber(guestinfo.getLoyaltyNumber());
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

		// Call ESB here
		try{
			GuestStayInfo gsi = null;
			Collection c = guestinfo.getGuestStayInfos();
			Iterator iter = c.iterator();
			gsi = (GuestStayInfo) iter.next();
			Calendar d1 = gsi.getArrivalDate();
			int days = 0;
			if(null != gsi.getNumberOfDays())
				days = gsi.getNumberOfDays();
			d1.add(Calendar.DAY_OF_MONTH, days);
			if(0 < days)
				gsi.setDepartureDate(d1);
			
			String urlParameters = "{  'guestCheckIn'= { 'tenantId'='1',   'guestInfo'= {    'firstName'= '"+guestinfo.getFirstName()+"',    'lastName'= '"+guestinfo.getLastName()+"',   'email'= '"+guestinfo.getEmail()+"'},    'guestStayInfo'= {    'roomNumber'= '"+gsi.getRoomNumber()+"',   'arrivalDate'= '"+gsi.getArrivalDate()+"',    'departureDate'= '"+gsi.getDepartureDate()+"'    }  }}";
			try{
				URL url = new URL("http://50.31.3.184:8888/guestCheckIn");
				URLConnection conn = url.openConnection();
		
				conn.setDoOutput(true);
		
				OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
		
				writer.write(urlParameters);
				writer.flush();
		
				String line;
				BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
				while ((line = reader.readLine()) != null) {
				    System.out.println(line);
				}
				writer.close();
				reader.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		// Ends here
		return guestinfo;
	}

	/**
	 */
	@Transactional
	public GuestInfo findGuestInfoByPrimaryKey(Integer id) {
		return guestInfoDAO.findGuestInfoByPrimaryKey(id);
	}

	public Object findGuestBillInfo(String emailAddress, String lastName, String roomNumber) {
		return guestInfoDAO.findGuestBillInfo(emailAddress, lastName, roomNumber);
	}

	public GuestInfo findGuestByEmailLastNameRoom(String lastName,
			String email, String roomNumber) {
		return guestInfoDAO.findGuestByEmailLastNameRoom(lastName, email, roomNumber);
	}

	public GuestInfo findGuestByEmail(String emailAddress) {
		return guestInfoDAO.findGuestInfoByEmail(emailAddress);
	}
	
	public GuestInfo findGuestInfoByConfirmationNumber(String confirmationNumber) {
		return guestInfoDAO.findGuestInfoByConfirmationNumbers(confirmationNumber);
	}
	
	public GuestInfo findGuestInfoByLastNameCreditCard(String lastName, String creditCard) {
		GuestStayInfo gsi = guestInfoDAO.findGuestInfoByLastNameCreditCard(lastName, creditCard);
		GuestInfo gi = new GuestInfo();
		Set<GuestStayInfo> g = new HashSet<GuestStayInfo>();
		g.add(gsi);
		gi.setGuestStayInfos(g);
		return gi;
	}
	
	public GuestInfo findGuestInfoByLoyaltyNumber(String loyaltyNumber) {
		return guestInfoDAO.findGuestInfoByLoyaltyNumber(loyaltyNumber);
	}
	
	public GuestStayInfo findGuestByReservationNumber(String reservationNumber) throws IllegalArgumentException, NullPointerException{
		return guestInfoDAO.findGuestByReservationNumber(reservationNumber);
	}
}

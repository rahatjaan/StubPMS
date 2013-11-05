package ige.integration.dao;

import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;
import org.springframework.dao.DataAccessException;

/**
 * DAO to manage GuestInfo entities.
 * 
 */
public interface GuestInfoDAO extends JpaDao<GuestInfo> {

	/**
	 * JPQL Query - findGuestInfoByFullAddressContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByFullAddressContaining(String fullAddress) throws DataAccessException;
	
	public Object findGuestBillInfo(String emailAddress, String lastName, String roomNumber);

	/**
	 * JPQL Query - findGuestInfoByFullAddressContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByFullAddressContaining(String fullAddress, int startResult, int maxRows) throws DataAccessException;
	
	public GuestInfo findGuestByEmailLastNameRoom(String lastName,
			String email, String roomNumber);

	/**
	 * JPQL Query - findGuestInfoByAlContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByAlContaining(String al) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByAlContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByAlContaining(String al, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByFirstName
	 *
	 */
	public Set<GuestInfo> findGuestInfoByFirstName(String firstName) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByFirstName
	 *
	 */
	public Set<GuestInfo> findGuestInfoByFirstName(String firstName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByMobileNumberContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByMobileNumberContaining(String mobileNumber) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByMobileNumberContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByMobileNumberContaining(String mobileNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByBonusCode
	 *
	 */
	public Set<GuestInfo> findGuestInfoByBonusCode(String bonusCode) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByBonusCode
	 *
	 */
	public Set<GuestInfo> findGuestInfoByBonusCode(String bonusCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByGroupName
	 *
	 */
	public Set<GuestInfo> findGuestInfoByGroupName(String groupName) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByGroupName
	 *
	 */
	public Set<GuestInfo> findGuestInfoByGroupName(String groupName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByRatePlan
	 *
	 */
	public Set<GuestInfo> findGuestInfoByRatePlan(String ratePlan) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByRatePlan
	 *
	 */
	public Set<GuestInfo> findGuestInfoByRatePlan(String ratePlan, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByLastNameContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByLastNameContaining(String lastName) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByLastNameContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByHhNumberContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByHhNumberContaining(String hhNumber) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByHhNumberContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByHhNumberContaining(String hhNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByMobileNumber
	 *
	 */
	public Set<GuestInfo> findGuestInfoByMobileNumber(String mobileNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByMobileNumber
	 *
	 */
	public Set<GuestInfo> findGuestInfoByMobileNumber(String mobileNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByHhNumber
	 *
	 */
	public Set<GuestInfo> findGuestInfoByHhNumber(String hhNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByHhNumber
	 *
	 */
	public Set<GuestInfo> findGuestInfoByHhNumber(String hhNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByBonusAl
	 *
	 */
	public Set<GuestInfo> findGuestInfoByBonusAl(String bonusAl) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByBonusAl
	 *
	 */
	public Set<GuestInfo> findGuestInfoByBonusAl(String bonusAl, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByAl
	 *
	 */
	public Set<GuestInfo> findGuestInfoByAl(String al_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByAl
	 *
	 */
	public Set<GuestInfo> findGuestInfoByAl(String al_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoById
	 *
	 */
	public GuestInfo findGuestInfoById(Integer id) throws DataAccessException;
	
	public GuestInfo findGuestInfoByEmail(String emailAddress) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoById
	 *
	 */
	public GuestInfo findGuestInfoById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByRatePlanContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByRatePlanContaining(String ratePlan_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByRatePlanContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByRatePlanContaining(String ratePlan_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByFullAddress
	 *
	 */
	public Set<GuestInfo> findGuestInfoByFullAddress(String fullAddress_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByFullAddress
	 *
	 */
	public Set<GuestInfo> findGuestInfoByFullAddress(String fullAddress_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByMembershipNumberContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByMembershipNumberContaining(String membershipNumber) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByMembershipNumberContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByMembershipNumberContaining(String membershipNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByFirstNameContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByFirstNameContaining(String firstName_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByFirstNameContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByFirstNameContaining(String firstName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByGroupNameContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByGroupNameContaining(String groupName_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByGroupNameContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByGroupNameContaining(String groupName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByPrimaryKey
	 *
	 */
	public GuestInfo findGuestInfoByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByPrimaryKey
	 *
	 */
	public GuestInfo findGuestInfoByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByConfirmationNumber
	 *
	 */
	public Set<GuestInfo> findGuestInfoByConfirmationNumber(String confirmationNumber) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByConfirmationNumber
	 *
	 */
	public Set<GuestInfo> findGuestInfoByConfirmationNumber(String confirmationNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByBonusAlContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByBonusAlContaining(String bonusAl_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByBonusAlContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByBonusAlContaining(String bonusAl_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByConfirmationNumberContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByConfirmationNumberContaining(String confirmationNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByConfirmationNumberContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByConfirmationNumberContaining(String confirmationNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllGuestInfos
	 *
	 */
	public Set<GuestInfo> findAllGuestInfos() throws DataAccessException;

	/**
	 * JPQL Query - findAllGuestInfos
	 *
	 */
	public Set<GuestInfo> findAllGuestInfos(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByBonusCodeContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByBonusCodeContaining(String bonusCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByBonusCodeContaining
	 *
	 */
	public Set<GuestInfo> findGuestInfoByBonusCodeContaining(String bonusCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByMembershipNumber
	 *
	 */
	public Set<GuestInfo> findGuestInfoByMembershipNumber(String membershipNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByMembershipNumber
	 *
	 */
	public Set<GuestInfo> findGuestInfoByMembershipNumber(String membershipNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByLastName
	 *
	 */
	public Set<GuestInfo> findGuestInfoByLastName(String lastName_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestInfoByLastName
	 *
	 */
	public Set<GuestInfo> findGuestInfoByLastName(String lastName_1, int startResult, int maxRows) throws DataAccessException;
	
	public GuestInfo findGuestInfoByConfirmationNumbers(String confirmationNumber);
	public GuestStayInfo findGuestInfoByLastNameCreditCard(String lastName, String creditCard);
	public GuestInfo findGuestInfoByLoyaltyNumber(String loyaltyNumber);
	public GuestStayInfo findGuestByReservationNumber(String reservationNumber) throws IllegalArgumentException, NullPointerException;

}
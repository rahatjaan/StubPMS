package ige.integration.dao;

import ige.integration.domain.GuestStayInfo;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage GuestStayInfo entities.
 * 
 */
public interface GuestStayInfoDAO extends JpaDao<GuestStayInfo> {

	/**
	 * JPQL Query - findGuestStayInfoByRoomType
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRoomType(String roomType) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByRoomType
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRoomType(String roomType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByReservationType
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByReservationType(Integer reservationType) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByReservationType
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByReservationType(Integer reservationType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByTotalBill
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByTotalBill(java.math.BigDecimal totalBill) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByTotalBill
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByTotalBill(BigDecimal totalBill, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCardNumber
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCardNumber(String cardNumber) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCardNumber
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCardNumber(String cardNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCardNumberContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCardNumberContaining(String cardNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCardNumberContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCardNumberContaining(String cardNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByRoomNumber
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRoomNumber(String roomNumber) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByRoomNumber
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRoomNumber(String roomNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCreditAmount
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCreditAmount(java.math.BigDecimal creditAmount) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCreditAmount
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCreditAmount(BigDecimal creditAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByNumberOfAdult
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByNumberOfAdult(Integer numberOfAdult) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByNumberOfAdult
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByNumberOfAdult(Integer numberOfAdult, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCardType
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCardType(String cardType) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCardType
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCardType(String cardType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByArrivalDate
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByArrivalDate(java.util.Calendar arrivalDate) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByArrivalDate
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByArrivalDate(Calendar arrivalDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByPaymentType
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByPaymentType(String paymentType) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByPaymentType
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByPaymentType(String paymentType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByDepartureDate
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByDepartureDate(java.util.Calendar departureDate) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByDepartureDate
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByDepartureDate(Calendar departureDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByRateCode
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRateCode(Integer rateCode) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByRateCode
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRateCode(Integer rateCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByRoomTypeContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRoomTypeContaining(String roomType_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByRoomTypeContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRoomTypeContaining(String roomType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByFolioNumberContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByFolioNumberContaining(String folioNumber) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByFolioNumberContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByFolioNumberContaining(String folioNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByPrimaryKey
	 *
	 */
	public GuestStayInfo findGuestStayInfoByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByPrimaryKey
	 *
	 */
	public GuestStayInfo findGuestStayInfoByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByPaymentTypeContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByPaymentTypeContaining(String paymentType_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByPaymentTypeContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByPaymentTypeContaining(String paymentType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByFolioNumber
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByFolioNumber(String folioNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByFolioNumber
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByFolioNumber(String folioNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCardTypeContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCardTypeContaining(String cardType_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCardTypeContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCardTypeContaining(String cardType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByFloorNumberContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByFloorNumberContaining(String floorNumber) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByFloorNumberContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByFloorNumberContaining(String floorNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByBalanceAmount
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByBalanceAmount(java.math.BigDecimal balanceAmount) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByBalanceAmount
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByBalanceAmount(BigDecimal balanceAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoById
	 *
	 */
	public GuestStayInfo findGuestStayInfoById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoById
	 *
	 */
	public GuestStayInfo findGuestStayInfoById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCreditcardExpirationDate
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCreditcardExpirationDate(java.util.Calendar creditcardExpirationDate) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByCreditcardExpirationDate
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByCreditcardExpirationDate(Calendar creditcardExpirationDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByRoomRate
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRoomRate(java.math.BigDecimal roomRate) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByRoomRate
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRoomRate(BigDecimal roomRate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByNumberOfChildren
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByNumberOfChildren(Integer numberOfChildren) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByNumberOfChildren
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByNumberOfChildren(Integer numberOfChildren, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllGuestStayInfos
	 *
	 */
	public Set<GuestStayInfo> findAllGuestStayInfos() throws DataAccessException;

	/**
	 * JPQL Query - findAllGuestStayInfos
	 *
	 */
	public Set<GuestStayInfo> findAllGuestStayInfos(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByFloorNumber
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByFloorNumber(String floorNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByFloorNumber
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByFloorNumber(String floorNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByRoomNumberContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRoomNumberContaining(String roomNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestStayInfoByRoomNumberContaining
	 *
	 */
	public Set<GuestStayInfo> findGuestStayInfoByRoomNumberContaining(String roomNumber_1, int startResult, int maxRows) throws DataAccessException;

}
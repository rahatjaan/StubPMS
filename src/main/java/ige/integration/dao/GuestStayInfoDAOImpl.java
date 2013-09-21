package ige.integration.dao;

import ige.integration.domain.GuestStayInfo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage GuestStayInfo entities.
 * 
 */
@Repository("GuestStayInfoDAO")
@Transactional
public class GuestStayInfoDAOImpl extends AbstractJpaDao<GuestStayInfo>
		implements GuestStayInfoDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { GuestStayInfo.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MySQL
	 *
	 */
	@PersistenceContext(unitName = "MySQL")
	private EntityManager entityManager;

	/**
	 * Instantiates a new GuestStayInfoDAOImpl
	 *
	 */
	public GuestStayInfoDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findGuestStayInfoByRoomType
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRoomType(String roomType) throws DataAccessException {

		return findGuestStayInfoByRoomType(roomType, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByRoomType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRoomType(String roomType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByRoomType", startResult, maxRows, roomType);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByReservationType
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByReservationType(Integer reservationType) throws DataAccessException {

		return findGuestStayInfoByReservationType(reservationType, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByReservationType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByReservationType(Integer reservationType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByReservationType", startResult, maxRows, reservationType);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByTotalBill
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByTotalBill(java.math.BigDecimal totalBill) throws DataAccessException {

		return findGuestStayInfoByTotalBill(totalBill, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByTotalBill
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByTotalBill(java.math.BigDecimal totalBill, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByTotalBill", startResult, maxRows, totalBill);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByCardNumber
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCardNumber(String cardNumber) throws DataAccessException {

		return findGuestStayInfoByCardNumber(cardNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByCardNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCardNumber(String cardNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByCardNumber", startResult, maxRows, cardNumber);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByCardNumberContaining
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCardNumberContaining(String cardNumber) throws DataAccessException {

		return findGuestStayInfoByCardNumberContaining(cardNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByCardNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCardNumberContaining(String cardNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByCardNumberContaining", startResult, maxRows, cardNumber);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByRoomNumber
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRoomNumber(String roomNumber) throws DataAccessException {

		return findGuestStayInfoByRoomNumber(roomNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByRoomNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRoomNumber(String roomNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByRoomNumber", startResult, maxRows, roomNumber);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByCreditAmount
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCreditAmount(java.math.BigDecimal creditAmount) throws DataAccessException {

		return findGuestStayInfoByCreditAmount(creditAmount, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByCreditAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCreditAmount(java.math.BigDecimal creditAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByCreditAmount", startResult, maxRows, creditAmount);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByNumberOfAdult
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByNumberOfAdult(Integer numberOfAdult) throws DataAccessException {

		return findGuestStayInfoByNumberOfAdult(numberOfAdult, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByNumberOfAdult
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByNumberOfAdult(Integer numberOfAdult, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByNumberOfAdult", startResult, maxRows, numberOfAdult);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByCardType
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCardType(String cardType) throws DataAccessException {

		return findGuestStayInfoByCardType(cardType, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByCardType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCardType(String cardType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByCardType", startResult, maxRows, cardType);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByArrivalDate
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByArrivalDate(java.util.Calendar arrivalDate) throws DataAccessException {

		return findGuestStayInfoByArrivalDate(arrivalDate, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByArrivalDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByArrivalDate(java.util.Calendar arrivalDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByArrivalDate", startResult, maxRows, arrivalDate);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByPaymentType
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByPaymentType(String paymentType) throws DataAccessException {

		return findGuestStayInfoByPaymentType(paymentType, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByPaymentType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByPaymentType(String paymentType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByPaymentType", startResult, maxRows, paymentType);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByDepartureDate
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByDepartureDate(java.util.Calendar departureDate) throws DataAccessException {

		return findGuestStayInfoByDepartureDate(departureDate, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByDepartureDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByDepartureDate(java.util.Calendar departureDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByDepartureDate", startResult, maxRows, departureDate);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByRateCode
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRateCode(Integer rateCode) throws DataAccessException {

		return findGuestStayInfoByRateCode(rateCode, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByRateCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRateCode(Integer rateCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByRateCode", startResult, maxRows, rateCode);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByRoomTypeContaining
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRoomTypeContaining(String roomType) throws DataAccessException {

		return findGuestStayInfoByRoomTypeContaining(roomType, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByRoomTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRoomTypeContaining(String roomType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByRoomTypeContaining", startResult, maxRows, roomType);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByFolioNumberContaining
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByFolioNumberContaining(String folioNumber) throws DataAccessException {

		return findGuestStayInfoByFolioNumberContaining(folioNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByFolioNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByFolioNumberContaining(String folioNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByFolioNumberContaining", startResult, maxRows, folioNumber);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByPrimaryKey
	 *
	 */
	@Transactional
	public GuestStayInfo findGuestStayInfoByPrimaryKey(Integer id) throws DataAccessException {

		return findGuestStayInfoByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByPrimaryKey
	 *
	 */

	@Transactional
	public GuestStayInfo findGuestStayInfoByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGuestStayInfoByPrimaryKey", startResult, maxRows, id);
			return (ige.integration.domain.GuestStayInfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGuestStayInfoByPaymentTypeContaining
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByPaymentTypeContaining(String paymentType) throws DataAccessException {

		return findGuestStayInfoByPaymentTypeContaining(paymentType, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByPaymentTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByPaymentTypeContaining(String paymentType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByPaymentTypeContaining", startResult, maxRows, paymentType);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByFolioNumber
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByFolioNumber(String folioNumber) throws DataAccessException {

		return findGuestStayInfoByFolioNumber(folioNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByFolioNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByFolioNumber(String folioNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByFolioNumber", startResult, maxRows, folioNumber);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByCardTypeContaining
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCardTypeContaining(String cardType) throws DataAccessException {

		return findGuestStayInfoByCardTypeContaining(cardType, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByCardTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCardTypeContaining(String cardType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByCardTypeContaining", startResult, maxRows, cardType);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByFloorNumberContaining
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByFloorNumberContaining(String floorNumber) throws DataAccessException {

		return findGuestStayInfoByFloorNumberContaining(floorNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByFloorNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByFloorNumberContaining(String floorNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByFloorNumberContaining", startResult, maxRows, floorNumber);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByBalanceAmount
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByBalanceAmount(java.math.BigDecimal balanceAmount) throws DataAccessException {

		return findGuestStayInfoByBalanceAmount(balanceAmount, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByBalanceAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByBalanceAmount(java.math.BigDecimal balanceAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByBalanceAmount", startResult, maxRows, balanceAmount);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoById
	 *
	 */
	@Transactional
	public GuestStayInfo findGuestStayInfoById(Integer id) throws DataAccessException {

		return findGuestStayInfoById(id, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoById
	 *
	 */

	@Transactional
	public GuestStayInfo findGuestStayInfoById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGuestStayInfoById", startResult, maxRows, id);
			return (ige.integration.domain.GuestStayInfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGuestStayInfoByCreditcardExpirationDate
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCreditcardExpirationDate(java.util.Calendar creditcardExpirationDate) throws DataAccessException {

		return findGuestStayInfoByCreditcardExpirationDate(creditcardExpirationDate, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByCreditcardExpirationDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByCreditcardExpirationDate(java.util.Calendar creditcardExpirationDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByCreditcardExpirationDate", startResult, maxRows, creditcardExpirationDate);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByRoomRate
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRoomRate(java.math.BigDecimal roomRate) throws DataAccessException {

		return findGuestStayInfoByRoomRate(roomRate, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByRoomRate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRoomRate(java.math.BigDecimal roomRate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByRoomRate", startResult, maxRows, roomRate);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByNumberOfChildren
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByNumberOfChildren(Integer numberOfChildren) throws DataAccessException {

		return findGuestStayInfoByNumberOfChildren(numberOfChildren, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByNumberOfChildren
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByNumberOfChildren(Integer numberOfChildren, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByNumberOfChildren", startResult, maxRows, numberOfChildren);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllGuestStayInfos
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findAllGuestStayInfos() throws DataAccessException {

		return findAllGuestStayInfos(-1, -1);
	}

	/**
	 * JPQL Query - findAllGuestStayInfos
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findAllGuestStayInfos(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllGuestStayInfos", startResult, maxRows);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByFloorNumber
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByFloorNumber(String floorNumber) throws DataAccessException {

		return findGuestStayInfoByFloorNumber(floorNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByFloorNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByFloorNumber(String floorNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByFloorNumber", startResult, maxRows, floorNumber);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestStayInfoByRoomNumberContaining
	 *
	 */
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRoomNumberContaining(String roomNumber) throws DataAccessException {

		return findGuestStayInfoByRoomNumberContaining(roomNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestStayInfoByRoomNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestStayInfo> findGuestStayInfoByRoomNumberContaining(String roomNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestStayInfoByRoomNumberContaining", startResult, maxRows, roomNumber);
		return new LinkedHashSet<GuestStayInfo>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(GuestStayInfo entity) {
		return true;
	}
}

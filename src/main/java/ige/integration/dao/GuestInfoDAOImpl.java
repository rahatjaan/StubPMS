package ige.integration.dao;

import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;
import ige.integration.messages.Messages;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
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
 * DAO to manage GuestInfo entities.
 * 
 */
@Repository("GuestInfoDAO")
@Transactional
public class GuestInfoDAOImpl extends AbstractJpaDao<GuestInfo> implements
		GuestInfoDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { GuestInfo.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MySQL
	 *
	 */
	@PersistenceContext(unitName = "MySQL")
	private EntityManager entityManager;

	/**
	 * Instantiates a new GuestInfoDAOImpl
	 *
	 */
	public GuestInfoDAOImpl() {
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
	 * JPQL Query - findGuestInfoByFullAddressContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByFullAddressContaining(String fullAddress) throws DataAccessException {

		return findGuestInfoByFullAddressContaining(fullAddress, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByFullAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByFullAddressContaining(String fullAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByFullAddressContaining", startResult, maxRows, fullAddress);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByAlContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByAlContaining(String al) throws DataAccessException {

		return findGuestInfoByAlContaining(al, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByAlContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByAlContaining(String al, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByAlContaining", startResult, maxRows, al);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByFirstName
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByFirstName(String firstName) throws DataAccessException {

		return findGuestInfoByFirstName(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByFirstName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByFirstName(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByFirstName", startResult, maxRows, firstName);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByMobileNumberContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByMobileNumberContaining(String mobileNumber) throws DataAccessException {

		return findGuestInfoByMobileNumberContaining(mobileNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByMobileNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByMobileNumberContaining(String mobileNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByMobileNumberContaining", startResult, maxRows, mobileNumber);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByBonusCode
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByBonusCode(String bonusCode) throws DataAccessException {

		return findGuestInfoByBonusCode(bonusCode, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByBonusCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByBonusCode(String bonusCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByBonusCode", startResult, maxRows, bonusCode);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByGroupName
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByGroupName(String groupName) throws DataAccessException {

		return findGuestInfoByGroupName(groupName, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByGroupName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByGroupName(String groupName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByGroupName", startResult, maxRows, groupName);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByRatePlan
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByRatePlan(String ratePlan) throws DataAccessException {

		return findGuestInfoByRatePlan(ratePlan, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByRatePlan
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByRatePlan(String ratePlan, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByRatePlan", startResult, maxRows, ratePlan);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByLastNameContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByLastNameContaining(String lastName) throws DataAccessException {

		return findGuestInfoByLastNameContaining(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByLastNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByLastNameContaining", startResult, maxRows, lastName);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByHhNumberContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByHhNumberContaining(String hhNumber) throws DataAccessException {

		return findGuestInfoByHhNumberContaining(hhNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByHhNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByHhNumberContaining(String hhNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByHhNumberContaining", startResult, maxRows, hhNumber);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByMobileNumber
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByMobileNumber(String mobileNumber) throws DataAccessException {

		return findGuestInfoByMobileNumber(mobileNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByMobileNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByMobileNumber(String mobileNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByMobileNumber", startResult, maxRows, mobileNumber);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByHhNumber
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByHhNumber(String hhNumber) throws DataAccessException {

		return findGuestInfoByHhNumber(hhNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByHhNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByHhNumber(String hhNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByHhNumber", startResult, maxRows, hhNumber);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByBonusAl
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByBonusAl(String bonusAl) throws DataAccessException {

		return findGuestInfoByBonusAl(bonusAl, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByBonusAl
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByBonusAl(String bonusAl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByBonusAl", startResult, maxRows, bonusAl);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByAl
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByAl(String al) throws DataAccessException {

		return findGuestInfoByAl(al, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByAl
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByAl(String al, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByAl", startResult, maxRows, al);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoById
	 *
	 */
	@Transactional
	public GuestInfo findGuestInfoById(Integer id) throws DataAccessException {

		return findGuestInfoById(id, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoById
	 *
	 */

	@Transactional
	public GuestInfo findGuestInfoById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGuestInfoById", startResult, maxRows, id);
			return (ige.integration.domain.GuestInfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGuestInfoByRatePlanContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByRatePlanContaining(String ratePlan) throws DataAccessException {

		return findGuestInfoByRatePlanContaining(ratePlan, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByRatePlanContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByRatePlanContaining(String ratePlan, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByRatePlanContaining", startResult, maxRows, ratePlan);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByFullAddress
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByFullAddress(String fullAddress) throws DataAccessException {

		return findGuestInfoByFullAddress(fullAddress, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByFullAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByFullAddress(String fullAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByFullAddress", startResult, maxRows, fullAddress);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByMembershipNumberContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByMembershipNumberContaining(String membershipNumber) throws DataAccessException {

		return findGuestInfoByMembershipNumberContaining(membershipNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByMembershipNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByMembershipNumberContaining(String membershipNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByMembershipNumberContaining", startResult, maxRows, membershipNumber);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByFirstNameContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByFirstNameContaining(String firstName) throws DataAccessException {

		return findGuestInfoByFirstNameContaining(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByFirstNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByFirstNameContaining(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByFirstNameContaining", startResult, maxRows, firstName);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByGroupNameContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByGroupNameContaining(String groupName) throws DataAccessException {

		return findGuestInfoByGroupNameContaining(groupName, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByGroupNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByGroupNameContaining(String groupName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByGroupNameContaining", startResult, maxRows, groupName);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByPrimaryKey
	 *
	 */
	@Transactional
	public GuestInfo findGuestInfoByPrimaryKey(Integer id) throws DataAccessException {

		return findGuestInfoByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByPrimaryKey
	 *
	 */

	@Transactional
	public GuestInfo findGuestInfoByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGuestInfoByPrimaryKey", startResult, maxRows, id);
			return (ige.integration.domain.GuestInfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGuestInfoByConfirmationNumber
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByConfirmationNumber(String confirmationNumber) throws DataAccessException {

		return findGuestInfoByConfirmationNumber(confirmationNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByConfirmationNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByConfirmationNumber(String confirmationNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByConfirmationNumber", startResult, maxRows, confirmationNumber);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByBonusAlContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByBonusAlContaining(String bonusAl) throws DataAccessException {

		return findGuestInfoByBonusAlContaining(bonusAl, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByBonusAlContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByBonusAlContaining(String bonusAl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByBonusAlContaining", startResult, maxRows, bonusAl);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByConfirmationNumberContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByConfirmationNumberContaining(String confirmationNumber) throws DataAccessException {

		return findGuestInfoByConfirmationNumberContaining(confirmationNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByConfirmationNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByConfirmationNumberContaining(String confirmationNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByConfirmationNumberContaining", startResult, maxRows, confirmationNumber);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllGuestInfos
	 *
	 */
	@Transactional
	public Set<GuestInfo> findAllGuestInfos() throws DataAccessException {

		return findAllGuestInfos(-1, -1);
	}

	/**
	 * JPQL Query - findAllGuestInfos
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findAllGuestInfos(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllGuestInfos", startResult, maxRows);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByBonusCodeContaining
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByBonusCodeContaining(String bonusCode) throws DataAccessException {

		return findGuestInfoByBonusCodeContaining(bonusCode, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByBonusCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByBonusCodeContaining(String bonusCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByBonusCodeContaining", startResult, maxRows, bonusCode);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByMembershipNumber
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByMembershipNumber(String membershipNumber) throws DataAccessException {

		return findGuestInfoByMembershipNumber(membershipNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByMembershipNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByMembershipNumber(String membershipNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByMembershipNumber", startResult, maxRows, membershipNumber);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestInfoByLastName
	 *
	 */
	@Transactional
	public Set<GuestInfo> findGuestInfoByLastName(String lastName) throws DataAccessException {

		return findGuestInfoByLastName(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findGuestInfoByLastName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestInfo> findGuestInfoByLastName(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestInfoByLastName", startResult, maxRows, lastName);
		return new LinkedHashSet<GuestInfo>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(GuestInfo entity) {
		return true;
	}

	@Transactional
	public Object findGuestBillInfo(String emailAddress, String lastName, String roomNumber) {
		return findGuestBillInfo(emailAddress, lastName, roomNumber, -1, -1);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public Object findGuestBillInfo(String emailAddress, String lastName, String roomNumber, int startResult, int maxRows) {
		Query query = null;
		System.out.println("NAME: "+lastName+"ROOM: "+roomNumber+"EMAIL: "+emailAddress);
		try{
			query = createNamedQuery("findGuestBillInfo", startResult, maxRows, emailAddress, lastName, roomNumber);
			List<GuestInfo> ob = query.getResultList();
			int i = 0;
			System.out.println("LIST SIZE BILL INFO IS: "+ob.size());
			while(ob.size() > i){
				GuestInfo o = ob.get(i);
				Set<GuestStayInfo> se = o.getGuestStayInfos();
				System.out.println("GUEST INFO LIST SIZE BILL INFO IS: "+se.size());
				for (GuestStayInfo s : se) {
					System.out.println("Lastname: "+o.getLastName()+"   Email: "+o.getEmail()+"   Room: "+s.getRoomNumber());
					System.out.println("NAME: "+lastName+"ROOM: "+roomNumber+"EMAIL: "+emailAddress);
				    if(o.getLastName().equalsIgnoreCase(lastName) && o.getEmail().equalsIgnoreCase(emailAddress) && s.getRoomNumber().equalsIgnoreCase(roomNumber)){
				    	Set<GuestStayInfo> sss = new HashSet<GuestStayInfo>();
				    	sss.add(s);
				    	o.setGuestStayInfos(sss);
				    	return o;
				    }
				}		
				i++;
			}
			return Messages.CREDENTIALS_MESSAGE;
		}catch(Exception e){
			return Messages.CREDENTIALS_MESSAGE;
		}
	}

	@Transactional
	public GuestInfo findGuestByEmailLastNameRoom(String lastName,
			String email, String roomNumber) {
		return findGuestByEmailLastNameRoom(lastName, email, roomNumber, -1, -1);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public GuestInfo findGuestByEmailLastNameRoom(String lastName, String email, String roomNumber, int startResult, int maxRows) throws DataAccessException {
		try{
			System.out.println("NAME: "+lastName+"ROOM: "+roomNumber+"EMAIL: "+email);
			Query query = createNamedQuery("findGuestInfoByEmailLastNameRoom", startResult, maxRows, lastName, email, roomNumber);
			List<GuestInfo> ob = query.getResultList();
			System.out.println("SIZE IN OTHER: "+ob.size());
			int i = 0;
			while(ob.size() > i){
				GuestInfo o = ob.get(i);
				Set<GuestStayInfo> se = o.getGuestStayInfos();
				System.out.println("GUEST INFO SIZE IN OTHER: "+se.size());
				for (GuestStayInfo s : se) {
					System.out.println("Lastname: "+o.getLastName()+"   Email: "+o.getEmail()+"   Room: "+s.getRoomNumber());
				    if(o.getLastName().equalsIgnoreCase(lastName) && o.getEmail().equalsIgnoreCase(email) && s.getRoomNumber().equalsIgnoreCase(roomNumber)){
				    	Set<GuestStayInfo> sss = new HashSet<GuestStayInfo>();
				    	sss.add(s);
				    	o.setGuestStayInfos(sss);
				    	System.out.println("***********************************************************");
				    	System.out.println("Lastname: "+o.getLastName()+"   Email: "+o.getEmail()+"   Room: "+s.getRoomNumber());
				    	System.out.println("NAME: "+lastName+"ROOM: "+roomNumber+"EMAIL: "+email);
				    	System.out.println("***********************************************************");
				    	return o;
				    }
				}	
				i++;
			}
			return null;
		}catch(Exception e){
			return null;
		}
	}

	public GuestInfo findGuestInfoByEmail(String emailAddress) throws DataAccessException {
		try{
			Query query = createNamedQuery("findGuestInfoByEmail", -1, -1, emailAddress);
			return (GuestInfo) (query.getSingleResult());
		}catch(Exception e){
			return null;
		}
	}

	public GuestInfo findGuestInfoByConfirmationNumbers(
			String confirmationNumber) {
		try{
			Query query = createNamedQuery("findGuestInfoByConfirmationNumber", -1, -1, confirmationNumber);
			return (GuestInfo) (query.getSingleResult());
		}catch(Exception e){
			return null;
		}
	}

	public GuestStayInfo findGuestInfoByLastNameCreditCard(String lastName,
			String creditCard) {
		try{
			Query query = createNamedQuery("findGuestInfoByLastName", -1, -1, lastName);
			List<GuestInfo> li = query.getResultList();
			for(GuestInfo gi: li){
				Collection c = gi.getGuestStayInfos();
	    		Iterator iter = c.iterator();
	    		GuestStayInfo first = (GuestStayInfo) iter.next();
	    		int length = first.getCardNumber().length();
	    		System.out.println(first.getCardNumber().substring(length-4));
	    		if(5 < length){
					if(first.getCardNumber().substring(length-4).equalsIgnoreCase(creditCard)){
						return first;
					}
	    		}
			}
			return null;
		}catch(Exception e){
			return null;
		}
	}

	public GuestInfo findGuestInfoByLoyaltyNumber(String loyaltyNumber) {
		try{
			Query query = createNamedQuery("findGuestInfoByHhNumber", -1, -1, loyaltyNumber);
			return (GuestInfo) (query.getSingleResult());
		}catch(Exception e){
			return null;
		}
	}
}

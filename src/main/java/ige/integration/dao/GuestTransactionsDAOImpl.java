package ige.integration.dao;

import ige.integration.domain.GuestTransactions;

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
 * DAO to manage GuestTransactions entities.
 * 
 */
@Repository("GuestTransactionsDAO")
@Transactional
public class GuestTransactionsDAOImpl extends AbstractJpaDao<GuestTransactions>
		implements GuestTransactionsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { GuestTransactions.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MySQL
	 *
	 */
	@PersistenceContext(unitName = "MySQL")
	private EntityManager entityManager;

	/**
	 * Instantiates a new GuestTransactionsDAOImpl
	 *
	 */
	public GuestTransactionsDAOImpl() {
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
	 * JPQL Query - findGuestTransactionsByReferenceNumberContaining
	 *
	 */
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByReferenceNumberContaining(String referenceNumber) throws DataAccessException {

		return findGuestTransactionsByReferenceNumberContaining(referenceNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestTransactionsByReferenceNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByReferenceNumberContaining(String referenceNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestTransactionsByReferenceNumberContaining", startResult, maxRows, referenceNumber);
		return new LinkedHashSet<GuestTransactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestTransactionsByTransactionDate
	 *
	 */
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByTransactionDate(java.util.Calendar transactionDate) throws DataAccessException {

		return findGuestTransactionsByTransactionDate(transactionDate, -1, -1);
	}

	/**
	 * JPQL Query - findGuestTransactionsByTransactionDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByTransactionDate(java.util.Calendar transactionDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestTransactionsByTransactionDate", startResult, maxRows, transactionDate);
		return new LinkedHashSet<GuestTransactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestTransactionsByCharges
	 *
	 */
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByCharges(java.math.BigDecimal charges) throws DataAccessException {

		return findGuestTransactionsByCharges(charges, -1, -1);
	}

	/**
	 * JPQL Query - findGuestTransactionsByCharges
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByCharges(java.math.BigDecimal charges, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestTransactionsByCharges", startResult, maxRows, charges);
		return new LinkedHashSet<GuestTransactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllGuestTransactionss
	 *
	 */
	@Transactional
	public Set<GuestTransactions> findAllGuestTransactionss() throws DataAccessException {

		return findAllGuestTransactionss(-1, -1);
	}

	/**
	 * JPQL Query - findAllGuestTransactionss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestTransactions> findAllGuestTransactionss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllGuestTransactionss", startResult, maxRows);
		return new LinkedHashSet<GuestTransactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestTransactionsByReferenceNumber
	 *
	 */
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByReferenceNumber(String referenceNumber) throws DataAccessException {

		return findGuestTransactionsByReferenceNumber(referenceNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestTransactionsByReferenceNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByReferenceNumber(String referenceNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestTransactionsByReferenceNumber", startResult, maxRows, referenceNumber);
		return new LinkedHashSet<GuestTransactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestTransactionsByDescription
	 *
	 */
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByDescription(String description) throws DataAccessException {

		return findGuestTransactionsByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findGuestTransactionsByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestTransactionsByDescription", startResult, maxRows, description);
		return new LinkedHashSet<GuestTransactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestTransactionsByTransactionIdContaining
	 *
	 */
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByTransactionIdContaining(String transactionId) throws DataAccessException {

		return findGuestTransactionsByTransactionIdContaining(transactionId, -1, -1);
	}

	/**
	 * JPQL Query - findGuestTransactionsByTransactionIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByTransactionIdContaining(String transactionId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestTransactionsByTransactionIdContaining", startResult, maxRows, transactionId);
		return new LinkedHashSet<GuestTransactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestTransactionsByPrimaryKey
	 *
	 */
	@Transactional
	public GuestTransactions findGuestTransactionsByPrimaryKey(Integer id) throws DataAccessException {

		return findGuestTransactionsByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findGuestTransactionsByPrimaryKey
	 *
	 */

	@Transactional
	public GuestTransactions findGuestTransactionsByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGuestTransactionsByPrimaryKey", startResult, maxRows, id);
			return (ige.integration.domain.GuestTransactions) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGuestTransactionsById
	 *
	 */
	@Transactional
	public GuestTransactions findGuestTransactionsById(Integer id) throws DataAccessException {

		return findGuestTransactionsById(id, -1, -1);
	}

	/**
	 * JPQL Query - findGuestTransactionsById
	 *
	 */

	@Transactional
	public GuestTransactions findGuestTransactionsById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGuestTransactionsById", startResult, maxRows, id);
			return (ige.integration.domain.GuestTransactions) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGuestTransactionsByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByDescriptionContaining(String description) throws DataAccessException {

		return findGuestTransactionsByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findGuestTransactionsByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestTransactionsByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<GuestTransactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestTransactionsByTransactionId
	 *
	 */
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByTransactionId(String transactionId) throws DataAccessException {

		return findGuestTransactionsByTransactionId(transactionId, -1, -1);
	}

	/**
	 * JPQL Query - findGuestTransactionsByTransactionId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<GuestTransactions> findGuestTransactionsByTransactionId(String transactionId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestTransactionsByTransactionId", startResult, maxRows, transactionId);
		return new LinkedHashSet<GuestTransactions>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(GuestTransactions entity) {
		return true;
	}
}

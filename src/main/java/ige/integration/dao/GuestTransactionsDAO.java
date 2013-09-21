package ige.integration.dao;

import ige.integration.domain.GuestTransactions;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;
import org.springframework.dao.DataAccessException;

/**
 * DAO to manage GuestTransactions entities.
 * 
 */
public interface GuestTransactionsDAO extends JpaDao<GuestTransactions> {

	/**
	 * JPQL Query - findGuestTransactionsByReferenceNumberContaining
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByReferenceNumberContaining(String referenceNumber) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByReferenceNumberContaining
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByReferenceNumberContaining(String referenceNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByTransactionDate
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByTransactionDate(java.util.Calendar transactionDate) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByTransactionDate
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByTransactionDate(Calendar transactionDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByCharges
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByCharges(java.math.BigDecimal charges) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByCharges
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByCharges(BigDecimal charges, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllGuestTransactionss
	 *
	 */
	public Set<GuestTransactions> findAllGuestTransactionss() throws DataAccessException;

	/**
	 * JPQL Query - findAllGuestTransactionss
	 *
	 */
	public Set<GuestTransactions> findAllGuestTransactionss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByReferenceNumber
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByReferenceNumber(String referenceNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByReferenceNumber
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByReferenceNumber(String referenceNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByDescription
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByDescription
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByTransactionIdContaining
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByTransactionIdContaining(String transactionId) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByTransactionIdContaining
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByTransactionIdContaining(String transactionId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByPrimaryKey
	 *
	 */
	public GuestTransactions findGuestTransactionsByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByPrimaryKey
	 *
	 */
	public GuestTransactions findGuestTransactionsByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsById
	 *
	 */
	public GuestTransactions findGuestTransactionsById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsById
	 *
	 */
	public GuestTransactions findGuestTransactionsById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByDescriptionContaining
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByDescriptionContaining
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByTransactionId
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByTransactionId(String transactionId_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestTransactionsByTransactionId
	 *
	 */
	public Set<GuestTransactions> findGuestTransactionsByTransactionId(String transactionId_1, int startResult, int maxRows) throws DataAccessException;

}
package ige.integration.service;

import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/StubPMS-security-context.xml",
		"file:./src/main/resources/StubPMS-service-context.xml",
		"file:./src/main/resources/StubPMS-dao-context.xml",
		"file:./src/main/resources/StubPMS-web-context.xml" })
@Transactional
public class GuestTransactionsServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected GuestTransactionsService service;

	/**
	 * Instantiates a new GuestTransactionsServiceTest.
	 *
	 */
	public GuestTransactionsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	@Test
	public void saveGuestTransactionsGuestStayInfo() {
		// TODO: JUnit - Populate test inputs for operation: saveGuestTransactionsGuestStayInfo 
		Integer id = 0;
		GuestStayInfo related_gueststayinfo = new ige.integration.domain.GuestStayInfo();
		GuestTransactions response = null;
		response = service.saveGuestTransactionsGuestStayInfo(id, related_gueststayinfo);
		// TODO: JUnit - Add assertions to test outputs of operation: saveGuestTransactionsGuestStayInfo
	}

	/**
	 * Operation Unit Test
	 * Return a count of all GuestTransactions entity
	 * 
	 */
	@Test
	public void countGuestTransactionss() {
		Integer response = null;
		response = service.countGuestTransactionss();
		// TODO: JUnit - Add assertions to test outputs of operation: countGuestTransactionss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	@Test
	public void deleteGuestTransactionsGuestStayInfo() {
		// TODO: JUnit - Populate test inputs for operation: deleteGuestTransactionsGuestStayInfo 
		Integer guesttransactions_id = 0;
		Integer related_gueststayinfo_id = 0;
		GuestTransactions response = null;
		response = service.deleteGuestTransactionsGuestStayInfo(guesttransactions_id, related_gueststayinfo_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteGuestTransactionsGuestStayInfo
	}

	/**
	 * Operation Unit Test
	 * Load an existing GuestTransactions entity
	 * 
	 */
	@Test
	public void loadGuestTransactionss() {
		Set<GuestTransactions> response = null;
		response = service.loadGuestTransactionss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadGuestTransactionss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing GuestTransactions entity
	 * 
	 */
	@Test
	public void deleteGuestTransactions() {
		// TODO: JUnit - Populate test inputs for operation: deleteGuestTransactions 
		GuestTransactions guesttransactions = new ige.integration.domain.GuestTransactions();
		service.deleteGuestTransactions(guesttransactions);
	}

	/**
	 * Operation Unit Test
	 * Save an existing GuestTransactions entity
	 * 
	 */
	@Test
	public void saveGuestTransactions() {
		// TODO: JUnit - Populate test inputs for operation: saveGuestTransactions 
		GuestTransactions guesttransactions_1 = new ige.integration.domain.GuestTransactions();
		service.saveGuestTransactions(guesttransactions_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findGuestTransactionsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findGuestTransactionsByPrimaryKey 
		Integer id_1 = 0;
		GuestTransactions response = null;
		response = service.findGuestTransactionsByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findGuestTransactionsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all GuestTransactions entity
	 * 
	 */
	@Test
	public void findAllGuestTransactionss() {
		// TODO: JUnit - Populate test inputs for operation: findAllGuestTransactionss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<GuestTransactions> response = null;
		response = service.findAllGuestTransactionss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllGuestTransactionss
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}

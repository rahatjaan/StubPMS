package ige.integration.service;

import ige.integration.domain.GuestInfo;
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
public class GuestStayInfoServiceTest {

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
	protected GuestStayInfoService service;

	/**
	 * Instantiates a new GuestStayInfoServiceTest.
	 *
	 */
	public GuestStayInfoServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing GuestInfo entity
	 * 
	 */
	@Test
	public void deleteGuestStayInfoGuestInfo() {
		// TODO: JUnit - Populate test inputs for operation: deleteGuestStayInfoGuestInfo 
		Integer gueststayinfo_id = 0;
		Integer related_guestinfo_id = 0;
		GuestStayInfo response = null;
		response = service.deleteGuestStayInfoGuestInfo(gueststayinfo_id, related_guestinfo_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteGuestStayInfoGuestInfo
	}

	/**
	 * Operation Unit Test
	 * Return a count of all GuestStayInfo entity
	 * 
	 */
	@Test
	public void countGuestStayInfos() {
		Integer response = null;
		response = service.countGuestStayInfos();
		// TODO: JUnit - Add assertions to test outputs of operation: countGuestStayInfos
	}

	/**
	 * Operation Unit Test
	 * Save an existing GuestTransactions entity
	 * 
	 */
	@Test
	public void saveGuestStayInfoGuestTransactionses() {
		// TODO: JUnit - Populate test inputs for operation: saveGuestStayInfoGuestTransactionses 
		Integer id = 0;
		GuestTransactions related_guesttransactionses = new ige.integration.domain.GuestTransactions();
		GuestStayInfo response = null;
		response = service.saveGuestStayInfoGuestTransactionses(id, related_guesttransactionses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveGuestStayInfoGuestTransactionses
	}

	/**
	 * Operation Unit Test
	 * Save an existing GuestInfo entity
	 * 
	 */
	@Test
	public void saveGuestStayInfoGuestInfo() {
		// TODO: JUnit - Populate test inputs for operation: saveGuestStayInfoGuestInfo 
		Integer id_1 = 0;
		GuestInfo related_guestinfo = new ige.integration.domain.GuestInfo();
		GuestStayInfo response = null;
		response = service.saveGuestStayInfoGuestInfo(id_1, related_guestinfo);
		// TODO: JUnit - Add assertions to test outputs of operation: saveGuestStayInfoGuestInfo
	}

	/**
	 * Operation Unit Test
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	@Test
	public void deleteGuestStayInfo() {
		// TODO: JUnit - Populate test inputs for operation: deleteGuestStayInfo 
		GuestStayInfo gueststayinfo = new ige.integration.domain.GuestStayInfo();
		service.deleteGuestStayInfo(gueststayinfo);
	}

	/**
	 * Operation Unit Test
	 * Return all GuestStayInfo entity
	 * 
	 */
	@Test
	public void findAllGuestStayInfos() {
		// TODO: JUnit - Populate test inputs for operation: findAllGuestStayInfos 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<GuestStayInfo> response = null;
		response = service.findAllGuestStayInfos(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllGuestStayInfos
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findGuestStayInfoByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findGuestStayInfoByPrimaryKey 
		Integer id_2 = 0;
		GuestStayInfo response = null;
		response = service.findGuestStayInfoByPrimaryKey(id_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findGuestStayInfoByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing GuestTransactions entity
	 * 
	 */
	@Test
	public void deleteGuestStayInfoGuestTransactionses() {
		// TODO: JUnit - Populate test inputs for operation: deleteGuestStayInfoGuestTransactionses 
		Integer gueststayinfo_id_1 = 0;
		Integer related_guesttransactionses_id = 0;
		GuestStayInfo response = null;
		response = service.deleteGuestStayInfoGuestTransactionses(gueststayinfo_id_1, related_guesttransactionses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteGuestStayInfoGuestTransactionses
	}

	/**
	 * Operation Unit Test
	 * Load an existing GuestStayInfo entity
	 * 
	 */
	@Test
	public void loadGuestStayInfos() {
		Set<GuestStayInfo> response = null;
		response = service.loadGuestStayInfos();
		// TODO: JUnit - Add assertions to test outputs of operation: loadGuestStayInfos
	}

	/**
	 * Operation Unit Test
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	@Test
	public void saveGuestStayInfo() {
		// TODO: JUnit - Populate test inputs for operation: saveGuestStayInfo 
		GuestStayInfo gueststayinfo_1 = new ige.integration.domain.GuestStayInfo();
		service.saveGuestStayInfo(gueststayinfo_1);
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

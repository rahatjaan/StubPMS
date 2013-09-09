package ige.integration.service;

import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;

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
public class GuestInfoServiceTest {

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
	protected GuestInfoService service;

	/**
	 * Instantiates a new GuestInfoServiceTest.
	 *
	 */
	public GuestInfoServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing GuestInfo entity
	 * 
	 */
	@Test
	public void deleteGuestInfo() {
		// TODO: JUnit - Populate test inputs for operation: deleteGuestInfo 
		GuestInfo guestinfo = new ige.integration.domain.GuestInfo();
		service.deleteGuestInfo(guestinfo);
	}

	/**
	 * Operation Unit Test
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	@Test
	public void saveGuestInfoGuestStayInfos() {
		// TODO: JUnit - Populate test inputs for operation: saveGuestInfoGuestStayInfos 
		Integer id = 0;
		GuestStayInfo related_gueststayinfos = new ige.integration.domain.GuestStayInfo();
		GuestInfo response = null;
		response = service.saveGuestInfoGuestStayInfos(id, related_gueststayinfos);
		// TODO: JUnit - Add assertions to test outputs of operation: saveGuestInfoGuestStayInfos
	}

	/**
	 * Operation Unit Test
	 * Return all GuestInfo entity
	 * 
	 */
	@Test
	public void findAllGuestInfos() {
		// TODO: JUnit - Populate test inputs for operation: findAllGuestInfos 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<GuestInfo> response = null;
		response = service.findAllGuestInfos(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllGuestInfos
	}

	/**
	 * Operation Unit Test
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	@Test
	public void deleteGuestInfoGuestStayInfos() {
		// TODO: JUnit - Populate test inputs for operation: deleteGuestInfoGuestStayInfos 
		Integer guestinfo_id = 0;
		Integer related_gueststayinfos_id = 0;
		GuestInfo response = null;
		response = service.deleteGuestInfoGuestStayInfos(guestinfo_id, related_gueststayinfos_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteGuestInfoGuestStayInfos
	}

	/**
	 * Operation Unit Test
	 * Load an existing GuestInfo entity
	 * 
	 */
	@Test
	public void loadGuestInfos() {
		Set<GuestInfo> response = null;
		response = service.loadGuestInfos();
		// TODO: JUnit - Add assertions to test outputs of operation: loadGuestInfos
	}

	/**
	 * Operation Unit Test
	 * Return a count of all GuestInfo entity
	 * 
	 */
	@Test
	public void countGuestInfos() {
		Integer response = null;
		response = service.countGuestInfos();
		// TODO: JUnit - Add assertions to test outputs of operation: countGuestInfos
	}

	/**
	 * Operation Unit Test
	 * Save an existing GuestInfo entity
	 * 
	 */
	@Test
	public void saveGuestInfo() {
		// TODO: JUnit - Populate test inputs for operation: saveGuestInfo 
		GuestInfo guestinfo_1 = new ige.integration.domain.GuestInfo();
		service.saveGuestInfo(guestinfo_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findGuestInfoByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findGuestInfoByPrimaryKey 
		Integer id_1 = 0;
		GuestInfo response = null;
		response = service.findGuestInfoByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findGuestInfoByPrimaryKey
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

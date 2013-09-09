package ige.integration.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>GuestTransactionsController</code> controller.
 *
 * @see ige.integration.web.GuestTransactionsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/StubPMS-security-context.xml",
		"file:./src/main/resources/StubPMS-service-context.xml",
		"file:./src/main/resources/StubPMS-dao-context.xml",
		"file:./src/main/resources/StubPMS-web-context.xml" })
public class GuestTransactionsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editGuestTransactionsGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGuestTransactionsGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGuestTransactionsGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGuestTransactionsGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGuestTransactionsGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGuestTransactionsGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGuestTransactionsGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGuestTransactionsGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGuestTransactionsGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGuestTransactionsGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGuestTransactionsGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGuestTransactionsGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGuestTransactionsGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGuestTransactionsGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGuestTransactionsGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGuestTransactionsGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGuestTransactionsGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGuestTransactionsGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listGuestTransactionsGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistGuestTransactionsGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listGuestTransactionsGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexGuestTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexGuestTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexGuestTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGuestTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGuestTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGuestTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editGuestTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGuestTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGuestTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGuestTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGuestTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGuestTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGuestTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGuestTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGuestTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGuestTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGuestTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGuestTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGuestTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGuestTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGuestTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>guesttransactionsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetguesttransactionsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/guesttransactionsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestTransactionsController controller = (GuestTransactionsController) context.getBean("GuestTransactionsController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}
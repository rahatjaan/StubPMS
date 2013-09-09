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
 * Unit test for the <code>GuestStayInfoController</code> controller.
 *
 * @see ige.integration.web.GuestStayInfoController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/StubPMS-security-context.xml",
		"file:./src/main/resources/StubPMS-service-context.xml",
		"file:./src/main/resources/StubPMS-dao-context.xml",
		"file:./src/main/resources/StubPMS-web-context.xml" })
public class GuestStayInfoControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editGuestStayInfoGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGuestStayInfoGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGuestStayInfoGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGuestStayInfoGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGuestStayInfoGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGuestStayInfoGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGuestStayInfoGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGuestStayInfoGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGuestStayInfoGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGuestStayInfoGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGuestStayInfoGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGuestStayInfoGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGuestStayInfoGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGuestStayInfoGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGuestStayInfoGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGuestStayInfoGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGuestStayInfoGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGuestStayInfoGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listGuestStayInfoGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistGuestStayInfoGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listGuestStayInfoGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editGuestStayInfoGuestTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGuestStayInfoGuestTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGuestStayInfoGuestTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGuestStayInfoGuestTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGuestStayInfoGuestTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGuestStayInfoGuestTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGuestStayInfoGuestTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGuestStayInfoGuestTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGuestStayInfoGuestTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGuestStayInfoGuestTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGuestStayInfoGuestTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGuestStayInfoGuestTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGuestStayInfoGuestTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGuestStayInfoGuestTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGuestStayInfoGuestTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGuestStayInfoGuestTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGuestStayInfoGuestTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGuestStayInfoGuestTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listGuestStayInfoGuestTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistGuestStayInfoGuestTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listGuestStayInfoGuestTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGuestStayInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGuestStayInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGuestStayInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>gueststayinfoControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetgueststayinfoControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/gueststayinfoController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestStayInfoController controller = (GuestStayInfoController) context.getBean("GuestStayInfoController");

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
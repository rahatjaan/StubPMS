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
 * Unit test for the <code>GuestInfoController</code> controller.
 *
 * @see ige.integration.web.GuestInfoController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/StubPMS-security-context.xml",
		"file:./src/main/resources/StubPMS-service-context.xml",
		"file:./src/main/resources/StubPMS-dao-context.xml",
		"file:./src/main/resources/StubPMS-web-context.xml" })
public class GuestInfoControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editGuestInfoGuestStayInfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGuestInfoGuestStayInfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGuestInfoGuestStayInfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGuestInfoGuestStayInfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGuestInfoGuestStayInfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGuestInfoGuestStayInfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGuestInfoGuestStayInfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGuestInfoGuestStayInfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGuestInfoGuestStayInfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGuestInfoGuestStayInfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGuestInfoGuestStayInfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGuestInfoGuestStayInfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGuestInfoGuestStayInfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGuestInfoGuestStayInfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGuestInfoGuestStayInfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGuestInfoGuestStayInfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGuestInfoGuestStayInfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGuestInfoGuestStayInfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listGuestInfoGuestStayInfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistGuestInfoGuestStayInfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listGuestInfoGuestStayInfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGuestInfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGuestInfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGuestInfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>guestinfoControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetguestinfoControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/guestinfoController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestInfoController controller = (GuestInfoController) context.getBean("GuestInfoController");

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
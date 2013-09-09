package ige.integration.web;

import ige.integration.dao.GuestInfoDAO;
import ige.integration.dao.GuestStayInfoDAO;
import ige.integration.dao.GuestTransactionsDAO;
import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;
import ige.integration.service.GuestInfoService;
import ige.integration.service.GuestStayInfoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for GuestStayInfo entities
 * 
 */

@Controller("GuestStayInfoController")
public class GuestStayInfoController {

	/**
	 * DAO injected by Spring that manages GuestInfo entities
	 * 
	 */
	@Autowired
	private GuestInfoDAO guestInfoDAO;

	/**
	 * DAO injected by Spring that manages GuestStayInfo entities
	 * 
	 */
	@Autowired
	private GuestStayInfoDAO guestStayInfoDAO;

	/**
	 * DAO injected by Spring that manages GuestTransactions entities
	 * 
	 */
	@Autowired
	private GuestTransactionsDAO guestTransactionsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for GuestStayInfo entities
	 * 
	 */
	@Autowired
	private GuestStayInfoService guestStayInfoService;
	
	@Autowired
	private GuestInfoService guestInfoService;

	/**
	 * Show all GuestInfo entities by GuestStayInfo
	 * 
	 */
	@RequestMapping("/listGuestStayInfoGuestInfo")
	public ModelAndView listGuestStayInfoGuestInfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("gueststayinfo", guestStayInfoDAO.findGuestStayInfoByPrimaryKey(idKey));
		mav.setViewName("gueststayinfo/guestinfo/listGuestInfo.jsp");

		return mav;
	}

	/**
	 * Show all GuestTransactions entities by GuestStayInfo
	 * 
	 */
	@RequestMapping("/listGuestStayInfoGuestTransactionses")
	public ModelAndView listGuestStayInfoGuestTransactionses(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("gueststayinfo", guestStayInfoDAO.findGuestStayInfoByPrimaryKey(idKey));
		mav.setViewName("gueststayinfo/guesttransactionses/listGuestTransactionses.jsp");

		return mav;
	}

	/**
	 * Delete an existing GuestTransactions entity
	 * 
	 */
	@RequestMapping("/deleteGuestStayInfoGuestTransactionses")
	public ModelAndView deleteGuestStayInfoGuestTransactionses(@RequestParam Integer gueststayinfo_id, @RequestParam Integer related_guesttransactionses_id) {
		ModelAndView mav = new ModelAndView();

		GuestStayInfo gueststayinfo = guestStayInfoService.deleteGuestStayInfoGuestTransactionses(gueststayinfo_id, related_guesttransactionses_id);

		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.addObject("gueststayinfo", gueststayinfo);
		mav.setViewName("gueststayinfo/viewGuestStayInfo.jsp");

		return mav;
	}

	/**
	 * Edit an existing GuestInfo entity
	 * 
	 */
	@RequestMapping("/editGuestStayInfoGuestInfo")
	public ModelAndView editGuestStayInfoGuestInfo(@RequestParam Integer gueststayinfo_id, @RequestParam Integer guestinfo_id) {
		GuestInfo guestinfo = guestInfoDAO.findGuestInfoByPrimaryKey(guestinfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.addObject("guestinfo", guestinfo);
		mav.setViewName("gueststayinfo/guestinfo/editGuestInfo.jsp");

		return mav;
	}

	/**
	 * Entry point to show all GuestStayInfo entities
	 * 
	 */
	public String indexGuestStayInfo() {
		return "redirect:/indexGuestStayInfo";
	}

	/**
	 * Select an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/selectGuestStayInfo")
	public ModelAndView selectGuestStayInfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("gueststayinfo", guestStayInfoDAO.findGuestStayInfoByPrimaryKey(idKey));
		mav.setViewName("gueststayinfo/viewGuestStayInfo.jsp");

		return mav;
	}

	/**
	 * Select the child GuestInfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGuestStayInfoGuestInfo")
	public ModelAndView confirmDeleteGuestStayInfoGuestInfo(@RequestParam Integer gueststayinfo_id, @RequestParam Integer related_guestinfo_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guestinfo", guestInfoDAO.findGuestInfoByPrimaryKey(related_guestinfo_id));
		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.setViewName("gueststayinfo/guestinfo/deleteGuestInfo.jsp");

		return mav;
	}

	/**
	 * Create a new GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/newGuestStayInfo")
	public ModelAndView newGuestStayInfo() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("gueststayinfo", new GuestStayInfo());
		mav.addObject("newFlag", true);
		mav.setViewName("gueststayinfo/editGuestStayInfo.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/gueststayinfoController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/deleteGuestStayInfo")
	public String deleteGuestStayInfo(@RequestParam Integer idKey) {
		GuestStayInfo gueststayinfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(idKey);
		guestStayInfoService.deleteGuestStayInfo(gueststayinfo);
		return "forward:/indexGuestStayInfo";
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Edit an existing GuestTransactions entity
	 * 
	 */
	@RequestMapping("/editGuestStayInfoGuestTransactionses")
	public ModelAndView editGuestStayInfoGuestTransactionses(@RequestParam Integer gueststayinfo_id, @RequestParam Integer guesttransactionses_id) {
		GuestTransactions guesttransactions = guestTransactionsDAO.findGuestTransactionsByPrimaryKey(guesttransactionses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.addObject("guesttransactions", guesttransactions);
		mav.setViewName("gueststayinfo/guesttransactionses/editGuestTransactionses.jsp");

		return mav;
	}

	/**
	 * Edit an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/editGuestStayInfo")
	public ModelAndView editGuestStayInfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("gueststayinfo", guestStayInfoDAO.findGuestStayInfoByPrimaryKey(idKey));
		mav.setViewName("gueststayinfo/editGuestStayInfo.jsp");

		return mav;
	}

	/**
	 * Create a new GuestTransactions entity
	 * 
	 */
	@RequestMapping("/newGuestStayInfoGuestTransactionses")
	public ModelAndView newGuestStayInfoGuestTransactionses(@RequestParam Integer gueststayinfo_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.addObject("guesttransactions", new GuestTransactions());
		mav.addObject("newFlag", true);
		mav.setViewName("gueststayinfo/guesttransactionses/editGuestTransactionses.jsp");

		return mav;
	}

	/**
	 * Create a new GuestInfo entity
	 * 
	 */
	@RequestMapping("/newGuestStayInfoGuestInfo")
	public ModelAndView newGuestStayInfoGuestInfo(@RequestParam Integer gueststayinfo_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.addObject("guestinfo", new GuestInfo());
		mav.addObject("newFlag", true);
		mav.setViewName("gueststayinfo/guestinfo/editGuestInfo.jsp");

		return mav;
	}

	/**
	 * View an existing GuestTransactions entity
	 * 
	 */
	@RequestMapping("/selectGuestStayInfoGuestTransactionses")
	public ModelAndView selectGuestStayInfoGuestTransactionses(@RequestParam Integer gueststayinfo_id, @RequestParam Integer guesttransactionses_id) {
		GuestTransactions guesttransactions = guestTransactionsDAO.findGuestTransactionsByPrimaryKey(guesttransactionses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.addObject("guesttransactions", guesttransactions);
		mav.setViewName("gueststayinfo/guesttransactionses/viewGuestTransactionses.jsp");

		return mav;
	}

	/**
	 * Delete an existing GuestInfo entity
	 * 
	 */
	@RequestMapping("/deleteGuestStayInfoGuestInfo")
	public ModelAndView deleteGuestStayInfoGuestInfo(@RequestParam Integer gueststayinfo_id, @RequestParam Integer related_guestinfo_id) {
		ModelAndView mav = new ModelAndView();

		GuestStayInfo gueststayinfo = guestStayInfoService.deleteGuestStayInfoGuestInfo(gueststayinfo_id, related_guestinfo_id);

		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.addObject("gueststayinfo", gueststayinfo);
		mav.setViewName("gueststayinfo/viewGuestStayInfo.jsp");

		return mav;
	}

	/**
	 * Select the GuestStayInfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGuestStayInfo")
	public ModelAndView confirmDeleteGuestStayInfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("gueststayinfo", guestStayInfoDAO.findGuestStayInfoByPrimaryKey(idKey));
		mav.setViewName("gueststayinfo/deleteGuestStayInfo.jsp");

		return mav;
	}

	/**
	 * Show all GuestStayInfo entities
	 * 
	 */
	@RequestMapping("/indexGuestStayInfo")
	public ModelAndView listGuestStayInfos() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("gueststayinfos", guestStayInfoService.loadGuestStayInfos());

		mav.setViewName("gueststayinfo/listGuestStayInfos.jsp");

		return mav;
	}

	/**
	 * Select the child GuestTransactions entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGuestStayInfoGuestTransactionses")
	public ModelAndView confirmDeleteGuestStayInfoGuestTransactionses(@RequestParam Integer gueststayinfo_id, @RequestParam Integer related_guesttransactionses_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guesttransactions", guestTransactionsDAO.findGuestTransactionsByPrimaryKey(related_guesttransactionses_id));
		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.setViewName("gueststayinfo/guesttransactionses/deleteGuestTransactionses.jsp");

		return mav;
	}

	/**
	 * Save an existing GuestInfo entity
	 * 
	 */
	@RequestMapping("/saveGuestStayInfoGuestInfo")
	public ModelAndView saveGuestStayInfoGuestInfo(@RequestParam Integer gueststayinfo_id, @ModelAttribute GuestInfo guestinfo) {
		GuestStayInfo parent_gueststayinfo = guestStayInfoService.saveGuestStayInfoGuestInfo(gueststayinfo_id, guestinfo);

		ModelAndView mav = new ModelAndView();
		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.addObject("gueststayinfo", parent_gueststayinfo);
		mav.setViewName("gueststayinfo/viewGuestStayInfo.jsp");

		return mav;
	}

	/**
	 * Save an existing GuestTransactions entity
	 * 
	 */
	@RequestMapping("/saveGuestStayInfoGuestTransactionses")
	public ModelAndView saveGuestStayInfoGuestTransactionses(@RequestParam Integer gueststayinfo_id, @ModelAttribute GuestTransactions guesttransactionses) {
		GuestStayInfo parent_gueststayinfo = guestStayInfoService.saveGuestStayInfoGuestTransactionses(gueststayinfo_id, guesttransactionses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.addObject("gueststayinfo", parent_gueststayinfo);
		mav.setViewName("gueststayinfo/viewGuestStayInfo.jsp");

		return mav;
	}

	/**
	 * View an existing GuestInfo entity
	 * 
	 */
	@RequestMapping("/selectGuestStayInfoGuestInfo")
	public ModelAndView selectGuestStayInfoGuestInfo(@RequestParam Integer gueststayinfo_id, @RequestParam Integer guestinfo_id) {
		GuestInfo guestinfo = guestInfoDAO.findGuestInfoByPrimaryKey(guestinfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("gueststayinfo_id", gueststayinfo_id);
		mav.addObject("guestinfo", guestinfo);
		mav.setViewName("gueststayinfo/guestinfo/viewGuestInfo.jsp");

		return mav;
	}

	/**
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/saveGuestStayInfo")
	public String saveGuestStayInfo(@ModelAttribute GuestStayInfo gueststayinfo) {
		GuestInfo guestInfo = guestInfoService.findGuestInfoByPrimaryKey(gueststayinfo.getGuestInfo().getId());
		gueststayinfo.setGuestInfo(guestInfo);
		guestStayInfoService.saveGuestStayInfo(gueststayinfo);
		return "forward:/indexGuestStayInfo";
	}
}
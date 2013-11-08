package ige.integration.web;

import ige.integration.dao.GuestStayInfoDAO;
import ige.integration.dao.GuestTransactionsDAO;
import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;
import ige.integration.service.GuestTransactionsService;

import java.util.Calendar;

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
 * Spring MVC controller that handles CRUD requests for GuestTransactions entities
 * 
 */

@Controller("GuestTransactionsController")
public class GuestTransactionsController {

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
	 * Service injected by Spring that provides CRUD operations for GuestTransactions entities
	 * 
	 */
	@Autowired
	private GuestTransactionsService guestTransactionsService;

	/**
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/saveGuestTransactionsGuestStayInfo")
	public ModelAndView saveGuestTransactionsGuestStayInfo(@RequestParam Integer guesttransactions_id, @ModelAttribute GuestStayInfo gueststayinfo) {
		GuestTransactions parent_guesttransactions = guestTransactionsService.saveGuestTransactionsGuestStayInfo(guesttransactions_id, gueststayinfo);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guesttransactions_id", guesttransactions_id);
		mav.addObject("guesttransactions", parent_guesttransactions);
		mav.setViewName("guesttransactions/viewGuestTransactions.jsp");

		return mav;
	}

	/**
	 * Show all GuestTransactions entities
	 * 
	 */
	@RequestMapping("/indexGuestTransactions")
	public ModelAndView listGuestTransactionss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guesttransactionss", guestTransactionsService.loadGuestTransactionss());

		mav.setViewName("guesttransactions/listGuestTransactionss.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/guesttransactionsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

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
	 * Select an existing GuestTransactions entity
	 * 
	 */
	@RequestMapping("/selectGuestTransactions")
	public ModelAndView selectGuestTransactions(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guesttransactions", guestTransactionsDAO.findGuestTransactionsByPrimaryKey(idKey));
		mav.setViewName("guesttransactions/viewGuestTransactions.jsp");

		return mav;
	}

	/**
	 * Create a new GuestTransactions entity
	 * 
	 */
	@RequestMapping("/newGuestTransactions")
	public ModelAndView newGuestTransactions() {
		ModelAndView mav = new ModelAndView();
		GuestTransactions gt = new GuestTransactions();
		gt.setTransactionDate(Calendar.getInstance());
		mav.addObject("guesttransactions", gt);
		mav.addObject("newFlag", true);
		mav.setViewName("guesttransactions/editGuestTransactions.jsp");

		return mav;
	}

	/**
	 * Select the child GuestStayInfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGuestTransactionsGuestStayInfo")
	public ModelAndView confirmDeleteGuestTransactionsGuestStayInfo(@RequestParam Integer guesttransactions_id, @RequestParam Integer related_gueststayinfo_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("gueststayinfo", guestStayInfoDAO.findGuestStayInfoByPrimaryKey(related_gueststayinfo_id));
		mav.addObject("guesttransactions_id", guesttransactions_id);
		mav.setViewName("guesttransactions/gueststayinfo/deleteGuestStayInfo.jsp");

		return mav;
	}

	/**
	 * Edit an existing GuestTransactions entity
	 * 
	 */
	@RequestMapping("/editGuestTransactions")
	public ModelAndView editGuestTransactions(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guesttransactions", guestTransactionsDAO.findGuestTransactionsByPrimaryKey(idKey));
		mav.setViewName("guesttransactions/editGuestTransactions.jsp");

		return mav;
	}

	/**
	 * Delete an existing GuestTransactions entity
	 * 
	 */
	@RequestMapping("/deleteGuestTransactions")
	public String deleteGuestTransactions(@RequestParam Integer idKey) {
		GuestTransactions guesttransactions = guestTransactionsDAO.findGuestTransactionsByPrimaryKey(idKey);
		guestTransactionsService.deleteGuestTransactions(guesttransactions);
		return "forward:/indexGuestTransactions";
	}

	/**
	 * View an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/selectGuestTransactionsGuestStayInfo")
	public ModelAndView selectGuestTransactionsGuestStayInfo(@RequestParam Integer guesttransactions_id, @RequestParam Integer gueststayinfo_id) {
		GuestStayInfo gueststayinfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(gueststayinfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guesttransactions_id", guesttransactions_id);
		mav.addObject("gueststayinfo", gueststayinfo);
		mav.setViewName("guesttransactions/gueststayinfo/viewGuestStayInfo.jsp");

		return mav;
	}

	/**
	 * Show all GuestStayInfo entities by GuestTransactions
	 * 
	 */
	@RequestMapping("/listGuestTransactionsGuestStayInfo")
	public ModelAndView listGuestTransactionsGuestStayInfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guesttransactions", guestTransactionsDAO.findGuestTransactionsByPrimaryKey(idKey));
		mav.setViewName("guesttransactions/gueststayinfo/listGuestStayInfo.jsp");

		return mav;
	}

	/**
	 * Select the GuestTransactions entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGuestTransactions")
	public ModelAndView confirmDeleteGuestTransactions(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guesttransactions", guestTransactionsDAO.findGuestTransactionsByPrimaryKey(idKey));
		mav.setViewName("guesttransactions/deleteGuestTransactions.jsp");

		return mav;
	}

	/**
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/deleteGuestTransactionsGuestStayInfo")
	public ModelAndView deleteGuestTransactionsGuestStayInfo(@RequestParam Integer guesttransactions_id, @RequestParam Integer related_gueststayinfo_id) {
		ModelAndView mav = new ModelAndView();

		GuestTransactions guesttransactions = guestTransactionsService.deleteGuestTransactionsGuestStayInfo(guesttransactions_id, related_gueststayinfo_id);

		mav.addObject("guesttransactions_id", guesttransactions_id);
		mav.addObject("guesttransactions", guesttransactions);
		mav.setViewName("guesttransactions/viewGuestTransactions.jsp");

		return mav;
	}

	/**
	 * Entry point to show all GuestTransactions entities
	 * 
	 */
	public String indexGuestTransactions() {
		return "redirect:/indexGuestTransactions";
	}

	/**
	 * Save an existing GuestTransactions entity
	 * 
	 */
	@RequestMapping("/saveGuestTransactions")
	public String saveGuestTransactions(@ModelAttribute GuestTransactions guesttransactions) {
		guestTransactionsService.saveGuestTransactions(guesttransactions);
		return "forward:/indexGuestTransactions";
	}

	/**
	 * Create a new GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/newGuestTransactionsGuestStayInfo")
	public ModelAndView newGuestTransactionsGuestStayInfo(@RequestParam Integer guesttransactions_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("guesttransactions_id", guesttransactions_id);
		mav.addObject("gueststayinfo", new GuestStayInfo());
		mav.addObject("newFlag", true);
		mav.setViewName("guesttransactions/gueststayinfo/editGuestStayInfo.jsp");

		return mav;
	}

	/**
	 * Edit an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/editGuestTransactionsGuestStayInfo")
	public ModelAndView editGuestTransactionsGuestStayInfo(@RequestParam Integer guesttransactions_id, @RequestParam Integer gueststayinfo_id) {
		GuestStayInfo gueststayinfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(gueststayinfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guesttransactions_id", guesttransactions_id);
		mav.addObject("gueststayinfo", gueststayinfo);
		mav.setViewName("guesttransactions/gueststayinfo/editGuestStayInfo.jsp");

		return mav;
	}
}
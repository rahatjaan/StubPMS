package ige.integration.web;

import ige.integration.dao.GuestInfoDAO;
import ige.integration.dao.GuestStayInfoDAO;
import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;
import ige.integration.service.GuestInfoService;

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
 * Spring MVC controller that handles CRUD requests for GuestInfo entities
 * 
 */

@Controller("GuestInfoController")
public class GuestInfoController {

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
	 * Service injected by Spring that provides CRUD operations for GuestInfo entities
	 * 
	 */
	@Autowired
	private GuestInfoService guestInfoService;

	/**
	 * Edit an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/editGuestInfoGuestStayInfos")
	public ModelAndView editGuestInfoGuestStayInfos(@RequestParam Integer guestinfo_id, @RequestParam Integer gueststayinfos_id) {
		GuestStayInfo gueststayinfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(gueststayinfos_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guestinfo_id", guestinfo_id);
		mav.addObject("gueststayinfo", gueststayinfo);
		mav.setViewName("guestinfo/gueststayinfos/editGuestStayInfos.jsp");

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
	 * Select an existing GuestInfo entity
	 * 
	 */
	@RequestMapping("/selectGuestInfo")
	public ModelAndView selectGuestInfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guestinfo", guestInfoDAO.findGuestInfoByPrimaryKey(idKey));
		mav.setViewName("guestinfo/viewGuestInfo.jsp");

		return mav;
	}

	/**
	 * Show all GuestInfo entities
	 * 
	 */
	@RequestMapping("/indexGuestInfo")
	public ModelAndView listGuestInfos() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guestinfos", guestInfoService.loadGuestInfos());

		mav.setViewName("guestinfo/listGuestInfos.jsp");

		return mav;
	}

	/**
	 * Create a new GuestInfo entity
	 * 
	 */
	@RequestMapping("/newGuestInfo")
	public ModelAndView newGuestInfo() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guestinfo", new GuestInfo());
		mav.addObject("newFlag", true);
		mav.setViewName("guestinfo/editGuestInfo.jsp");

		return mav;
	}

	/**
	 * Select the child GuestStayInfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGuestInfoGuestStayInfos")
	public ModelAndView confirmDeleteGuestInfoGuestStayInfos(@RequestParam Integer guestinfo_id, @RequestParam Integer related_gueststayinfos_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("gueststayinfo", guestStayInfoDAO.findGuestStayInfoByPrimaryKey(related_gueststayinfos_id));
		mav.addObject("guestinfo_id", guestinfo_id);
		mav.setViewName("guestinfo/gueststayinfos/deleteGuestStayInfos.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/guestinfoController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the GuestInfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGuestInfo")
	public ModelAndView confirmDeleteGuestInfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guestinfo", guestInfoDAO.findGuestInfoByPrimaryKey(idKey));
		mav.setViewName("guestinfo/deleteGuestInfo.jsp");

		return mav;
	}

	/**
	 * View an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/selectGuestInfoGuestStayInfos")
	public ModelAndView selectGuestInfoGuestStayInfos(@RequestParam Integer guestinfo_id, @RequestParam Integer gueststayinfos_id) {
		GuestStayInfo gueststayinfo = guestStayInfoDAO.findGuestStayInfoByPrimaryKey(gueststayinfos_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guestinfo_id", guestinfo_id);
		mav.addObject("gueststayinfo", gueststayinfo);
		mav.setViewName("guestinfo/gueststayinfos/viewGuestStayInfos.jsp");

		return mav;
	}

	/**
	 * Entry point to show all GuestInfo entities
	 * 
	 */
	public String indexGuestInfo() {
		return "redirect:/indexGuestInfo";
	}

	/**
	 * Show all GuestStayInfo entities by GuestInfo
	 * 
	 */
	@RequestMapping("/listGuestInfoGuestStayInfos")
	public ModelAndView listGuestInfoGuestStayInfos(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guestinfo", guestInfoDAO.findGuestInfoByPrimaryKey(idKey));
		mav.setViewName("guestinfo/gueststayinfos/listGuestStayInfos.jsp");

		return mav;
	}

	/**
	 * Delete an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/deleteGuestInfoGuestStayInfos")
	public ModelAndView deleteGuestInfoGuestStayInfos(@RequestParam Integer guestinfo_id, @RequestParam Integer related_gueststayinfos_id) {
		ModelAndView mav = new ModelAndView();

		GuestInfo guestinfo = guestInfoService.deleteGuestInfoGuestStayInfos(guestinfo_id, related_gueststayinfos_id);

		mav.addObject("guestinfo_id", guestinfo_id);
		mav.addObject("guestinfo", guestinfo);
		mav.setViewName("guestinfo/viewGuestInfo.jsp");

		return mav;
	}

	/**
	 * Delete an existing GuestInfo entity
	 * 
	 */
	@RequestMapping("/deleteGuestInfo")
	public String deleteGuestInfo(@RequestParam Integer idKey) {
		GuestInfo guestinfo = guestInfoDAO.findGuestInfoByPrimaryKey(idKey);
		guestInfoService.deleteGuestInfo(guestinfo);
		return "forward:/indexGuestInfo";
	}

	/**
	 * Save an existing GuestInfo entity
	 * 
	 */
	@RequestMapping("/saveGuestInfo")
	public String saveGuestInfo(@ModelAttribute GuestInfo guestinfo) {
		guestInfoService.saveGuestInfo(guestinfo);
		return "forward:/indexGuestInfo";
	}

	/**
	 * Create a new GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/newGuestInfoGuestStayInfos")
	public ModelAndView newGuestInfoGuestStayInfos(@RequestParam Integer guestinfo_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("guestinfo_id", guestinfo_id);
		mav.addObject("gueststayinfo", new GuestStayInfo());
		mav.addObject("newFlag", true);
		mav.setViewName("guestinfo/gueststayinfos/editGuestStayInfos.jsp");

		return mav;
	}

	/**
	 * Edit an existing GuestInfo entity
	 * 
	 */
	@RequestMapping("/editGuestInfo")
	public ModelAndView editGuestInfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guestinfo", guestInfoDAO.findGuestInfoByPrimaryKey(idKey));
		mav.setViewName("guestinfo/editGuestInfo.jsp");

		return mav;
	}

	/**
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	@RequestMapping("/saveGuestInfoGuestStayInfos")
	public ModelAndView saveGuestInfoGuestStayInfos(@RequestParam Integer guestinfo_id, @ModelAttribute GuestStayInfo gueststayinfos) {
		GuestInfo parent_guestinfo = guestInfoService.saveGuestInfoGuestStayInfos(guestinfo_id, gueststayinfos);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guestinfo_id", guestinfo_id);
		mav.addObject("guestinfo", parent_guestinfo);
		mav.setViewName("guestinfo/viewGuestInfo.jsp");

		return mav;
	}
}
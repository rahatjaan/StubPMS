package ige.integration.service;

import ige.integration.dao.ReportProblemDAO;
import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;
import ige.integration.domain.ReportProblem;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for GuestTransactions entities
 * 
 */

@Service("ReportProblemService")
@Transactional
public class ReportProblemServiceImpl implements ReportProblemService {

	/**
	 * DAO injected by Spring that manages GuestStayInfo entities
	 * 
	 */
	@Autowired
	private ReportProblemDAO reportProblemDAO;
	public ReportProblemServiceImpl() {
	}

	/**
	 * Save an existing GuestStayInfo entity
	 * 
	 */
	@Transactional
	public ReportProblem saveReportProblem(ReportProblem related_reportproblem) {
		System.out.println("INSIDE");
		ReportProblem rp = reportProblemDAO.store(related_reportproblem);
		System.out.println("OUT");
		reportProblemDAO.flush();
		System.out.println("THE ID IS: "+rp.getId());
		return rp;
	}
}

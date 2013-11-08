package ige.integration.service;

import ige.integration.domain.ReportProblem;

/**
 * Spring service that handles CRUD requests for GuestTransactions entities
 * 
 */
public interface ReportProblemService {
	public ReportProblem saveReportProblem(ReportProblem related_reportproblem);
}
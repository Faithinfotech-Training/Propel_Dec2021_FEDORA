package com.app.service;

import java.util.List;

import com.app.dto.TestResultDTO;
import com.app.entity.TestReport;

public interface ITestReportService {
	
	public void saveTestReport(TestReport testReport);
	
	//Find all lab results prescriptions by Id
	public List<TestResultDTO>  getAllTestResultByPatientId(int id);

}
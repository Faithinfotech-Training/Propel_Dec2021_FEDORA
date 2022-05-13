package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ITestReportRepository;
import com.app.dto.NotesPrescribedDTO;
import com.app.dto.TestResultDTO;
import com.app.entity.TestReport;
@Service
public class TestReportServiceImplement implements ITestReportService {
	
	
	@Autowired
	private ITestReportRepository testReportRepository  ;

	@Override
	public void saveTestReport(TestReport testReport) {
		 
		testReportRepository.save(testReport);
	}

	@Override
	public List<TestResultDTO> getAllTestResultByPatientId(int id) {
		
		return (List<TestResultDTO>) testReportRepository.getAllDTOTestResultByPatientId(id);
	}

}
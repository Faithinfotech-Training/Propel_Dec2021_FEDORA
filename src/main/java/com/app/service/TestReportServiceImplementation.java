package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ITestReportRepository;
import com.app.dto.TestReportDTO;
import com.app.entity.TestReport;
/*
@Service
public class TestReportServiceImplementation implements ITestReportService {

	@Autowired 
	private ITestReportRepository testReportRepo;
	

	@Override
	public void saveTestReport(TestReport testReport) {
		testReportRepo.save(testReport)		;
	}

	@Override
	public Optional<TestReport> getTestReport(int id) {
		return testReportRepo.findById(id);
	}

	@Override
	public void deleteTestReport(int id) {
		testReportRepo.deleteById(id);
	}

	@Override
	public List<TestReport> getTestReport() {
		return (List<TestReport>) testReportRepo.findAll();
	}

	@Override
	public TestReportDTO getPatientLabReport(int id) {
	
		return testReportRepo.getPatientLabReport(id);
	}

}
*/
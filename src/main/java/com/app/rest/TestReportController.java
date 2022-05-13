package com.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.TestReport;
import com.app.service.ITestReportService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TestReportController {
	
	/*@Autowired
	private ITestReportService testReportService;
	
	//get all labtest
	@GetMapping("/labtestreports")
	public List<TestReport> getTestReport() {
		return (List<TestReport>) testReportService.getTestReport();
	}

	//Add labtest
	@PostMapping("/labtestreport")
	public void addLabTest(@RequestBody TestReport testReport) {
		testReportService.saveTestReport(testReport);
	}


	//get labtest by id
	@GetMapping("/testreport/{id}")
	public Optional<TestReport> getTestReport(@PathVariable int id) {
		return testReportService.getTestReport(id);
	}
	
	//Update Labtest
	@PutMapping("/labtestreport")
	public void updateLabTest(@RequestBody TestReport testReport) {
		testReportService.saveTestReport(testReport);
	}


	//delete Employee
	@DeleteMapping("/labtestreport/{id}")
	public void deleteTestReport(@PathVariable int id) {
		testReportService.deleteTestReport(id);
	}

	@GetMapping("/patient/lab-report{id}")
	public void viewLabReport(@PathVariable int id) {
		testReportService.getPatientLabReport(id);
		
	}*/
}

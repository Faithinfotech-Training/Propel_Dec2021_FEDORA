package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.TestResultDTO;
import com.app.service.ITestReportService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TestReportRestController {
	
	@Autowired
	private ITestReportService  testReportService ;
	
	@GetMapping("/testreports/dto/{id}")
	public List<TestResultDTO> getAllTestResultByPatientId(@PathVariable int id){
		
		return testReportService.getAllTestResultByPatientId(id);
		
	}


}
package com.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.TestPrescriptionDTO;
import com.app.service.ILabTestPrescriptionService;

@CrossOrigin
@RestController
@RequestMapping("/TestPrescription")
public class TestPrescriptionController {
	
	@Autowired
	private ILabTestPrescriptionService labTestPrescriptionService;
	
	@GetMapping("/test-prescription-list/{labtestprescribeId}")
	public TestPrescriptionDTO getTestPrescriptionByPrescriptionId(@PathVariable Integer labtestprescribeId){
		return labTestPrescriptionService.getTestPrescriptionByPrescriptionId(labtestprescribeId);
	}

}

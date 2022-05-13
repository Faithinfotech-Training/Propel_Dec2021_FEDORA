package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.LabTest;
import com.app.service.ILabTestService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LabTestRestController {
	
	@Autowired
	private ILabTestService  labTestService;
	
	//Get all Employees
		@GetMapping("/labtests")
		public List<LabTest> getAllLabTests(){
			
			return labTestService.getLabTests();
			
		}

}

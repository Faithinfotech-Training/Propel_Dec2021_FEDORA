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

import com.app.entity.TestPrescribed;
import com.app.service.ITestPrescribedService;

@CrossOrigin
@RestController
@RequestMapping("/api")

public class TestPrescribedRC {

	@Autowired
	private ITestPrescribedService tetServ;
	
	//get all labTestPrescribeds
		@GetMapping("/labpres")
		public List<TestPrescribed> getAllLabTestPrescribeds(){
			
			return tetServ.getLabTestPrescribeds();
			
		}
		
		//Get Employee By Id
		@GetMapping("/labpres/{theId}")
		public Optional<TestPrescribed> getLabTestPrescribed(@PathVariable int id) {
					
			return tetServ.getLabTestPrescribed(id);
					
		}
		
		//Add Employee
		@PostMapping("/labpres")
		public void addLabTestPrescribed(@RequestBody TestPrescribed testPrescribed) {
			tetServ.saveLabTestPrescribed(testPrescribed);
		}
				
		//Update Employee
		@PutMapping("/labpres")
		public void updateLabTestPrescribed(@RequestBody TestPrescribed labTestPrescribed) {
			tetServ.saveLabTestPrescribed(labTestPrescribed);
					
		}
				
		//Delete Employee
		@DeleteMapping("/labpres/{theId}")
		public void deleteLabTestPrescribed(@PathVariable int id) {
			tetServ.deleteLabTestPrescribed(id);
		}
}

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

import com.app.entity.LabTest;
import com.app.service.ILabTestService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LabTestController {
	
	@Autowired
	private ILabTestService labtestService;
	
	//get all labtest
		@GetMapping("/labtests")
		public List<LabTest>getAllLabTest(){
			return labtestService.getLabTest();
			
		}
		

		
		//get labtest by id
		@GetMapping("/labtests/{id}")
		public Optional<LabTest> getLabTest(@PathVariable int id){
			return labtestService.getLabTest(id);
			
		}
		
		//Add labtest
		@PostMapping("/labtests")
		public void addLabTest(@RequestBody LabTest labtest) {
			labtestService.saveLabTest(labtest);
		}
		
		//Update Labtest
		@PutMapping("/labtests")
		public void updateLabTest(@RequestBody LabTest labtest) {
			labtestService.saveLabTest(labtest);
		}
		
		//delete Employee
		@DeleteMapping("/labtests/{id}")
		public void deleteLabTest(@PathVariable int id) {
			labtestService.deleteLabTest(id);
		}
		
		//Custom method using JPQL
		@GetMapping("/labtests/search/{name}")
		public List<LabTest> getLabTestByLabTestName(@PathVariable String name){
			return labtestService.getLabTestByLabTestName(name) ;
			
		}
	
	

}

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

import com.app.entity.Patient;
import com.app.service.IPatientService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PatientController {
	
	@Autowired
	private IPatientService patientService;
	
	//Get all Patients
	@GetMapping("/patients")
	public List<Patient> getAllPatients() {
		
		return patientService.getPatient();
	}
	
	//Get active Patients added
	@GetMapping("/patients/active")
	public List<Patient> getActivePatients() {
		 
		return patientService.listActivePatients();
		  
	}
	
	//Get patient by id
	@GetMapping("/patients/{id}")
	public Optional<Patient> getPatient(@PathVariable int id){
		
		return patientService.getPatient(id);
	}
		
		
	//Add patient	
	@PostMapping("/patients")
	public void addPatient(@RequestBody Patient patient) {
		 
		patientService.savePatient(patient);
	}
		
		
	//Update patient
	@PutMapping("/patients")
	public void updatePatient(@RequestBody Patient patient) {
		
		patientService.savePatient(patient);
	}
	
		
	//Delete patient
	@DeleteMapping("/patients/{id}")
	public void deletePatient( @PathVariable int id) {
		
		patientService.deletePatient(id);
	}

	//Disable patient
	@PutMapping("/patients/{id}")
	public void disablePatient(@PathVariable int id) {
		
		patientService.disablePatient(id);
	}
}

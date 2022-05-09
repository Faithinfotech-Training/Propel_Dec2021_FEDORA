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

import com.app.entity.Appointment;
import com.app.entity.Consultation;
import com.app.service.IConsultationService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ConsultationRC {
	@Autowired
	private IConsultationService conSer;
	
	//get consultation list
	@GetMapping("/consultations")
	public List<Consultation> getConsultationList(){
		
		return conSer.getConsList();
		
	}
	

	//Getconsultation By Id
	@GetMapping("/consultations/{id}")
	public Optional<Consultation> getCons(@PathVariable int id) {
				
		return conSer.getByConId(id);
				
	}
	
	//Add consultations
	@PostMapping("/consultations")
	public void addCons(@RequestBody Consultation consultation) {
		conSer.saveConultedPat(consultation);
	}
			
	//Update consultations
	@PutMapping("/consultations")
	public void updateCons(@RequestBody Consultation consultation) {
		conSer.saveConultedPat(consultation);
			
	}
			
	//Delete Employee
	@DeleteMapping("/consultations/{d}")
	public void deleteCons(@PathVariable int id) {
		conSer.deltConById(id);;
	}
	
}

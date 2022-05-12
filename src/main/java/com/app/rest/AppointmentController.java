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

import com.app.dto.PatientAppointmentDTO;
import com.app.dto.PatientBillDTO;
import com.app.entity.Appointment;
import com.app.service.IAppointmentService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AppointmentController {
	
	@Autowired
	private IAppointmentService appointmentService;
	
	//Get all 
	@GetMapping("/appointments/all")
	public List<Appointment> getAllAppointment() {
		
		return appointmentService.getAppointment();
	}
	//Get all added 
	@GetMapping("/appointments")
	public List<PatientAppointmentDTO> getAppointment() {
		
		return appointmentService.findAllDTOAppoinment();  
	}
	
	//Get all 
	@GetMapping("/bills")
	public List<PatientBillDTO> getBill() {
		
		return appointmentService.findAllDTOBill();
	}
	//Get by id
	@GetMapping("/appointments/{id}")
	public Optional<Appointment> getAppointment(@PathVariable int id){
		
		return appointmentService.getAppointment(id);
	}
			
			
	//Add 	
	@PostMapping("/appointments")
	public void addAppointment(@RequestBody Appointment appointment) {
		 
		appointmentService.saveAppointment(appointment);
	}
			
			
	//Update 
	@PutMapping("/appointments")
	public void updateAppointment(@RequestBody Appointment appointment) {
		
		appointmentService.saveAppointment(appointment);
	}
		
		
	//Delete patient
	@DeleteMapping("/appointments/{id}")
	public void deleteAppointment( @PathVariable int id) {
		
		appointmentService.disableAppointment(id);   
	}

	
}

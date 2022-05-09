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
import com.app.service.IAppointmentService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AppointmentRC {
	@Autowired
	private IAppointmentService appointmentSer;
	
	//get all list
	@GetMapping("/appointments")
	public List<Appointment>getAppoiList(){
		return appointmentSer.getAppointmentList();
		
	}
	
		//Get appointments By Id
		@GetMapping("/appointments/{id}")
		public Optional<Appointment> getAppointment(@PathVariable int id) {
					
			return appointmentSer.getAppointment(id);
					
		}
		
		//Add appointments
		@PostMapping("/appointments")
		public void addAppointment(@RequestBody Appointment appointment) {
			appointmentSer.saveAppointment(appointment);
		}
				
		//Update appointments
		@PutMapping("/appointments")
		public void updateAppointment(@RequestBody Appointment appointment) {
			appointmentSer.saveAppointment(appointment);
				
		}
				
		//Delete appointments
		@DeleteMapping("/appointments/{d}")
		public void deleteAppointment(@PathVariable int id) {
			appointmentSer.deleteAppointment(id);
		}
}

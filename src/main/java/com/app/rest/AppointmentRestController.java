package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AppointmentDTO;
import com.app.entity.Appointment;
import com.app.service.IAppointmentService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AppointmentRestController {
	
	
	@Autowired
	private IAppointmentService  appointmentService;
	
	//appointment
		@GetMapping("/appointments")
		public List<Appointment> getAllDepartments(){
			
			return appointmentService.getAppointments();
			
		}
		
	/*	@GetMapping("/appointments/dto")
		public List<AppointmentDTO>getAllDTOAppoint(){
			return appointmentService.getAllDTO();
			
		}*/

}
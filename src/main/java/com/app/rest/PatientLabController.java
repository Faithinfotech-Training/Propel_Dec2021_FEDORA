package com.app.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.dto.PatientAppointmentDTO;
import com.app.service.IPatientLabService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PatientLabController {
	
	@Autowired
	private IPatientLabService patientLabService;
	
	//get all labtest
	@GetMapping("/patient-list")
	public List<PatientAppointmentDTO> getPatientNamePatientIDAppointment(){
		return patientLabService.getPatientNamePatientIDAppointment();
	}
	
	/*@GetMapping("/patient-list/{Id}")
	public Optional<PatientAppointmentDTO> getPatientNamePatientIDAppointmentId(@PathVariable int id){
		return patientLabService.getPatientNamePatientIDAppointmentId(id);
	}*/
	
}
	



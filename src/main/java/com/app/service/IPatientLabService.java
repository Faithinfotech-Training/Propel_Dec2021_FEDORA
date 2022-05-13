package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.dto.PatientAppointmentDTO;
import com.app.entity.Patient;

public interface IPatientLabService {
	
	public List<PatientAppointmentDTO> getPatientNamePatientIDAppointment();
	
	//public Optional<PatientAppointmentDTO> getPatientNamePatientIDAppointmentId(int Id);
	
	

}

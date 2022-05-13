package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IPatientLabRepository;
import com.app.dto.PatientAppointmentDTO;
import com.app.entity.Patient;

@Service
public class PatientLabServiceImplementation implements IPatientLabService {

	@Autowired
	private IPatientLabRepository patientLabRepo;
	
	
	@Override
	public List<PatientAppointmentDTO> getPatientNamePatientIDAppointment() {
		
		return patientLabRepo.getPatientNamePatientIDAppointment();
		/*
		List<PatientAppointmentDTO> patientAppointmentDtoList = patientLabRepo.getPatientNamePatientIDAppointmentId();
		List<PatientAppointmentDTO> patientAppointment = new ArrayList<PatientAppointmentDTO>();
		for (PatientAppointmentDTO patientAppointmentList : patientAppointmentDtoList) {
			PatientAppointmentDTO dto = new PatientAppointmentDTO();
			
			dto.setAppointmentId(patientAppointmentList.getAppointmentId());
			dto.setPatientId(patientAppointmentList.getPatientId());
			dto.setPatientName(patientAppointmentList.getPatientName());
			patientAppointment.add(dto);
		}
		
		return patientAppointment;
		*/
	
	}



}

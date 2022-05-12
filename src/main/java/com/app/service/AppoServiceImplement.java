package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IAppointmentRepository;
import com.app.dto.AppointmentDTO;
import com.app.entity.Appointment;


@Service
public class AppoServiceImplement implements IAppointmentService {
	
	@Autowired
	private IAppointmentRepository appointmentRepo;

	@Override
	public List<Appointment> getAppointments() {
		
		return  (List<Appointment>) appointmentRepo.findAll();
	}

	/*@Override
	public List<AppointmentDTO> getAllDTO() {
		
		return (List<AppointmentDTO>)appointmentRepo.getAllDTOAppoint();
	}*/

}

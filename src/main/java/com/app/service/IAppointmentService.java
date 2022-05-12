package com.app.service;

import java.util.List;

import com.app.dto.AppointmentDTO;
import com.app.entity.Appointment;

public interface IAppointmentService {
	
	//List
	public List<Appointment> getAppointments();
	
	//dto 
	//public List<AppointmentDTO>getAllDTO();

}

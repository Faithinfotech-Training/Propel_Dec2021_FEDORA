package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entity.Appointment;

public interface IAppointmentService {

	//list appointment
	public List<Appointment> getAppointmentList();
	
	//insert 
	public void saveAppointment(Appointment appointment);
	
	//Search By Id
	public Optional<Appointment> getAppointment(int id);
	
	//Delete
	public void deleteAppointment(int id);
}

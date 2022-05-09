package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IAppointmentRepo;
import com.app.entity.Appointment;

@Service
public class AppointmentSeviceImple implements IAppointmentService{
	
	@Autowired
	private IAppointmentRepo appointmentRepo;

	@Override
	public List<Appointment> getAppointmentList() {
		
		return (List<Appointment>)appointmentRepo.findAll();
	}

	//insert
	public void saveAppointment(Appointment appointment) {
		appointmentRepo.save(appointment);
		
	}

	//search by id
	public Optional<Appointment> getAppointment(int id) {
		
		return appointmentRepo.findById(id);
	}

	//delete by id
	public void deleteAppointment(int id) {
		appointmentRepo.deleteById(id);
		
	}

}

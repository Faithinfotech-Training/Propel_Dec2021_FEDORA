package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.dto.PatientAppointmentDTO;
import com.app.dto.PatientBillDTO;
import com.app.entity.Appointment;
import com.app.entity.Patient;

@Service
public interface IAppointmentService {

	//List
	public List<Appointment>getAppointment();
	
	//Insert/Update
	public void saveAppointment(Appointment appointment);
	
	//Search By Id
    public Optional <Appointment> getAppointment(int id);
   
    //Disable
    public void disableAppointment(int id);
    
    public List<PatientAppointmentDTO>findAllDTOAppoinment();
    
    public List<PatientBillDTO>findAllDTOBill();
			   

}

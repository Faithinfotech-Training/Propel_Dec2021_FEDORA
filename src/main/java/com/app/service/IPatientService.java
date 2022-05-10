package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.entity.Patient;

@Service
public interface IPatientService {
	
	//List
	public List<Patient>getPatient();
	
	//Insert/Update
	public void savePatient(Patient patient);
	
	//Search By Id
    public Optional <Patient> getPatient(int id);
    
    //list active patients
    public List<Patient>listActivePatients();
    
    //Disable
    public void deletePatient(int id);
    
    //Disable
    public void disablePatient(int id);
    
    
		   

}

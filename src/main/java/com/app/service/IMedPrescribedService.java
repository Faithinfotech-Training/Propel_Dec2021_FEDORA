package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entity.Consultation;
import com.app.entity.MedicinePrescribed;



public interface IMedPrescribedService {

	//list 
	public List<MedicinePrescribed> getMedPrescList();
	
	//insert
	public void addMedPrescribe(MedicinePrescribed consult) ;
	
	//Search By Id
	public Optional<MedicinePrescribed> getMedicnePrescribed(int theId);
		
	//Delete
	public void deleteMedicnePrescribed(int theId);

}

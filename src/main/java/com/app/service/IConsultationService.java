package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entity.Consultation;

public interface IConsultationService {
	
	//list
	public List<Consultation> getConsList();
	
	//insert 
	public void saveConultedPat(Consultation consult) ;
	
	//get by id
	public Optional<Consultation> getByConId(int id);
	
	//delete
	public void deltConById(int id);
	
	//disable
	public void disableConById(int id);

}

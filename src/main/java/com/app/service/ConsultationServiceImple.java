package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IConsultationRepo;
import com.app.entity.Consultation;
@Service
public class ConsultationServiceImple implements IConsultationService{
	@Autowired
	private IConsultationRepo conRepo;


	//full list of consultation 
	public List<Consultation> getConsList() {
		
		return   (List<Consultation>)conRepo.findAll();
	}


	//save cponsulted patient
	public void saveConultedPat(Consultation consult) {
		conRepo.save(consult);
		
	}


	//get by id
	public Optional<Consultation> getByConId(int id) {
		
		return conRepo.findById(id);
	}


	@Override
	public void deltConById(int id) {
		conRepo.deleteById(id);
		
	}


	@Override
	public void disableConById(int id) {
		conRepo.disableCon(id);
		
	}

}

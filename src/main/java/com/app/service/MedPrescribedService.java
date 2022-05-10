package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IMedPrescibedRepo;
import com.app.entity.MedicinePrescribed;

@Service
public class MedPrescribedService implements IMedPrescribedService{
	@Autowired
	private IMedPrescibedRepo medPrescri;

	//medprescribed list
	public List<MedicinePrescribed> getMedPrescList() {
		
		return (List<MedicinePrescribed>) medPrescri.findAll();
	}

	//insert medprescribed
	public void addMedPrescribe(MedicinePrescribed medPrisc) {
		medPrescri.save(medPrisc);
	}

	//search by id
	public Optional<MedicinePrescribed> getMedicnePrescribed(int id) {
		
		return medPrescri.findById(id);
	}

	//delete by id
	public void deleteMedicnePrescribed(int id) {
		medPrescri.deleteById(id);
		
	}

}

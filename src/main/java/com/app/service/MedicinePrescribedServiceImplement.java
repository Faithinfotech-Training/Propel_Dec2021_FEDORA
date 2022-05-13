package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IMedicinePrescribedRepository;
import com.app.dto.LabTestPrescribedtDTO;
import com.app.dto.MedicinePrescribedDTO;
import com.app.entity.MedicinePrescribed;

@Service
public class MedicinePrescribedServiceImplement implements IMedicinePrescribedService {
	
	@Autowired
	private IMedicinePrescribedRepository medicinePrescribedRepository;

	@Override
	public void saveMedicinePrescribed(MedicinePrescribed medicinePrescribed) {
		 
		medicinePrescribedRepository.save(medicinePrescribed);
	}

	@Override
	public List<MedicinePrescribedDTO> getAllMedicinePrescribedByPatientId(int id) {
		 
		return (List<MedicinePrescribedDTO>) medicinePrescribedRepository.getAllDTOMedicinePrescribedByPatientId(id);
	}

	@Override
	public List<MedicinePrescribed> findAllMedPresc() {
		
		return ( List<MedicinePrescribed>)medicinePrescribedRepository.findAll();
	}

}

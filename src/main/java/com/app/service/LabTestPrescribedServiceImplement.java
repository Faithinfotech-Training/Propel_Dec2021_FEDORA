package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILabTestPrescribedRepository;
import com.app.dto.LabTestPrescribedtDTO;
import com.app.entity.LabTestPrescribed;

@Service
public class LabTestPrescribedServiceImplement implements ILabTestPrescribedService {
	
	@Autowired
	private ILabTestPrescribedRepository labTestPrescribedRepository;

	//save or insert
	public void saveLabTestPrescribed(LabTestPrescribed labTestPrescribed) {
		 
		labTestPrescribedRepository.save(labTestPrescribed);
	}

	 /*
	@Override
	public void deleteLabTestPrescribedByPatientId(int theId) {
		labTestPrescribedRepository.deleteLabTestPrescribedByPatientId(theId);
		
	}
		*/
	
	@Override
	public List<LabTestPrescribedtDTO> getAllLabTestPrescribedByPatientId(int id) {
		 
		return (List<LabTestPrescribedtDTO>)labTestPrescribedRepository.getAllDTOLabTestPrescriptionsByPatientId(id);
	}

	@Override
	public List<LabTestPrescribed> getLabTestPrescribeds() {
		
		return (List<LabTestPrescribed>)labTestPrescribedRepository.findAll();
	}
	




}

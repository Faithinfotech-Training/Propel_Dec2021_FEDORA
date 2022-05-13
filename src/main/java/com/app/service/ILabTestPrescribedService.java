package com.app.service;

import java.util.List;

import com.app.dto.LabTestPrescribedtDTO;
import com.app.entity.LabTestPrescribed;



public interface ILabTestPrescribedService {
	
	
	
	//save
	public void saveLabTestPrescribed(LabTestPrescribed labTestPrescribed);
	
	
	
	
	//Delete by Patient ID
	//public void deleteLabTestPrescribedByPatientId(int theId);
	
	//Find all lab test prescriptions by Id
	public List<LabTestPrescribedtDTO>  getAllLabTestPrescribedByPatientId(int id);
	
	
	//find all
	public List<LabTestPrescribed> getLabTestPrescribeds();
	
}
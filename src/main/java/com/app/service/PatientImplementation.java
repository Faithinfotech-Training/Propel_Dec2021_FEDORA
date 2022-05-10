package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IPatientRepository;
import com.app.entity.Patient;

@Service
public class PatientImplementation implements IPatientService {
	
	@Autowired
	private IPatientRepository patientRepo;

	@Override
	public List<Patient> getPatient() {
		return (List<Patient>) patientRepo.findAll();
	}

	@Override
	public void savePatient(Patient patient) {
		patientRepo.save(patient);

	}

	@Override
	public Optional<Patient> getPatient(int id) {
		return patientRepo.findById(id);
	}
	
	@Override
	public void deletePatient(int id) {
		patientRepo.deleteById(id);
		
	}

	@Override
	public void disablePatient(int id) {
		patientRepo.disablePatient(id);

	}

	@Override
	public List<Patient> listActivePatients() {
		return (List<Patient>) patientRepo.listActivePatients();
	}

	

}

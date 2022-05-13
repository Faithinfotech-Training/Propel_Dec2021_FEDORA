package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IDoctorRepository;
import com.app.entity.Doctor;

@Service
public class DoctorServiceImplementation implements IDoctorService {
	@Autowired
	private IDoctorRepository doctorRepo;
	
	@Override
	public List<Doctor> getAllDoctor() {
		return (List<Doctor>) doctorRepo.findAll();
	}

	@Override
	public Optional<Doctor> getDoctorSpecializeList(Integer id) {
		return (Optional<Doctor>) doctorRepo.getDoctorSpecializeList(id);  
	}

}

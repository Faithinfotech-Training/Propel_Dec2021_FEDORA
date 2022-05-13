package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ISpecializationRepository;
import com.app.entity.Specialization;

@Service
public class SpecializationImplementation implements ISpecializationService {
	
	@Autowired
	private ISpecializationRepository SpecializationRepo;
	
	@Override
	public List<Specialization> getSpecialization() {
		return (List<Specialization>) SpecializationRepo.findAll();

	}

}

package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.entity.Doctor;


@Service
public interface IDoctorService {
	//List
	public List<Doctor>getAllDoctor();
	
	//list by specialization
    public Optional<Doctor>getDoctorSpecializeList(Integer id);
		

}

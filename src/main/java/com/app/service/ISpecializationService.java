package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entity.Specialization;


@Service
public interface ISpecializationService {
	 public List <Specialization> getSpecialization();

}

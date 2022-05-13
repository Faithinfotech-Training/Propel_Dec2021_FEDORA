package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Specialization;
import com.app.service.ISpecializationService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SpecializationController {

	@Autowired
	 private ISpecializationService specializationService;
	
	//Get all 
		 @GetMapping("/specializations")
		 public List<Specialization> getAllSpecialization(){
			 
			 return specializationService.getSpecialization();   
		 }

}

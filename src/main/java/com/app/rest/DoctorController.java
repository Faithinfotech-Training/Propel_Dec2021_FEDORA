package com.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Doctor;
import com.app.service.IDoctorService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class DoctorController {

	@Autowired
	 private IDoctorService doctorService;
	
	//Get 
	 @GetMapping("/doctors")
	 public List<Doctor> getAllDoctor(){
		 
		 return doctorService.getAllDoctor();  
	 }
	 
	 @GetMapping("/doctors/specialization/{id}")
	 public Optional<Doctor> getDoctorSpecializeList(@PathVariable Integer id){
		 
		 return doctorService.getDoctorSpecializeList(id);  
	 }

}

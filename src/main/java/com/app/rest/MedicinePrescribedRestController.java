package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.MedicinePrescribedDTO;
import com.app.entity.MedicinePrescribed;
import com.app.service.IMedicinePrescribedService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MedicinePrescribedRestController {
	
	@Autowired
	private IMedicinePrescribedService  medicinePrescribedService;
	
	
	@GetMapping("/medicinesprescribed/dto/{id}")
	public List<MedicinePrescribedDTO> getAllLabTestPrescribedByPatientId(@PathVariable int id){
		
		return medicinePrescribedService.getAllMedicinePrescribedByPatientId(id);
		
	}
	
	
	@GetMapping("/medicinesprescribeds")
	public List<MedicinePrescribed>getAllMedPresCri(){
		return (List<MedicinePrescribed>)medicinePrescribedService.findAllMedPresc();
		
	}

}
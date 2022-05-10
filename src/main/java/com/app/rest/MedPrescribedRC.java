 package com.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.MedicinePrescribed;
import com.app.service.IMedPrescribedService;

@CrossOrigin
@RestController
@RequestMapping("/api")

public class MedPrescribedRC {
	@Autowired
	private IMedPrescribedService medPrescriServ;
	//get prescribed list
	@GetMapping("/medicine_prescriptions")
	public List<MedicinePrescribed> getmedPricribedList(){
		return medPrescriServ.getMedPrescList();
		
	}
	//add medicine
	@PostMapping("/medicineprescribeds")
	public void addMedPrescribed(@RequestBody MedicinePrescribed medPrescri) {
		medPrescriServ.addMedPrescribe(medPrescri);
	}

	//Get Employee By Id
		@GetMapping("/medpres/{theId}")
		public Optional<MedicinePrescribed> getMedicnePrescribed(@PathVariable int id) {
					
			return medPrescriServ.getMedicnePrescribed(id);
					
 }
		//Update Employee
		@PutMapping("/medpres")
		public void updateMedicnePrescribed(@RequestBody MedicinePrescribed medicnePrescribed) {
			medPrescriServ.addMedPrescribe(medicnePrescribed);
					
		}
				
		//Delete Employee
		@DeleteMapping("/medpres/{theId}")
		public void deleteMedicnePrescribed(@PathVariable int theId) {
			medPrescriServ.deleteMedicnePrescribed(theId);
		}
		
}

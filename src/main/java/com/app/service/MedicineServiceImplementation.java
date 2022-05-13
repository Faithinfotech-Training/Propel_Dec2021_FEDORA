package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IMedicineRepository;
import com.app.entity.Medicine;


@Service
public class MedicineServiceImplementation implements IMedicineService {
	
	@Autowired
	private   IMedicineRepository MedicineRepo;

	@Override
	public List<Medicine> getMedicine() {
		return (List<Medicine>)	MedicineRepo.findAll();
	}

	@Override
	public void savemedicine(Medicine medicine) {
		 
		MedicineRepo.save(medicine);
	}

	@Override
	public Optional<Medicine> getMedicine(int id) {
		 
		return MedicineRepo.findById(id);
	}

	@Override
	public void deleteMedicine(int id) {
		 
		MedicineRepo.deleteById(id);
	}

	@Override
	public List<Medicine> getMedicineByMedicineName(String name) {
		 
		return (List<Medicine>)  MedicineRepo.findByMedicineName(name);
	}
	
	/*@Override
	public List<Medicine> getMedicine() {
		return (List<Medicine>) MedicineRepo.findAll();
	}

	
	 //insert or update
	@Override
	public void savemedicine(Medicine medicine) {
		MedicineRepo.save(medicine);
		
	}

	
	 //get medicine by id
	@Override
	public Optional<Medicine> getMedicine(int id) {
		
		return MedicineRepo.findById(id);
	}

	 //delete medicine
	@Override
	public void deleteMedicine(int id) {
		  
		MedicineRepo.deleteById(id);
	}

	@Override
	public List<Medicine> getMedicineByMedicineName(String name) {
		
		return (List<Medicine>)  MedicineRepo.findByMedicineName(name);
	}*/

}

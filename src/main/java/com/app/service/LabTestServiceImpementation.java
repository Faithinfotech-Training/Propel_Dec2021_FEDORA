package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILabTestRepository;
import com.app.entity.LabTest;

@Service
public class LabTestServiceImpementation implements ILabTestService {


	
	@Autowired
	private ILabTestRepository LabtestRepo;

	//list
	@Override
	public List<LabTest> getLabTest() {
		
		return (List<LabTest>) LabtestRepo.findAll();
	}

	//insert or Update
	@Override
	public void saveLabTest(LabTest labtest) {
		LabtestRepo.save(labtest);
		
	}

	//get labtest by id
	@Override
	public Optional <LabTest> getLabTest(int id) {
		
		return LabtestRepo.findById(id);
	}

	//delete labtest
	@Override
	public void deleteLabTest(int id) {
		LabtestRepo.deleteById(id);
		
	}

	@Override
	public List<LabTest> getLabTestByLabTestName(String name) {
		
		return (List<LabTest>) LabtestRepo.findByLabtestName(name);
	}

	
}

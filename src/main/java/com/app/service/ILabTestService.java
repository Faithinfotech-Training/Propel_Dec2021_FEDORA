package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.entity.LabTest;


public interface ILabTestService {
	//list
		public List<LabTest > getLabTest();
		
		//insert/update
		public void saveLabTest(LabTest labtest);
		
		//search by id
		public Optional <LabTest> getLabTest(int id);
		
		//delete
		public void deleteLabTest(int id);
		
		//find by LabtestName--Custom methods
		public List<LabTest> getLabTestByLabTestName(String name);
		
		//get all labtest using viewModel--InnerJoin
		


}

package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entity.TestPrescribed;

public interface ITestPrescribedService {
	
	//List
		public List<TestPrescribed> getLabTestPrescribeds();
		//Insert/Update
		
		public void saveLabTestPrescribed(TestPrescribed labTestPrescribed);
		
		//Search By Id
		public Optional<TestPrescribed> getLabTestPrescribed(int id);
		
		//Delete
		public void deleteLabTestPrescribed(int id);


}

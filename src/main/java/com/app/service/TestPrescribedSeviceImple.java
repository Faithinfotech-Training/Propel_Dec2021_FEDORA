package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ITestPrescribedRepo;
import com.app.entity.TestPrescribed;

@Service
public class TestPrescribedSeviceImple implements ITestPrescribedService {
	@Autowired
	private ITestPrescribedRepo testRepo;

	@Override
	public List<TestPrescribed> getLabTestPrescribeds() {
		return (List<TestPrescribed>) testRepo.findAll();
	}

	@Override
	public void saveLabTestPrescribed(TestPrescribed labTestPrescribed) {
		testRepo.save(labTestPrescribed);
	}

	@Override
	public Optional<TestPrescribed> getLabTestPrescribed(int id) {
		return testRepo.findById(id);
	}

	@Override
	public void deleteLabTestPrescribed(int id) {
		testRepo.deleteById(id);
	}
}

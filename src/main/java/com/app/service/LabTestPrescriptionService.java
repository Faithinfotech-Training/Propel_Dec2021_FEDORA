package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILabTestPrescriptionRepository;
import com.app.dto.TestPrescriptionDTO;

@Service
public class LabTestPrescriptionService implements ILabTestPrescriptionService {

	@Autowired
	private ILabTestPrescriptionRepository labTestPrescriptionRepo;
	
	@Override
	public TestPrescriptionDTO getTestPrescriptionByPrescriptionId(Integer labtestprescribeId) {
	
		return labTestPrescriptionRepo.getTestPrescriptionByPrescriptionId(labtestprescribeId);
	}

}

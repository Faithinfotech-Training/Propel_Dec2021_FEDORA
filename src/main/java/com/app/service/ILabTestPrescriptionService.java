package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.dto.TestPrescriptionDTO;

public interface ILabTestPrescriptionService {
	
	public TestPrescriptionDTO getTestPrescriptionByPrescriptionId(Integer labtestprescribeId);

}

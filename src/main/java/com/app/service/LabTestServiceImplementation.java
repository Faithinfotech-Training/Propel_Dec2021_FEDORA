package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IAppointmentRepository;
import com.app.dao.ILabTestRepository;
import com.app.entity.Appointment;
import com.app.entity.LabTest;
@Service
public class LabTestServiceImplementation implements ILabTestService {
	
	@Autowired
	private ILabTestRepository labTestRepository ;

	
	public List<LabTest> getLabTests() {
		 
		return (List<LabTest>) labTestRepository.findAll();
	}
	
	//save labtest prescibed
	

}
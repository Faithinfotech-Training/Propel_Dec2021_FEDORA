package com.app.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILabTestPrescriptionRepository;
import com.app.dao.ITestBill;
import com.app.dto.LabBillDTO;
import com.app.entity.LabTest;
import com.app.entity.LabTestPrescribed;
import com.app.entity.LabtestBill;

/*

@Service
public class TestBillServiceImplementation implements ITestBillService {

	@Autowired
	private ITestBill testBillRepo;
	
	@Autowired
	private ILabTestPrescriptionRepository labTestPrescriptionRepo;
	LabBillDTO labBillDto = new LabBillDTO();
	
	@Override
	public Optional<LabBillDTO> getLabtestBill(Integer Id) {
		//get all tests amount
		try {
			Optional<LabBillDTO> labtestBillDto = testBillRepo.getLabtestBill(Id);  
			Double billAmount = Double.valueOf(0);
			for(LabTest labtest : labTestPrescriptionRepo.getTestPrescriptionByPrescriptionId(labtest.labtestprescribeId)) {
				billAmount += labtest.getPrice();
			}
			int billId, int appoinId, int patientId, String patiebtName, String testName, double price,
			double billAmount, LocalDate createdDate
			LabtestBill labTestBill = new LabtestBill();
			
			labTestBill.setAppoinId(labBillDto.getAppoinId());
			labTestBill.s
			labTestBill.setBillId(labBillDto.getBillId());
			labTestBill.
			}
			
		}
		return testBillRepo.getLabtestBill(Id);
		
	}

	/*@Override
	public LabtestBill getLabTestBillByAppointmtntId(int appoinId) {
		return testBillRepo.getLabTestBillByAppointmtntId(appoinId);
	}
*/
/*	@Override
	public LabtestBill saveTestBill(int appoinId) {
		//get all tests amount
		try {
			LabTestPrescribed labTestPrescribed =  labTestPrescriptionRepo.getTestPrescriptionByPrescriptionId(Id);
			Double billAmount = Double.valueOf(0);
			for(LabTest labTest : labTestPrescribed.getLabTest()) {
				billAmount += labTest.getPrice();
			}
			LabtestBill labtestBill =new LabtestBill();
			labtestBill.setAppointment(labTestPrescribed.getAppointment());
			labtestBill.setAppoinId(appoinId);
			labtestBill.setBillId(billId);
			labtestBill.setBillAmount(billAmount);
			labtestBill.setCreatedDate(LocalDate.now());
			return labtestBill;
			}catch(Exception e) {
				e.printStackTrace();
				return null;
		}	
	}*/

	/*	@Override
	public Optional<LabtestBill> getLabtestBill(Integer Id) {
		
		return (Optional<LabtestBill>) testBillRepo.getLabtestBill(Id);
		}
}
	*/

	

	


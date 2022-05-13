package com.app.service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IMedicineRepository;
import com.app.entity.MedicineBill;

@Service
public class MedicineBillServiceImpl implements IMedicineBillService {
	
	@Autowired
	private   IMedicineRepository MedicineRepo;


	@Override
	public List<MedicineBill> getTestBill() {
		 
		return  null; //testBillRepo.findAll();
	}

	@Override
	public MedicineBill saveMedicineBill(int consultationId, int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<MedicineBill> getTestBill(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disableMedicineBill(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public byte[] generatePdf(int consultationId) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}

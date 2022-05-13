package com.app.service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import com.app.entity.MedicineBill;

public interface IMedicineBillService {

	//list
	public List<MedicineBill>getTestBill();
	
	//Insert/Update
	public MedicineBill saveMedicineBill(int consultationId, int userId);
	
			
	//Search By Id
    public Optional <MedicineBill> getTestBill(int id);
		   
    //Disable
    public void disableMedicineBill(int id);
    
    //Test Bill pdf
	public byte[] generatePdf(int consultationId) throws FileNotFoundException ;
}

package com.app.service;
import java.util.List;

import com.app.dto.MedicinePrescribedDTO;
import com.app.entity.MedicinePrescribed;

public interface IMedicinePrescribedService {

	//save
			public void saveMedicinePrescribed(MedicinePrescribed medicinePrescribed);
			
			
			//Find all lab test prescriptions by Id
			public List<MedicinePrescribedDTO>  getAllMedicinePrescribedByPatientId(int id);
			
			//find all
			public List<MedicinePrescribed>findAllMedPresc();
}

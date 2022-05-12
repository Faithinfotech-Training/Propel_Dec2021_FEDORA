package com.app.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dto.LabTestPrescribedtDTO;
import com.app.entity.LabTestPrescribed;


@Repository
public interface ILabTestPrescribedRepository extends CrudRepository<LabTestPrescribed, Integer> {

	
	/*
	
	@Query("SELECT new com.faith.app.dto.LabTestPrescribedtDTO (l.createdDate, l.labtestprescribeId, p.patientId,"
			+ "p.fullName, t.testCode, t.testName)"
			+ "FROM LabTestPrescribed l "
			+ "INNER JOIN l.labTest t" 
			+ "INNER JOIN l.appointment a" 
			+ "INNER JOIN a.patient p" 
			+ "WHERE p.patientId =?1")
	*/
	@Query("SELECT new com.app.dto.LabTestPrescribedtDTO (a.patientId, p.fullName,t.testCode, t.testName,"
			+ "l.createdDate, l.labtestprescribeId)"
			+ "FROM LabTestPrescribed l "
			+ "INNER JOIN l.labTest t " 
			+ "INNER JOIN l.appointment a " 
			+ "INNER JOIN a.patient p " 
			+ "WHERE p.patientId =:id")
	public List<LabTestPrescribedtDTO> getAllDTOLabTestPrescriptionsByPatientId(int id);
	
	
	//public  void deleteLabTestPrescribedByPatientId(int id);
	
	
}

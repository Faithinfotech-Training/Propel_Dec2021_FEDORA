package com.app.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dto.LabBillDTO;
import com.app.dto.PatientAppointmentDTO;
import com.app.entity.LabtestBill;

@Repository
public interface ITestBill extends CrudRepository<LabtestBill, Integer> {
	
	/*
	@Query(" SELECT new com.app.dto.LabBillDTO (t.billId, a.appoinId, p.patientId, p.fullName, l.testName, l.price, t.billAmount , t.createdDate) FROM LabtestBill t "
			+ " INNER JOIN t.appointment a "
			+ " INNER JOIN a.patient p "
			+ " INNER JOIN a.labTestsPrescribed tp"
			+ " INNER JOIN tp.labTest l "
			+ " WHERE t.billId=?1 ")
	public Optional<LabBillDTO> getLabtestBill(Integer Id);
	/*
	@Query("SELECT t FROM LabtestBill t WHERE t.appointment.appoinId=?1")
	public List <LabtestBill> getLabTestBillByAppointmtntId(Integer appoinId);
	
	
	@Query("SELECT new com.app.dto.PatientAppointmentDTO(a.appoinId,a.patientId,p.fullName) FROM Appointment a "
			+ "INNER JOIN a.patient p ")
	public List<PatientAppointmentDTO> getPatientNamePatientIDAppointment();
	*/
}

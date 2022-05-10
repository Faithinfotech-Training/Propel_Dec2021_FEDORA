package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dto.PatientAppointmentDTO;
import com.app.dto.PatientBillDTO;
import com.app.entity.Appointment;

@Repository
public interface IAppointmentRepository extends CrudRepository<Appointment, Integer> {
	
	@Query("SELECT new com.app.dto.PatientAppointmentDTO(a.appointment_id, p.patient_id, p.patient_reg_no, p.patient_name) "
			+ "FROM Patient p INNER JOIN p.appointment a ORDER BY a.appointment_id")	
	public List <PatientAppointmentDTO> findAllDTOAppoinment ();
	
	
	@Query("SELECT new com.app.dto.PatientBillDTO(a.appointment_id, p.patient_id, p.patient_reg_no, p.patient_name) "
			+ "FROM Patient p INNER JOIN p.appointment a ORDER BY a.appointment_id")	
	public List <PatientBillDTO> findAllDTOBill ();
	
	/*
	 @Query("SELECT new  com.app.dto.PatientAppointmentDTO(a.appointment_id, "
			+ "p.patient_id, p.patient_reg_no, p.patient_name, s.staff_name) "
			+ "FROM Patient p INNER JOIN appointment a on p.patient_id=a.patient_id "
			+ "INNER JOIN Staff s on a.doc_id=s.staff_id"
			+ " ORDER BY a.appointment_id")	
	public List <PatientAppointmentDTO> findAllDTOAppoinment ();
	
	
	@Query("SELECT new  com.app.dto.PatientBillDTO(a.appointment_id, "
			+ "p.patient_id, p.patient_reg_no, p.patient_name,"
			+ "d.consultancy_fee, a.appointment_date) "
			+ "FROM Patient p INNER JOIN appointment a on p.patient_id=a.patient_id "
			+ "INNER JOIN Doctor d on a.doc_id=d.doc_id")	
	public List <PatientBillDTO> findAllDTOBill ();
	 */
	
}


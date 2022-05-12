package com.app.dao;


import java.util.Date;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dto.PatientAppointmentDTO;
import com.app.dto.PatientBillDTO;


import com.app.dto.AppointmentDTO;

import com.app.entity.Appointment;

@Repository
public interface IAppointmentRepository extends CrudRepository<Appointment, Integer> {


	
	
	
	 @Query("SELECT new com.app.dto.PatientAppointmentDTO (a.appoinId, a.doa, p.patientId, p.fullName, p.gender, p.bloodGroup, a.tokenNum, sp.specialization, s.fullName) "
				+ "FROM Appointment a "
				+ "INNER JOIN a.patient p " 
				+ "INNER JOIN a.doctor d " 
				+ "INNER JOIN d.staff s " 
				+ "INNER JOIN d.specialization sp " 
				+ "ORDER BY a.appoinId")
		public List <PatientAppointmentDTO> findAllDTOAppoinment ();
	
	@Query("SELECT new com.app.dto.PatientBillDTO(a.appoinId, p.patientId, p.fullName, s.fullName, d.consultationfee, sp.specialization, a.createdDate) "
			+ "FROM Appointment a "
			+ "INNER JOIN a.patient p " 
			+ "INNER JOIN a.doctor d " 
			+ "INNER JOIN d.staff s " 
			+ "INNER JOIN d.specialization sp " 
			+ "ORDER BY a.appoinId")
			
	public List <PatientBillDTO> findAllDTOBill ();
	
	/*
	 @Query("SELECT new com.app.dto.PatientAppointmentDTO(a.appoinId, a.doa, p.patientId, p.fullName, p.gender, p.bloodGroup, a.tokenNum, s.fullName) "
			+ "FROM com.app.entity.Patient p INNER JOIN com.app.entity.Appointment a on p.patientId=a.patientId "
			+ "INNER JOIN com.app.entity.Doctor d on a.docId=d.docId"
			+ "INNER JOIN com.app.entity.Staff s on d.staffId=s.staffId"
			+ "ORDER BY a.appoinId")	
	public List <PatientAppointmentDTO> findAllDTOAppoinment ();
	*/
	/*
	@Query("SELECT new com.app.dto.PatientBillDTO(a.appoinId, p.patientId, p.fullName, s.fullName, d.consultationfee, sp.specialization, a.createdDate) "
			+ "FROM com.app.entity.Patient p INNER JOIN com.app.entity.Appointment a on p.patient_id=a.patient_id "
			+ "INNER JOIN com.app.entity.Doctor d on a.docId=d.docId"
			+ "INNER JOIN com.app.entity.Staff s on d.staffId=s.staffId"
			+ "INNER JOIN com.app.entity.Specialization sp on d.specialiseId=sp.specialiseId"
			+ "ORDER BY a.appoinId")	
	public List <PatientBillDTO> findAllDTOBill ();
	*/
	
}


	
	//query
	/*@Query("SELECT new com.app.dto.AppointmentDTO(a.appoinId,a.patientId,"
			+ "a.docId,a.tokenNum,p.fullName,a.dao,a.createdDate)"+"FROM Appontment a INNER JOIN a.patient p ORDER BY a.appoinId")
	public List<AppointmentDTO>getAllDTOAppoint();*/

}


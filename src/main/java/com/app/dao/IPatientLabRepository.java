package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dto.PatientAppointmentDTO;
import com.app.entity.Patient;

@Repository
public interface IPatientLabRepository extends CrudRepository<Patient, Integer> {
	
	@Query("SELECT new com.app.dto.PatientAppointmentDTO(a.appoinId,a.patientId,p.fullName) FROM Appointment a "
			+ "INNER JOIN a.patient p ")
	public List<PatientAppointmentDTO> getPatientNamePatientIDAppointment();
	
	/*@Query("SELECT new com.app.dto.PatientAppointmentDTO(a.appoinId,a.patientId,p.fullName) FROM Appointment a "
			+ "INNER JOIN a.patient p WHERE patientId =:id")
	public Optional<PatientAppointmentDTO> getPatientNamePatientIDAppointmentId(int Id);*/
	
	
	
}

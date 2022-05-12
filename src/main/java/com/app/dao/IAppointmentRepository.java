package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dto.AppointmentDTO;
import com.app.entity.Appointment;

@Repository
public interface IAppointmentRepository extends CrudRepository<Appointment, Integer> {
	
	//query
	/*@Query("SELECT new com.app.dto.AppointmentDTO(a.appoinId,a.patientId,"
			+ "a.docId,a.tokenNum,p.fullName,a.dao,a.createdDate)"+"FROM Appontment a INNER JOIN a.patient p ORDER BY a.appoinId")
	public List<AppointmentDTO>getAllDTOAppoint();*/

}
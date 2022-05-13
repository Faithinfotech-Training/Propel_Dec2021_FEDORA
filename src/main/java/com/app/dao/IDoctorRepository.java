package com.app.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Doctor;
@Repository
public interface IDoctorRepository extends CrudRepository<Doctor, Integer> {
	
	 @Query("SELECT fullName FROM Staff WHERE staffId IN "
		 		+ "(SELECT staffId FROM Doctor WHERE docId IN "
		 		+ "(SELECT docId FROM Doctor WHERE specialiseId=?1)) ")
				public Optional <Doctor> getDoctorSpecializeList(Integer id);
	/*
	 @Query("SELECT s.fullName "
	 		+ "FROM Doctor d INNER JOIN Staff s ON d.staffId =s.staffId "  
			+ "INNER JOIN Specialization sp ON d.specialiseId=sp.specialiseId " 
			+ "WHERE specialiseId=?1 ")
		public Optional <Doctor> getDoctorSpecializeList(Integer id);
	*/
	/*
	 @Query("SELECT s.fullName "
	 		+ "FROM Doctor d INNER JOIN d.staff s "  
	 		+ "INNER JOIN d.specialization sp "  
	 		+ "WHERE specialiseId=?1 ")
		public Optional <Doctor> getDoctorSpecializeList(Integer id);
	*/
	
	

		

}

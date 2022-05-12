package com.app.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Patient;

@Repository
public interface IPatientRepository extends CrudRepository<Patient, Integer> {

	//Custom Methods - JPQL
	@Modifying
	@Query ("SELECT p FROM Patient p WHERE is_active='y' ")
	public List <Patient> listActivePatients ();
	
	@Transactional
	@Modifying
	@Query ("UPDATE Patient SET is_active='n' WHERE patient_id=?1")
	public void disablePatient (int id);
}


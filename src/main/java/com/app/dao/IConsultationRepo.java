package com.app.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Consultation;
@Repository
public interface IConsultationRepo extends CrudRepository <Consultation, Integer> {

	//disable consultation
	@Query("UPDATE Consultation set is_active=0 WHERE con_id=?1")
	public Consultation disableCon(int id);
}

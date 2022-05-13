package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Medicine;

@Repository
public interface IMedicineRepository extends CrudRepository<Medicine, Integer> {
	
	
	 //custom methods
		@Query("FROM Medicine WHERE medicine_name LIKE %?1%")
		public List<Medicine> findByMedicineName(String name);

}

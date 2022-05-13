package com.app.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.LabTest;


@Repository
public interface ILabTestRepository extends CrudRepository<LabTest, Integer> {

	@Query("FROM LabTest WHERE test_name LIKE %?1%")
	public List<LabTest> findByLabtestName(String name);

}
	



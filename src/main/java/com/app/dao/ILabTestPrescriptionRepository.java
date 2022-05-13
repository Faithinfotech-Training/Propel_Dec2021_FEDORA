package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dto.TestPrescriptionDTO;
import com.app.entity.LabTestPrescribed;


@Repository
public interface ILabTestPrescriptionRepository extends CrudRepository<LabTestPrescribed, Integer> {
	
	
	@Query("SELECT new com.app.dto.TestPrescriptionDTO (t.labtestprescribeId, l.labtestId ,l.testCode ,l.testName)FROM LabTestPrescribed t "
			+ "INNER JOIN t.labTest l WHERE t.labtestprescribeId=:labtestprescribeId")
	public TestPrescriptionDTO getTestPrescriptionByPrescriptionId(Integer labtestprescribeId);

}

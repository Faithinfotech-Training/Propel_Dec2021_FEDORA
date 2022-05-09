package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.TestPrescribed;

@Repository

public interface ITestPrescribedRepo extends CrudRepository <TestPrescribed, Integer>{

}

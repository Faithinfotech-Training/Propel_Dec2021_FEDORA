package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.LabTest;


@Repository
public interface ILabTestRepository extends CrudRepository<LabTest , Integer> {

}
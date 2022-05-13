package com.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.MedicineBill;

public interface IMedicineBillRepository extends CrudRepository<MedicineBill, Integer> {

}

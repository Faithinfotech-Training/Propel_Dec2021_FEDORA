package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Notes;
@Repository

public interface INotesRepo extends CrudRepository <Notes, Integer> {

}

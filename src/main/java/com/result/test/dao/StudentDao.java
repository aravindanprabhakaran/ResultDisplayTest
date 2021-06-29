package com.result.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.result.test.model.Student;

public interface StudentDao extends CrudRepository<Student, Long> {
	
}

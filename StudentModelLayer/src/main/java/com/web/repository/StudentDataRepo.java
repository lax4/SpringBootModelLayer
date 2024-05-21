package com.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Student;

@Repository
public interface StudentDataRepo extends CrudRepository<Student, Long>{

}

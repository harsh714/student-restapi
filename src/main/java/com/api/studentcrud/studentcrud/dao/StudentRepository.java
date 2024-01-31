package com.api.studentcrud.studentcrud.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.studentcrud.studentcrud.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{
    
}

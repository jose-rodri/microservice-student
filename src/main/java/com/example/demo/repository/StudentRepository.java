package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>  {

	
	
}

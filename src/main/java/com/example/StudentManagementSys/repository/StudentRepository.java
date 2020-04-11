package com.example.StudentManagementSys.repository;

import com.example.StudentManagementSys.entities.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Integer> {

}

package com.Aman.StudentsManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aman.StudentsManagementSystem.Entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	
}

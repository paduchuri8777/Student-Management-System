package com.kumarschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumarschool.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}

package com.kumarschool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kumarschool.entity.Student;
import com.kumarschool.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception{
		//Student student1 = new Student("Phani","Kumar","Kumar@gmail.com");
		//studentRepository.save(student1);
		
		//Student student2 = new Student("Rama","Krishna","Krishna@gmail.com");
		//studentRepository.save(student2);
		
		//Student student3 = new Student("Suresh","Kumar","Suresh@gmail.com");
		//studentRepository.save(student3);
	}
}

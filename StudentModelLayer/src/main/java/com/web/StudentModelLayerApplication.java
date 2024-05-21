package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.web.repository.StudentDataRepo;

@SpringBootApplication
public class StudentModelLayerApplication implements CommandLineRunner {
	
	@Autowired
	private StudentDataRepo studentDataRepo;
	public static void main(String[] args) {
		SpringApplication.run(StudentModelLayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//	Student stud = new Student(4,"lakshmi","java","morning","848598991");
//	//save detail//
//	studentDataRepo.save(stud);
		
		
//	Student oldData = studentDataRepo.findById((long) 1).get();
//		oldData.setBatch("afternoon");
//		studentDataRepo.save(oldData);
//		System.out.println("updated");
//		
		//delete record
		
//		studentDataRepo.deleteById((long)1);
//		
		//get one record
//		Student oneRecord = studentDataRepo.findById((long)1).get();
//		System.out.println("student :: +oneRecord");
//		
		
		//get All Record
		studentDataRepo.findAll().forEach(stud->{System.out.println(stud);});
	}

}

package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import com.web.repository.EmployeeRepo;

@SpringBootApplication
public class EmployeeModelLayer3Application implements CommandLineRunner{
	@Autowired
	private EmployeeRepo employeeRepo;
	

	public static void main(String[] args) {
		SpringApplication.run(EmployeeModelLayer3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//	Employee emp = new Employee(104,"Lakshmi",4,50000.0,"MicroSoft");
//		//save details//
//		employeeRepo.save(emp);
//		System.out.println("inserted");
//		
//		Employee oldData = employeeRepo.findById((long) 1).get();
//		oldData.setName("lucky");
//		employeeRepo.save(oldData);
//		System.out.println("updated");
		
		//delete record//
//		employeeRepo.deleteById((long)1);
//		System.out.println("deleted");
//		
		//get one record
//				Employee oneRecord = employeeRepo.findById((long)1).get();
//				System.out.println("employee :: +oneRecord");
//				
				//get All Record
				employeeRepo.findAll().forEach(emp->{System.out.println(emp);});
		
	}

}

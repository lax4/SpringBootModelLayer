package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import com.web.repository.MobileRepo;

@SpringBootApplication
public class MobileModelLayer1Application implements CommandLineRunner {
	@Autowired
	private MobileRepo mobileRepo;
	public static void main(String[] args) {
		SpringApplication.run(MobileModelLayer1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Mobile m =new Mobile(144,"VIVO","256GB","*06#","12inch");
//		//save details//
//		mobileRepo.save(m);
//		System.out.println("inserted");
		
//		Mobile oldData = mobileRepo.findById((long) 1).get();
//		oldData.setMobileName("SamSung");
//		mobileRepo.save(oldData);
//		System.out.println("updated");
//		
		//delete record
		
//		mobileRepo.deleteById((long)1);
//		System.out.println("deleted");
	
	//get one record
//		Mobile oneRecord = mobileRepo.findById((long)1).get();
//		System.out.println("mobile :: +oneRecord");
	
		
		//get All Record
	mobileRepo.findAll().forEach(m->{System.out.println(m);});
		
	}

}

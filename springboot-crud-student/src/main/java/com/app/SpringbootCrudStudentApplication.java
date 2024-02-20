package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.entity.Student;
import com.app.repo.StudentRepo;

@SpringBootApplication
public class SpringbootCrudStudentApplication implements CommandLineRunner{

	@Autowired
	private StudentRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudStudentApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student s1= new Student("Rahul","Hyderabad","RK22@gmail.com","2345678906","Thank You");
		Student s2= new Student("Pratik","Maharashtra","pr@gmail.com","467890989","Form Submitted");
		Student s3= new Student("Dipak","Madhya Pradesh","dp42@gmail.com","355654764","Form Submitted");
		
		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		
	}
	
	

}

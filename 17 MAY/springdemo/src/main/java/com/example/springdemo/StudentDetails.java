package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class StudentDetails {
	@Autowired
	private Student stud;
	
	
	
//using constructor	
//	public Student getStud() {
//		return stud;
//	}
//	
//	@Autowired
//	
//	public void setStud(Student stud) {
//		this.stud=stud;
//	}
//	
	void setdata() {
		stud.setId(150);
		stud.setName("sid");
//		
	}
//	
//	

	
	void showdata() {
		System.out.println(stud.getId());
		System.out.println(stud.getName());
	}

}

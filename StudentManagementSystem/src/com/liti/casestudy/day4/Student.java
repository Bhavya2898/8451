package com.liti.casestudy.day4;

import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private LocalDate dateOfBirth;
	
	public Student() {}
	
	
	public Student(int id,String name, LocalDate dateOfBirth) {
		
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		
	}
	
	


	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	
	public LocalDate getdateOfBirth() {
		return dateOfBirth;
	}
	
	
	public void setdateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	


}


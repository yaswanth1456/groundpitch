package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="CUSTOMER")
public class User {
	@Id
	
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
	int id;
	@Column(name="name")
String name;
	
	
	@Column(name="dob")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	String dob;
	
	
	
	@Column(name="age")
	String age;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}

}
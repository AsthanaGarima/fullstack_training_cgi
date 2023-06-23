package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student1")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int ID;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "entering_date")
	private String entering_date;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "code")
	private String code;
	
	

	




	public Student(int iD, String name, String entering_date, String nationality, String code) {
		super();
		ID = iD;
		this.name = name;
		this.entering_date = entering_date;
		this.nationality = nationality;
		this.code = code;
	}






	public Student(String name, String entering_date, String nationality, String code) {
		super();
		this.name = name;
		this.entering_date = entering_date;
		this.nationality = nationality;
		this.code = code;
	}






	public int getID() {
		return ID;
	}






	public void setID(int iD) {
		ID = iD;
	}






	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEntering_date() {
		return entering_date;
	}



	public void setEntering_date(String entering_date) {
		this.entering_date = entering_date;
	}



	public String getNationality() {
		return nationality;
	}



	public void setNationality(String nationality) {
		this.nationality = nationality;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}


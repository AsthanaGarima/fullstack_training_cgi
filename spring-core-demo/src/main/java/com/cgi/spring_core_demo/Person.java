package com.cgi.spring_core_demo;

public class Person {

	private int person_id;
	private String person_name;
	public Person() {
		super();
	}
	
	public Person(int person_id, String person_name) {
		this.person_id = person_id;
		this.person_name = person_name;
		
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", person_name=" + person_name + "]";
	}

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	
}

package org.example.customer.Model;

public class Customer {
	
	private String firstname;
	private String lastname;
	private String email;
	private String Country;
	public String getFirstname() {
		return firstname;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}

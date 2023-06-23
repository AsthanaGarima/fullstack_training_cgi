package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerDao {
	
	public List<Customer> getAllCustomers();
	public Customer createCustomer(Customer customer);
	public Customer findCustomer(int theId);
	public Customer updateCustomer(Customer customer);
}

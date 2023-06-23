package com.example.demo.Service;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee employee);
	Iterable<Employee> getAllemployees();

}

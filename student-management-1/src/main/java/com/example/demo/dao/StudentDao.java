package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentDao {
	
	public List<Student> getAllStudents();
	
	public Student createStudent(Student student);
	
	public Student updateStudent(int id, Student student);
//	
//	public Optional<Customer> getCustomer(int theId);
//
//	public void deleteCustomer(int theId);
	public Student findById(int id);

}

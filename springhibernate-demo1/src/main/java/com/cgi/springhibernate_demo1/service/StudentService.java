package com.cgi.springhibernate_demo1.service;

import java.util.List;

import com.cgi.springhibernate_demo1.model.Student;

public interface StudentService {
	
	public Student createStudents(Student student);
	public List<Student> getStudents();
	public Student getStudentsById(int id);
	public void updateStudentsById(int id, String firstname, String lastname, String email);
	public void deleteStudentsById(int id);
	public void deleteAllStudents();

}

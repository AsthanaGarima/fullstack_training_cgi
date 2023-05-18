package com.cgi.springhibernate_demo1.dao;

import java.util.List;

import com.cgi.springhibernate_demo1.model.Student;

public interface StudentDao {

	public Student createStudent(Student student);
	public List<Student> getStudent();
	public Student getStudentById(int id);
	public void updateStudentById(int id, String firstname, String lastname, String email);
	public void deleteById(int id);
	public void deleteAll();
}

package com.cgi.spring_hibernate_demo1.dao;

import java.util.List;

import com.cgi.spring_hibernate_demo1.model.Student;

public interface StudentDao {
	
	public Student createStudent(Student student);
	public List<Student> getAllStudent();
	public Student findById(int id);
	public Student updateStudentById(int id, Student student);
	public Student deleteById(int id);
	public void deleteAllStudent();

}

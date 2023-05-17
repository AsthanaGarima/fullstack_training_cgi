package com.cgi.spring_hibernate_demo1.service;

import java.util.List;

import com.cgi.spring_hibernate_demo1.model.Student;

public interface StudentService {
	
	public Student createStudents(Student student);
	public List<Student> getAllStudents();
	public Student findByIds(int id);
	public Student updateStudentByIds(int id, Student student);
	public Student deletedByIds(int id);
	public void deleteAllStudents();
}

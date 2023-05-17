package com.cgi.spring_hibernate_demo1.service;

import java.util.List;

import com.cgi.spring_hibernate_demo1.dao.StudentDao;
import com.cgi.spring_hibernate_demo1.dao.StudentDaoImpl;
import com.cgi.spring_hibernate_demo1.model.Student;

public class StudentServiceImpl implements StudentService{

	
	private StudentDao studentDao;
	{
		studentDao = new StudentDaoImpl();
	}
	
	
	public Student createStudents(Student student) {
		
		return studentDao.createStudent(student);
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}


	@Override
	public Student findByIds(int id) {
		// TODO Auto-generated method stub
		return studentDao.findById(id);
	}
	
	public Student updateStudentByIds(int id, Student student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudentById(id, student);
	}


	@Override
	public Student deletedByIds(int id) {
		// TODO Auto-generated method stub
		return studentDao.deleteById(id);
	}


	@Override
	public void deleteAllStudents() {
		// TODO Auto-generated method stub
		studentDao.deleteAllStudent();
	}


}

package com.cgi.springhibernate_demo1.service;

import java.util.List;

import com.cgi.springhibernate_demo1.dao.StudentDao;
import com.cgi.springhibernate_demo1.dao.StudentDaoImpl;
import com.cgi.springhibernate_demo1.model.Student;

public class StudentServiceImpl implements StudentService {
	
    private StudentDao studentDao;
    {
    	studentDao = new StudentDaoImpl();
    }
	
	public Student createStudents(Student student) {
		// TODO Auto-generated method stub
		return studentDao.createStudent(student);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDao.getStudent();
	}

	
	public Student getStudentsById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getStudentById(id);
	}

	
	public void updateStudentsById(int id, String firstname, String lastname, String email) {
		// TODO Auto-generated method stub
		studentDao.updateStudentById(id, firstname, lastname, email);
	}

	@Override
	public void deleteStudentsById(int id) {
		// TODO Auto-generated method stub
		studentDao.deleteById(id);
	}

	@Override
	public void deleteAllStudents() {
		// TODO Auto-generated method stub
		studentDao.deleteAll();
		
	}

}

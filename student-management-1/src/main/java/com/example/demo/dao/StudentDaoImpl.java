package com.example.demo.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Student;

@Repository
@EnableTransactionManagement
public class StudentDaoImpl implements StudentDao{
	
	
	private final SessionFactory sessionFactory;

	public StudentDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Student", Student.class);
		
		List<Student> students = query.getResultList();
		
		return students;
		
	}

	
	@Override
	@Transactional
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.save(student);
		return student;
	}

	@Override
	@Transactional
	public Student updateStudent(int id, Student student) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Student", Student.class);
		
		List<Student> students = query.getResultList();
		for (Student s: students) {
			if (s.getID()==id) {
				s.setName(student.getName());
				s.setNationality(student.getNationality());
				s.setEntering_date(student.getEntering_date());
				s.setCode(student.getCode());
			}
			session.save(s);
		}
		return null;
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		Student s_value = null;
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Student", Student.class);
		
		List<Student> students = query.getResultList();
		for (Student s: students) {
			if(s.getID()== id) {
				s_value = s;
				
			}
			else {
				s_value = null;
			}
		}
		return s_value;
		
	}

	
}

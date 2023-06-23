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

	
}

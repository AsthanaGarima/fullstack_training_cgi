package com.cgi.spring_hibernate_demo1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cgi.spring_hibernate_demo1.factory.MyFactory;
import com.cgi.spring_hibernate_demo1.model.Student;

public class StudentDaoImpl implements StudentDao{
	
	private Session session;
	{
		session = MyFactory.getSessionFactory().openSession();
	}
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		session.save(student);
		
		session.getTransaction().commit();
		return student;
	}
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		Query query = session.createQuery("FROM Student");
		List<Student> student= query.getResultList();
		for(Student s: student) {
			System.out.println(s);
		}
		session.getTransaction().commit();
		return student;
	}
	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
	session.getTransaction().begin();
	Student student = session.find(Student.class, id);
	if (student== null) {
		System.out.println("no such id");
	
	}
	else {
		System.out.println(student);
	}
	return student;
	}
	
	public Student updateStudentById(int id, Student student) {
		session.getTransaction().begin();
		Student s=session.get(Student.class, id);
		
		if(s==null)
		{
			System.out.println("no such id found: "+id);
		}
		else
		{
			
			s.setFirstname(student.getFirstname());
			s.setLastname(student.getLastname());
			s.setEmail(student.getEmail());
			session.merge(s);
			
			
			
			System.out.println("one item updated...");
		}
		session.getTransaction().commit();
		return s;
	}
	@Override
	public Student deleteById(int id) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		Student s=session.get(Student.class, id);
		
		if(s==null)
		{
			System.out.println("no such id found: "+id);
		}
		else
		{
			session.delete(s);
			
			
			
			System.out.println("one item deleted...");
		}
		session.getTransaction().commit();
		return s;
	}
	@Override
	public void deleteAllStudent() {
		session.getTransaction().begin();
		// TODO Auto-generated method stub
		Query query = session.createQuery("FRO"
				+ "M Student", Student.class);
		List<Student> student= query.getResultList();
		for(Student s: student) {
			session.delete(s);
		}
		session.getTransaction().commit();
		
	}

}

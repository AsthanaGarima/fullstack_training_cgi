package com.cgi.springhibernate_demo1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.cgi.springhibernate_demo1.config.SpringConfig;
import com.cgi.springhibernate_demo1.model.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
		
		private SessionFactory sessionFactory;
		

		@Autowired
		public StudentDaoImpl(SessionFactory sessionFactory) {
			super();
			this.sessionFactory = sessionFactory;
		}

    
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
	    session.save(student);
	    session.getTransaction().commit();
	    System.out.println("done...");
		return student ;
	}


	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("FROM Student");
		List<Student> student = query.getResultList();
		for(Student s: student) {
			System.out.println(s);
		}
		return student;

}


	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Student student = session.find(Student.class, id);
		if (student== null) {
			System.out.print("no such id found");
		}
		else {
			System.out.println(student);
		}
		return student;
	}


	@Override
	public void updateStudentById(int id, String firstname, String lastname, String email) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		
		Query query = session.createQuery("FROM Student");
		List<Student> student = query.getResultList();
		for(Student s: student) {
			System.out.println(s.getStudentId());
			System.out.println(id);
			if (s.getStudentId() == id ) {
				s.setFirstName(firstname);
				s.setLastName(lastname);
				s.setEmail(email);
				System.out.println("Record updated!!!");
				break;
			}
			else {
				System.out.println("id not found");
			}
		}
		session.getTransaction().commit();
		
	}


	@Override
	public void deleteById(int id) {
		Session session=sessionFactory.openSession();
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		Query query = session.createQuery("FROM Student");
		List<Student> student = query.getResultList();
		for(Student s: student) {
			System.out.println(s.getStudentId());
			System.out.println(id);
			if (s.getStudentId() == id ) {
				session.delete(s);
				System.out.println("Record deleted!!!");
				break;
			}
			else {
				System.out.println("id not found");
			}
		}
		session.getTransaction().commit();
		
	}


	@Override
	public void deleteAll() {
		Session session=sessionFactory.openSession();
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		Query query = session.createQuery("FROM Student");
		List<Student> student = query.getResultList();
		for(Student s: student) {
			
			
				session.delete(s);
				System.out.println("All Record deleted!!!");
				break;
			
		}
		session.getTransaction().commit();
	}
}

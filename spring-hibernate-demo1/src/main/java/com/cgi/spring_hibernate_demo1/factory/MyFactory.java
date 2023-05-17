package com.cgi.spring_hibernate_demo1.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cgi.spring_hibernate_demo1.model.Student;

public class MyFactory {

	private static SessionFactory sessionFactory= null;
	
	public static SessionFactory getSessionFactory() {
		
		sessionFactory  = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		return sessionFactory;
	}
}

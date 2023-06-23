package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;

@SpringBootApplication
public class StudentManagement1Application implements CommandLineRunner {
	private final SessionFactory sessionFactory;

	public StudentManagement1Application(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentManagement1Application.class, args);
	}
	
	public void run(String... args) throws Exception {
//		Session session=sessionFactory.openSession();
//		session.getTransaction().begin();
//		session.save(new Student("John", "25121993", "canadian", "j1"));
//		session.save(new Student("Marry", "25031995", "Indian", "m1"));
//		session.getTransaction().commit();
		
	}

}

package com.cgi.springhibernate_demo1;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cgi.springhibernate_demo1.config.SpringConfig;
import com.cgi.springhibernate_demo1.model.Student;
import com.cgi.springhibernate_demo1.service.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
      StudentServiceImpl studentserviceimpl = new StudentServiceImpl();
      System.out.println("Choose operations") ;
      System.out.println("1: create student");
      System.out.println("2: get student");
      System.out.println("3: get student by id");
      System.out.println("4: update student by id");
      System.out.println("5: delete student by id");
      System.out.println("6: delete all students");
      
      Integer option = scanner.nextInt();
      switch(option) {
      case 1:
    	  createStudent(studentserviceimpl);
    	  break;
      case 2:
    	  getAllStudent(studentserviceimpl);
    	  break;
      case 3:
    	  getAllStudentById(studentserviceimpl);
    	  break;
      case 4:
    	  updateAllStudentById(studentserviceimpl);
    	  break;
      case 5:
    	  deleteAllStudentById(studentserviceimpl);
    	  break;
      case 6:
    	  deleteAllStudent(studentserviceimpl);
    	  break;
      }
    }
    
    public static void createStudent(StudentServiceImpl studentserviceimpl) {
    	System.out.println("enter id") ;
    	Integer id = scanner.nextInt();
    	System.out.println("enter first name") ;
    	String firstname = scanner.next();
    	System.out.println("enter last name") ;
    	String lastname = scanner.next();
    	System.out.println("enter email") ;
    	String email = scanner.next();
    	
    	Student student = new Student(id, firstname, lastname, email);
        studentserviceimpl.createStudents(student);
    }
    
    public static void getAllStudent(StudentServiceImpl studentserviceimpl) {
    	studentserviceimpl.getStudents();
    }
    
    public static void getAllStudentById(StudentServiceImpl studentserviceimpl) {
    	System.out.println("enter id") ;
    	Integer id = scanner.nextInt();
    	studentserviceimpl.getStudentsById(id);
    }
    
    public static void updateAllStudentById(StudentServiceImpl studentserviceimpl) {
    	System.out.println("enter id") ;
    	Integer id = scanner.nextInt();
    	System.out.println("enter first name") ;
    	String firstname = scanner.next();
    	System.out.println("enter last name") ;
    	String lastname = scanner.next();
    	System.out.println("enter email") ;
    	String email = scanner.next();
    	studentserviceimpl.updateStudentsById(id, firstname, lastname, email);
    }
    
    public static void deleteAllStudentById(StudentServiceImpl studentserviceimpl) {
    	System.out.println("enter id") ;
    	Integer id = scanner.nextInt();
    	studentserviceimpl.deleteStudentsById(id);
    }
    
    public static void deleteAllStudent(StudentServiceImpl studentserviceimpl) {
    	studentserviceimpl.deleteAllStudents();
    }
}

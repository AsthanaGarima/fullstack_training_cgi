package com.cgi.springhibernate_demo1;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cgi.springhibernate_demo1.config.SpringConfig;
import com.cgi.springhibernate_demo1.dao.StudentDao;
import com.cgi.springhibernate_demo1.dao.StudentDaoImpl;
import com.cgi.springhibernate_demo1.model.Student;
import com.cgi.springhibernate_demo1.service.StudentService;
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
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	StudentDao studentService = context.getBean("studentDao", StudentDaoImpl.class);
    	
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
    	  createStudent(studentService);
    	  break;
      case 2:
    	  getAllStudent(studentService);
    	  break;
      case 3:
    	  getAllStudentById(studentService);
    	  break;
      case 4:
    	  updateAllStudentById(studentService);
    	  break;
      case 5:
    	  deleteAllStudentById(studentService);
    	  break;
      case 6:
    	  deleteAllStudent(studentService);
    	  break;
      }
    }
    
    public static void createStudent(StudentDao studentService) {
    	System.out.println("enter id") ;
    	Integer id = scanner.nextInt();
    	System.out.println("enter first name") ;
    	String firstname = scanner.next();
    	System.out.println("enter last name") ;
    	String lastname = scanner.next();
    	System.out.println("enter email") ;
    	String email = scanner.next();
    	
    	Student student = new Student(id, firstname, lastname, email);
    	studentService.createStudent(student);
    }
    
    public static void getAllStudent(StudentDao studentService) {
    	studentService.getStudent();
    }
    
    public static void getAllStudentById(StudentDao studentService) {
    	System.out.println("enter id") ;
    	Integer id = scanner.nextInt();
    	studentService.getStudentById(id);
    }
    
    public static void updateAllStudentById(StudentDao studentService) {
    	System.out.println("enter id") ;
    	Integer id = scanner.nextInt();
    	System.out.println("enter first name") ;
    	String firstname = scanner.next();
    	System.out.println("enter last name") ;
    	String lastname = scanner.next();
    	System.out.println("enter email") ;
    	String email = scanner.next();
    	studentService.updateStudentById(id, firstname, lastname, email);
    }
    
    public static void deleteAllStudentById(StudentDao studentService) {
    	System.out.println("enter id") ;
    	Integer id = scanner.nextInt();
    	studentService.deleteById(id);
    }
    
    public static void deleteAllStudent(StudentDao studentService) {
    	studentService.deleteAll();
    }
}

package com.cgi.spring_hibernate_demo1;

import java.util.Scanner;

import com.cgi.spring_hibernate_demo1.model.Student;
import com.cgi.spring_hibernate_demo1.service.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
       StudentServiceImpl studentServiceImpl= new StudentServiceImpl();
       
       System.out.println("Choose operation");
       System.out.println("1: create student");
       System.out.println("2: get all student");
       System.out.println("3: get student by id");
       System.out.println("4: update student by id");
       System.out.println("5: delete student by id");
       System.out.println("6: delete all students");
       Integer option = scanner.nextInt();
       
       switch(option){
       case 1:
    	   createStudent(studentServiceImpl);
    	   break;
       case 2: 
    	   getAllStudents(studentServiceImpl);
    	   break;
       case 3:
    	   findById(studentServiceImpl);
    	   break;
       case 4:
    	   updateStudentById(studentServiceImpl);
    	   break;
       case 5:
    	   deleteStudentById(studentServiceImpl);
    	   break;
       case 6:
    	   deleteAllStudents(studentServiceImpl);
    	   break;
       }
      
    }
    
    public static void createStudent(StudentServiceImpl studentServiceImpl) {
    	  Student student = new Student(300, "abc", "def", "abc.def@gmail.com");
          
          studentServiceImpl.createStudents(student);
          System.out.println("student created!");
    }
    
    
    public static void getAllStudents(StudentServiceImpl studentServiceImpl) {
    	studentServiceImpl.getAllStudents();
    }
    
    public static void findById(StudentServiceImpl studentServiceImpl) {
    	System.out.println("Student id");
    	Integer id = scanner.nextInt();
    	studentServiceImpl.findByIds(id);
    }
    public static void updateStudentById(StudentServiceImpl studentServiceImpl) {
    	System.out.println("Student id");
    	Integer id = scanner.nextInt();
    	System.out.println("enter new fields: firstname");
    	String firstname = scanner.next();
    	System.out.println("enter new fields: lastname");
    	String lastname = scanner.next();
    	System.out.println("enter new fields: email");
    	String email = scanner.next();
    	Student student = new Student(firstname, lastname, email);
    	studentServiceImpl.updateStudentByIds(id, student);
    }
    
    public static void deleteStudentById(StudentServiceImpl studentServiceImpl) {
    	System.out.println("Student id");
    	Integer id = scanner.nextInt();
    	studentServiceImpl.deletedByIds(id);
    }
    public static void deleteAllStudents(StudentServiceImpl studentServiceImpl) {
    	studentServiceImpl.deleteAllStudents();
    System.out.println("all record deleted!!!");
    }
    
    
}

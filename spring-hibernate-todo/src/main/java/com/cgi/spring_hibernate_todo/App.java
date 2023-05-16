package com.cgi.spring_hibernate_todo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.cgi.spring_hibernate_todo.model.Todo;


/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Todo.class).buildSessionFactory()
;    	Session session = factory.openSession();
		session.getTransaction().begin();
		System.out.println("give input");
        Integer option = scanner.nextInt();
        switch(option) {
        case 1:
        	createCustomer(session);
        	break;
        case 2:
        	getAllCustomer(session);
        	break;
        case 3:
        	getCustomerById(session);
        	break;
        
        }
    }
    
    public static void createCustomer(Session session) {
    	session.save(new Todo(100, "Work", true));
        System.out.println("todo created...");
        session.getTransaction().commit();
    }
    
    public static void getAllCustomer(Session session) {
    	  Query query=session.createQuery("FROM Todo");
          java.util.List<Todo> todo= query.getResultList();
          for(Todo c:todo)
          {
          	System.out.println(c);
          }
          
//          session.getTransaction().commit();
    }
    
    public static void getCustomerById(Session session) {
    	System.out.println("Todo id");
    	Integer id = scanner.nextInt();
    	Todo customer = session.find(Todo.class, id);
    	if (customer== null) {
    		System.out.println("no such id");
    	
    	}
    	else {
    		System.out.println(customer);
    	}
    	
        
        session.getTransaction().commit();
    }

}

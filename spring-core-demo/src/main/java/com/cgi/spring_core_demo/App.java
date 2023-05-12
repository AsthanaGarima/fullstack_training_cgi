package com.cgi.spring_core_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
//        Person p = context.getBean("person", Person.class);
//        System.out.print(p);
        Coach theCoach=context.getBean("coach",Coach.class);
        
        System.out.println(theCoach.getDailyWorkout());
    }
}

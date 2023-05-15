package com.cgi.spring_order_example;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.cgi.spring_order_example.config.SpringConfig;
import com.cgi.spring_order_example.dao.UserDao;
import com.cgi.spring_order_example.dao1.OrderDao;
import com.cgi.spring_order_example.model.Order;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args ) throws SQLException
    {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
         
         UserDao userDao = context.getBean("userDao", UserDao.class);
         
         for(int i=0; i<3; i++) {
         
         System.out.println("Enter username");
         String username = scanner.next();
         System.out.println("Enter password");
         String password = scanner.next();
         System.out.println("Here are the Options");
         System.out.println("1: get all orders");
         System.out.println("2: get orders by id");
         System.out.println("3: create order");
         System.out.println("4: get max order value");
         System.out.println("5: get min order value");
         System.out.println("6: update order by name");
         System.out.println("7: update order by price");
         System.out.println("8: delete order by id");
         System.out.println("9: delete all");
         System.out.println("choose option from above");
         Integer option = scanner.nextInt();
         
         
         
         Boolean userAuth = userDao.getDetails(username, password);
         System.out.println(userAuth);
         if (userAuth == true) {
        	 switch(option) {
        	
        	 case 1:
        		 getallorders();
        	 case 2:
//        	
        		 findOrderById();
//        		 
        	 case 3:
        		 createOrder();
        	 case 4:
        		 maxOrderByValue();
        	 case 5:
        		 minOrderByValue();
        	 case 6:
//        	
        		 updateOrderByName();
        	 case 7:
        		 updateOrderByPrice();
        	 case 8:
        		 deleteOrderById();
        	 case 9:
        		 deleteAll();
        	 }
        	 
        	 break;
         }
         
         else {
        	 System.out.println("User crendentials are wrong!!! Try Again");
         }
         }
         
         
         
         
    }
    
    public static void getallorders() {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	 OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
    	 List<Order> list = orderDao.getAllOrders();
    	 
    	 for(Order o: list) {
    		 System.out.println(o);
    	 }
    }
    
    public static void findOrderById() {
    	System.out.println("Enter order id");
        Integer id = scanner.nextInt();
    	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	 OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
    	 orderDao.findById(id);
    }
    
    public static void createOrder() {
    	 System.out.println("Enter order id");
         Integer id = scanner.nextInt();
         System.out.println("Enter order name");
         String name  = scanner.next();
         System.out.println("Enter order price");
         Integer price = scanner.nextInt();
    	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	 OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
    	 orderDao.createOrder(id, name, price);
    	 System.out.println("order created!!");
    }
    
    public static void maxOrderByValue() {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	 OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
    	 orderDao.maxOrderValue();
    	 
    }
    
    public static void minOrderByValue() {
   	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
   	 OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
   	 orderDao.minOrderValue();
   	 
   }
    
    public static void deleteOrderById() {
    	System.out.println("Enter order id");
        Integer id = scanner.nextInt();
      	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
      	 OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
      	 orderDao.deleteOrderById(id);
      	 System.out.println("record deleted");
      	 
      }
    
    public static void deleteAll() {
    	
      	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
      	 OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
      	 orderDao.deleteAll();
      	 System.out.println("record deleted");
      	 
      }
    public static void updateOrderByName() {
    	 System.out.println("Enter order name");
         String orderoldname  = scanner.next();
    	System.out.println("Enter order id");
        Integer orderid = scanner.nextInt();
        System.out.println("Enter order new name");
        String ordernewname  = scanner.next();
        System.out.println("Enter order price");
        Integer orderprice = scanner.nextInt();
      	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
      	 OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
      	 Integer id = orderDao.updateOrderByOrderName(orderid,ordernewname, orderprice, orderoldname);
      	 System.out.println("order with id "+id+"updated");
      	 
      }
    
    public static void updateOrderByPrice() {
   	 System.out.println("Enter order price");
        Integer orderoldprice  = scanner.nextInt();
   	System.out.println("Enter order id");
       Integer orderid = scanner.nextInt();
       System.out.println("Enter new order price");
       Integer ordernewprice  = scanner.nextInt();
       System.out.println("Enter order name");
       String ordername = scanner.next();
     	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
     	 OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
     	 Integer id = orderDao.updateOrderByOrderPrice(orderid, ordernewprice, ordername, orderoldprice);
     	 System.out.println("order with id "+id+"updated");
     	 
     }
    
}

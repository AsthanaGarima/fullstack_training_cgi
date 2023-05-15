package com.cgi.spring_order_example.dao1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.cgi.spring_order_example.model.Order;


@Component("orderDao")
public class OrderImplDao implements OrderDao{
	public final DataSource datasource;
	
	public OrderImplDao(DataSource datasource) {
		super();
		this.datasource = datasource;
	}
	
	@Override
	public List<Order> getAllOrders() {
		
		List <Order> list= new ArrayList<Order>();
		try {
			
			Connection conn = datasource.getConnection();
			Statement statement = conn.createStatement();
			ResultSet resultset = statement.executeQuery("select * from orders");
			
			while(resultset.next()) {
				System.out.println(resultset.getInt("orderid")+ " "+resultset.getString("ordername")+ " "+ resultset.getInt("orderprice"));
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void findById(int id) {
		try {
			
			Connection conn = datasource.getConnection();
			PreparedStatement statement = conn.prepareStatement("select * from user where username=?");
			statement.setInt(1, id);
			ResultSet resultset = statement.executeQuery();
			
			while(resultset.next()) {
				System.out.println(resultset.getInt("orderid")+ " "+resultset.getString("ordername")+ " "+ resultset.getInt("orderprice"));
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void createOrder(int id, String name, int price) {
		try {
			
			Connection conn = datasource.getConnection();
			PreparedStatement statement = conn.prepareStatement("Insert into orders values(?,?,?)");
			statement.setInt(1, id);
			statement.setString(2,name);
			statement.setInt(3, price);
			
			statement.executeUpdate();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		
	}

	@Override
	public void maxOrderValue() {
		try {
			
			Connection conn = datasource.getConnection();
			Statement statement = conn.createStatement();
			ResultSet resultset = statement.executeQuery("select MAX(orderprice) as maxVal from orders");
			if (resultset.next())
			{
			    int price = resultset.getInt("maxVal");
			    System.out.println(price);
			    // just return this int
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void minOrderValue() {
		try {
			
			Connection conn = datasource.getConnection();
			Statement statement = conn.createStatement();
			ResultSet resultset = statement.executeQuery("select min(orderprice) as minVal from orders");
			if (resultset.next())
			{
			    int price = resultset.getInt("minVal");
			    System.out.println(price);
			    // just return this int
			}
//			System.out.println(resultset);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteOrderById(int id) {
		try {
			
			Connection conn = datasource.getConnection();
			
			PreparedStatement statement = conn.prepareStatement("delete from orders where orderid= ?");
			statement.setInt(1, id);
			statement.executeUpdate();
		
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public int updateOrderByOrderName(int orderid, String ordernewname, int orderprice, String orderoldname) {
		PreparedStatement preparedStatement;
		try {
			Connection conn = datasource.getConnection();
			preparedStatement = conn.prepareStatement("update orders set orderid=(?),ordername = (?), orderprice=(?) where ordername=(?)");
		
			preparedStatement.setInt(1, orderid);
			preparedStatement.setString(2, ordernewname);
			preparedStatement.setInt(3, orderprice);
			preparedStatement.setString(4, orderoldname);
			preparedStatement.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return orderid;
		
	}

	@Override
	public int updateOrderByOrderPrice(int orderid, int ordernewprice, String ordername, int orderoldprice) {
		
		PreparedStatement preparedStatement;
		try {
			Connection conn = datasource.getConnection();
			preparedStatement = conn.prepareStatement("update orders set orderid=(?), ordername=(?), orderprice=(?)  where orderprice=(?)");
		
			preparedStatement.setInt(1, orderid);
			preparedStatement.setString(2, ordername);
			preparedStatement.setInt(3, ordernewprice);
			preparedStatement.setInt(4, orderoldprice);
			preparedStatement.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return orderid;
	}

	@Override
	public void deleteAll() {
try {
			
			Connection conn = datasource.getConnection();
			
			Statement statement = conn.createStatement();
			ResultSet resultset = statement.executeQuery("delete from orders");
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}

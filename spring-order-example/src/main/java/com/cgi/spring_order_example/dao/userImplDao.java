package com.cgi.spring_order_example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

@Component("userDao")
public class userImplDao implements UserDao {
	public final DataSource datasource;

	public userImplDao(DataSource datasource) {
		super();
		this.datasource = datasource;
	}

	
	public boolean getDetails(String username, String password) throws SQLException {
		
		boolean auth_user = false;
		Connection conn = datasource.getConnection();
//		Statement statement = conn.createStatement();
		PreparedStatement statement = conn.prepareStatement("select * from user where username=?");
		statement.setString(1, username);
		ResultSet resultset = statement.executeQuery();
		while(resultset.next()) {
			
			if (resultset.getString("passwords").equals(password)){
				System.out.println(resultset.getString("username"));
				System.out.println(resultset.getString("passwords"));
				auth_user=true;
			}
			else {
				auth_user= false;
			}
		}
		return auth_user;
		
		
	}

}

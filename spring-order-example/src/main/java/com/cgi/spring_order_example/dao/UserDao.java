package com.cgi.spring_order_example.dao;

import java.sql.SQLException;

public interface UserDao {

	public boolean getDetails(String username, String password) throws SQLException;
}

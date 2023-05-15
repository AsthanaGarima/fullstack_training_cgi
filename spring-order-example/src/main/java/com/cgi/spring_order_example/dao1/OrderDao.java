package com.cgi.spring_order_example.dao1;

import java.util.List;

import com.cgi.spring_order_example.model.Order;

public interface OrderDao {

	public List<Order> getAllOrders();
	public void findById(int id);
	public void createOrder(int id, String name, int price);
	public void maxOrderValue();
	public void minOrderValue();
	public void deleteOrderById(int id);
	public int updateOrderByOrderName(int orderid, String ordernewname, int orderprice, String orderoldname);
	public int updateOrderByOrderPrice(int orderid, int ordernewprice, String ordername, int orderoldprice);
	public void deleteAll();
}

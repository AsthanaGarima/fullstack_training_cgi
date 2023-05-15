package com.cgi.spring_order_example.model;

public class Order {
	
	private int orderid;
	private String ordername;
	private int orderprice;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public int getOrderprice() {
		return orderprice;
	}
	public void setOrderprice(int orderprice) {
		this.orderprice = orderprice;
	}
	public Order(int orderid, String ordername, int orderprice) {
		super();
		this.orderid = orderid;
		this.ordername = ordername;
		this.orderprice = orderprice;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", ordername=" + ordername + ", orderprice=" + orderprice + "]";
	}

}

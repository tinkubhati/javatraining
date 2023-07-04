package com.prodapt.kvaluet.assignment.daytwo.tables;

public class Orders {
	int id;
	String orderDate;
	String DeliveryDate;
	String status;
	int customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getDeliveryDate() {
		return DeliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	public int getCustomer() {
		return customer;
	}
	public void setCustomer(int customer) {
		this.customer = customer;
	}

	public Orders(int id, String orderDate, String deliveryDate, String status, int customer) {
		this.id = id;
		this.orderDate = orderDate;
		DeliveryDate = deliveryDate;
		this.status = status;
		this.customer = customer;
	}
	public Orders() {
	}
	
}
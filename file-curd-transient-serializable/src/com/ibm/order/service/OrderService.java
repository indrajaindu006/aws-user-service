package com.ibm.order.service;

import java.util.List;

import com.ibm.order.Order;

public interface OrderService {
	public Order createOrder(Order order);
	public List<Order> getAllOrders();
	

}

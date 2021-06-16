package com.ibm.order.service;

import java.util.ArrayList;
import java.util.List;

import com.ibm.order.Order;

public class OrderServiceImpl implements OrderService {
	private List<Order> list = null;
	{
		list = new ArrayList<Order>();
	}

	@Override
	public Order createOrder(Order order) {
		list.add(order);

		return order;
	}

	@Override
	public List<Order> getAllOrders() {
		return list;
	}

}

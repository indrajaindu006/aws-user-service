package com.ibm.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Date;
import java.util.List;

import com.ibm.order.Order;
import com.ibm.order.orderfactory.OrderFactory;
import com.ibm.order.service.OrderService;
import com.ibm.order.service.OrderServiceImpl;

public class Tester {

	private static final Date Date = null;

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException {
		InputStreamReader reader = null;
		BufferedReader bufferedReader = null;
		reader = new InputStreamReader(System.in);
		bufferedReader = new BufferedReader(reader);
		OrderService service = new OrderServiceImpl();
		OrderFactory orderFactory = new OrderFactory();

		int choice = 0;
		do {
			System.out.println(
					"1.Create new Order\n2.Display all orders from list\n3.Save all orders to file\n4.Display all orders from file\n4.Exit");
			System.out.println("Enter your choice");
			choice = Integer.parseInt(bufferedReader.readLine());
			switch (choice) {
			case 1:
				System.out.println("Enter order quantity");
				int quantity = Integer.parseInt(bufferedReader.readLine());
				System.out.println("Enter order by");
				String orderBy = bufferedReader.readLine();
				Order order = new Order();
				order.setOrderId(new Random().nextInt());
				order.setOrderBy(orderBy);
				order.setDate(new Date());
				order.setQuantity(quantity);

				Order o = service.createOrder(order);
				System.out.println("Order succesfully created" + o);

				break;
			case 2:
				List<Order> listOrders = service.getAllOrders();
				System.out.println("All orders from list ");
				for (Order order2 : listOrders) {
					System.out.println(order2);
				}
				break;
			case 3:
				List<Order> list = service.getAllOrders();
				System.out.println("Saving orders to file.......");
				orderFactory.saveOrders(list);
				break;
			case 4:
				List<Order> orderList = orderFactory.displayAllOrders();
				for (Order order2 : orderList) {
					System.out.println(order2);
				}

				break;
			case 5:
				System.out.println("Exit...");
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;
			}

		} while (choice != 0);

	}

}

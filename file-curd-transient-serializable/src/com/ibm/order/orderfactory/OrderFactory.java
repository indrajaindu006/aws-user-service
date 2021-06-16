package com.ibm.order.orderfactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.ibm.order.Order;

public class OrderFactory {

	private FileInputStream fileInputStream;
	private FileOutputStream fileOutputStream;
	private ObjectInputStream objectInputStream;
	private ObjectOutputStream objectOutputStream;
	private File file;
	{
		try {
			file = new File("order.ser");
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveOrders(List<Order> list) throws IOException {
		objectOutputStream.writeObject(list);
		System.out.println("Orders saved successfully into the file.");

	}

	public List<Order> displayAllOrders() throws IOException, ClassNotFoundException {
		fileInputStream = new FileInputStream(file);
		objectInputStream = new ObjectInputStream(fileInputStream);
		List<Order> order = (List<Order>) objectInputStream.readObject();
		return order;

	}

}

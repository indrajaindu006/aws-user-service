package com.ibm.App;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.ibm.order.Order;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("myfile.ser")));
		objectOutputStream.writeObject(new Order(10,new Date(),100,"indu"));

		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("myfile.ser")));

		Order order = (Order) objectInputStream.readObject();
		System.out.println(order);
		
		//Order(orderId=2, date=Wed Jun 16 17:12:09 IST 2021, quantity=10, orderBy=null, isCompleted=false)
		//Order(orderId=2, date=Wed Jun 16 17:13:16 IST 2021, quantity=10, orderBy=null, isCompleted=false)

	}

}

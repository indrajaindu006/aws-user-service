package com.ibm.app;

import com.ibm.Employee;

public class App {
	public static void main(String args[]) {
		Employee emp1 = new Employee(1, "Ram", "sri", "ram@gmail.com", 70000);
		Employee emp2 = new Employee(1, "roja", "sree", "sree@email.com", 70000);

		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));

	}
}

package com.ibm.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ibm.Employee;
import com.ibm.Manager;

public class EmployeeApp {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		EmployeeApp app = new EmployeeApp();

		Employee emp = null;

		Manager manager = new Manager();
		// This method throws null point exception
		// Because here we are passing employee obj we need to send Manager obj
		// "check(manager)" and then we need to pass the manager obj to the fun
		System.out.println("Handled null point exception\n*********");
		app.check(emp);
		// This method will execute
		System.out.println("Printed manager details\n*******");
		app.check(manager);

		// Here handled InputMismatch Exception
		try {
			System.out.println("Enter integer value ");
			int a = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Input mismatch");

		}

	}

	private void check(Employee emp) {

		try {

			if (emp instanceof Manager) {
				Manager manager = (Manager) emp;
				System.out.println("Manager " + manager.toString());
			} else {
				System.out.println("Employee " + emp.toString());
			}
			System.out.println("Handled Arithmetic Exception\n**********");
			int a = 100 / 0;

		} catch (NullPointerException e) {
			System.err.println("Null point exception");

		} catch (ArithmeticException e) {
			// System.err.println("Arithmetic Exception occured 100/0 is not posible");
			System.out.println(e.toString()); // o/p:java.lang.ArithmeticException: / by zero
			// e.printStackTrace();

		}
	}

}

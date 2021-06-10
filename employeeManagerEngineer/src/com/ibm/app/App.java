package com.ibm.app;

import java.util.Scanner;

import com.ibm.Employee;
import com.ibm.EmployeeType;
import com.ibm.Engineer;
import com.ibm.Manager;
//this is for without type out in syso
import static java.lang.System.out;

//this is for in scanner(system.in) 
import static java.lang.System.in;

//this is for enum calling directly by importing the static fun
import static com.ibm.EmployeeType.HOORLY_PAID;
import static com.ibm.EmployeeType.SALARIED;

import static java.lang.Math.PI;

//we can use directly base class variables
import static com.ibm.Employee.max;

public class App {

	// hetrogenous collection
	
	//this is for in scanner(system.in) 
	//import static java.lang.System.in;
	private static Scanner sc = new Scanner(in);
	
	private static Employee[] employees;
	static {
		//this is for without type out in syso
		//import static java.lang.System.out;

		out.println("Enter the length of the array");
		int len = sc.nextInt();
		employees = new Employee[len];
	}

	public static void main(String[] args) {
		//here we used base class variable without creating obj
		int a=max;
		System.out.println(a);
		
		System.out.println(PI);
		App ap = new App();
		int id;
		String fname;
		String lname;
		String email;
		String departName;
		String stream;
		
		EmployeeType employeetype;
		int choice;
		do {
			System.out.println("which person  details need to enter \n1.Employee\n2.Manager\n3.Engineer \n4.exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				for (int i = 0; i < employees.length; i++) {
					System.out.println("enter id");
					id = sc.nextInt();
					System.out.println("Enter first Name");
					fname = sc.next();
					System.out.println("Enter lastname");
					lname = sc.next();
					System.out.println("Enter email");
					email = sc.next();
					System.out.println("Enter employee type\n1.SALARIED\n2.HOORLY_PAID");
					int choose = sc.nextInt();
					if (choose == 1) {
						employeetype = SALARIED;
					} else
						employeetype = HOORLY_PAID;

					employees[i] = new Employee(id, fname, lname, email, employeetype);
				}
				for (Employee emp : employees) {
					System.out.println(emp);
				}
				break;

			case 2:
				for (int i = 0; i < employees.length; i++) {
					System.out.println("enter id");
					id = sc.nextInt();
					System.out.println("Enter first Name");
					fname = sc.next();
					System.out.println("Enter lastname");
					lname = sc.next();
					System.out.println("Enter email");
					email = sc.next();
					System.out.println("Enter department name");
					departName = sc.next();
					System.out.println("Enter employee type\n1.SALARIED\n2.HOORLY_PAID");
					int choose = sc.nextInt();
					if (choose == 1) {
						employeetype = SALARIED;
					} else
						employeetype = HOORLY_PAID;

					employees[i] = new Manager(id, lname, departName, email, employeetype, departName);
				}
				for (Employee emp : employees) {
					System.out.println(emp);
				}

				break;
				
			case 3:
				for (int i = 0; i < employees.length; i++) {
					System.out.println("enter id");
					id = sc.nextInt();
					System.out.println("Enter first Name");
					fname = sc.next();
					System.out.println("Enter lastname");
					lname = sc.next();
					System.out.println("Enter email");
					email = sc.next();
					System.out.println("Enter stream");
					stream = sc.next();
					System.out.println("Enter employee type\n1.SALARIED\n2.HOORLY_PAID");
					int choose = sc.nextInt();
					if (choose == 1) {
						employeetype = SALARIED;
					} else
						employeetype = HOORLY_PAID;

					employees[i] = new Engineer(id, fname, lname, email, employeetype, stream);
				}
				for (Employee emp : employees) {
					System.out.println(emp);
				}


				break;
			case 4:
				System.out.println("Exited the program");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid number");
				break;
			}
		} while (choice != 0);

	}
}

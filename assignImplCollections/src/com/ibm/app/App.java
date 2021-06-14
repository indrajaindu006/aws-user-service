package com.ibm.app;

import com.ibm.Employee;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class App {

	// Custom exception
	// User input
	// Add user input into Sets
	// used iterator
	// used compareTo (compare salary)

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		App app = new App();
		Set<Employee> employees = new TreeSet<Employee>();
		String stop_scan = "true";
		while (stop_scan.equals("true")) {
			Employee emp = new Employee();
			System.out.println("Enter employee name");
			emp.setEmpName(sc.next());

			double salary = 0;
			do {
				try {
					System.out.println("Enter salary ");
					salary = sc.nextDouble();
					app.check(salary);
					emp.setSalary(salary);
				} catch (Exception m) {
					System.err.println(m);
				}
			} while (salary != 0 && salary < 5000);
			emp.setEmpId(UUID.randomUUID().toString());
			employees.add(emp);

			System.out.println("Do you want to enter another employee(true/false)");
			stop_scan = sc.next();
		}

		Iterator<Employee> i = employees.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

	private void check(double salary) {
		if (salary < 5000) {
			throw new InvalidSalaryException("Salary must be above 5000");
		}

	}

}

package com.ibm.app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

import com.ibm.AgeComparator;
import com.ibm.Employee;
import com.ibm.EmployeeBO;
import com.ibm.SortByAge;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int emp_id = 1;
		List<Employee> list = new ArrayList<Employee>();

		boolean choice;
		do {
			Employee emp = new Employee();
			emp.setId(emp_id);
			System.out.println("Enter Employee name");
			emp.setName(sc.next());
			System.out.println("Enter department");
			emp.setDepartment(sc.next());
			System.out.println("Enter DOJ(dd-mm-yyyy)");

			Date dateOfJoining = new SimpleDateFormat("MM/dd/yyyy").parse(sc.nextLine());

			emp.setDateOfJoining(dateOfJoining);
			System.out.println("Enter salary");
			emp.setSalary(sc.nextInt());
			System.out.println("Enter age");
			emp.setAge(sc.nextInt());
			list.add(emp);
			System.out.println("Add employee details(true/false)");
			choice = sc.nextBoolean();
			emp_id++;
		} while (choice);

		int choice1;

		do {
			System.out.println("1.Sort employees by age and by date of joining\n2.Sort employees by salary");
			choice1 = sc.nextInt();

			switch (choice1) {
			case 1:

				Collections.sort(list);
				EmployeeBO.printEmployees(list);
				break;

			case 2:

				Collections.sort(list, new AgeComparator());
				EmployeeBO.printEmployees(list);

				break;

			}
		} while (choice1 != 0);

	}

}

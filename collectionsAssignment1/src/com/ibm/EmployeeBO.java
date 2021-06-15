package com.ibm;

import java.util.List;

public class EmployeeBO {

	public static void printEmployees(List<Employee> list) {
		System.out.format("%-15s %-30s %-30s %-20s %-10s %-10s\n", "Employee ID", "Name", "Department",
				"Date Of Joining", "Age", "Salary");
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}


}

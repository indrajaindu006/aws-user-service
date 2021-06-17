package com.ibm.app;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.ibm.dao.EmployeeDao;
import com.ibm.dao.EmployeeDaoImpl;
import com.ibm.employee.Employee;
import com.ibm.service.EmployeeService;
import com.ibm.service.EmployeeServiceImpl;

public class EmployeeApp {

	public static void main(String[] args) throws SQLException {

		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employee = employeeService.getAllEmployees();
		Iterator<Employee> iterator = employee.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}

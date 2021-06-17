package com.ibm.service;

import java.sql.SQLException;
import java.util.List;

import com.ibm.dao.EmployeeDao;
import com.ibm.dao.EmployeeDaoImpl;
import com.ibm.employee.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() throws SQLException {
		employeeDao = new EmployeeDaoImpl();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		return employeeDao.getAllEmployees();
	}

}

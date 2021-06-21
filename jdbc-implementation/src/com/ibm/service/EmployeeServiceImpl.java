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
	public Employee createEmployee(Employee employee) throws SQLException {
		return employeeDao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		return employeeDao.getAllEmployees();
	}

	@Override
	public List<Employee> findEmployeeId(int id) throws SQLException {
		
		return employeeDao.findEmployeeId(id);
	}

	@Override
	public Employee updateEmployee(int empId) throws SQLException {
		return employeeDao.updateEmployee(empId);
	}

	@Override
	public Employee deleteEmployee(int empId) throws SQLException {
		return employeeDao.deleteEmployee(empId);
	}
	
	

}

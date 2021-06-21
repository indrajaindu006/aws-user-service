package com.ibm.service;

import java.sql.SQLException;
import java.util.List;

import com.ibm.employee.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee)throws SQLException;

	public List<Employee> getAllEmployees() throws SQLException;

	public List<Employee> findEmployeeId(int id) throws SQLException;

	public Employee updateEmployee(int empId) throws SQLException;

	public Employee deleteEmployee(int empId) throws SQLException;

}

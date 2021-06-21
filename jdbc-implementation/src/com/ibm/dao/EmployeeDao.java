package com.ibm.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.ibm.employee.Employee;

public interface EmployeeDao {
	public Employee createEmployee(Employee employee) throws SQLException;

	public List<Employee> getAllEmployees() throws SQLException;

	public List<Employee> findEmployeeId(int id) throws SQLException;

	List<Employee> displayEmployeeFromFile(List<Employee> employee) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;

	public Employee updateEmployee(int empId) throws SQLException;

	public Employee deleteEmployee(int empId) throws SQLException;
}

package com.ibm.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibm.employee.Employee;

public interface EmployeeDao {
	public Employee createEmployee(Employee employee);

	public List<Employee> getAllEmployees() throws SQLException;
}

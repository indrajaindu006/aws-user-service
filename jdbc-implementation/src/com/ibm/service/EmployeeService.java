package com.ibm.service;

import java.sql.SQLException;
import java.util.List;

import com.ibm.employee.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee);

	public List<Employee> getAllEmployees() throws SQLException;

}

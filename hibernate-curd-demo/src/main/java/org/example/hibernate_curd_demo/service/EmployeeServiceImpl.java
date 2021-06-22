package org.example.hibernate_curd_demo.service;

import java.util.List;

import org.example.hibernate_curd_demo.dao.EmployeeDao;
import org.example.hibernate_curd_demo.dao.EmployeeDaoImpl;
import org.example.hibernate_curd_demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao = null;
	{
		employeeDao = new EmployeeDaoImpl();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeDao.createEmployee(employee);
	}

	@Override
	public List<Employee> displayAllEmployee() {
		return employeeDao.displayAllEmployee();
	}

	@Override
	public Employee getemployeeById(Integer id) {
		return employeeDao.getemployeeById(id);
	}

	@Override
	public Employee updateEmployee(Integer id) {
		return employeeDao.updateEmployee(id);
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeDao.deleteEmployee(id);
	}

}

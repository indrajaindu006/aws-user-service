package org.example.hibernate_curd_demo.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.example.hibernate_curd_demo.factory.MySessionFactory;
import org.example.hibernate_curd_demo.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Scanner sc = new Scanner(System.in);

	private MySessionFactory mySessionFactory;
	private SessionFactory sessionFactory;
	private Session session;

	{
		mySessionFactory = MySessionFactory.createMySessionFactory();
		sessionFactory = mySessionFactory.getSessionFactory();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(employee);
		session.getTransaction().commit();
		return employee;
	}

	@Override
	public List<Employee> displayAllEmployee() {
		session = sessionFactory.openSession();
		Query query = session.createQuery("select E from Employee E");
		return query.getResultList();
	}

	@Override
	public Employee getemployeeById(Integer id) {
		session = sessionFactory.openSession();
		return session.get(Employee.class, id);
	}

	@Override
	public Employee updateEmployee(Integer id) {
		session = sessionFactory.openSession();
		Employee tempEmp = session.get(Employee.class, id);
		if (tempEmp == null) {
			throw new EmployeeNotFoundException("Employee not found");
		}

		System.out.print("First Name: ");
		String firstName = sc.next();
		System.out.print("Last Name: ");
		String lastName = sc.next();
		System.out.print("Email: ");
		String gmail = sc.next();
		tempEmp.setFirstName(firstName);
		tempEmp.setLastName(lastName);
		tempEmp.setGmail(gmail);
		session.getTransaction().begin();
		session.merge(tempEmp);
		session.getTransaction().commit();

		return tempEmp;
	}

	@Override
	public void deleteEmployee(Integer id) {
		session = sessionFactory.openSession();
		Employee tempEmp = session.get(Employee.class, id);
		if (tempEmp == null) {
			throw new EmployeeNotFoundException("Employee not found");
		}
		session.getTransaction().begin();
		session.remove(tempEmp);
		session.getTransaction().commit();
		

	}

}

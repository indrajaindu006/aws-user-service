package com.example.spring_hibernate_java_based.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.spring_hibernate_java_based.dto.EmployeeDto;
import com.example.spring_hibernate_java_based.entity.Employee;
import com.example.spring_hibernate_java_based.ui.EmployeeResponseModel;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private static Scanner sc = new Scanner(System.in);

	private SessionFactory sessionFactory;

	private ModelMapper modelMapper;

	@Autowired
	public EmployeeDaoImpl(SessionFactory sessionFactory, ModelMapper modelMapper) {
		super();
		this.sessionFactory = sessionFactory;
		this.modelMapper = modelMapper;
	}

	@Override
	public EmployeeResponseModel createEmployee(EmployeeDto employeeDetails) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Employee employee = modelMapper.map(employeeDetails, Employee.class);
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.getTransaction().begin();
		currentSession.persist(employee);
		currentSession.getTransaction().commit();
		EmployeeResponseModel model = modelMapper.map(employee, EmployeeResponseModel.class);
		return model;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeResponseModel> displayAll() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		Session currentSession = sessionFactory.openSession();
		Query query = currentSession.createQuery("select E from Employee E");
		List<Employee> list = query.getResultList();
		Iterator<Employee> i = list.iterator();
		List<EmployeeResponseModel> list1 = new ArrayList<EmployeeResponseModel>();
		while (i.hasNext()) {
			list1.add(modelMapper.map(i.next(), EmployeeResponseModel.class));
		}
		return list1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public EmployeeResponseModel findByEmployeeId(String id) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Session currentSession = sessionFactory.openSession();
		Query query = currentSession.createQuery("select E from Employee E where E.employeeId=:empId")
				.setString("empId", id);
		List<Employee> list = query.getResultList();
		if (list.isEmpty()) {

			return null;
		} else {
			Iterator<Employee> i = list.iterator();
			List<EmployeeResponseModel> list1 = new ArrayList<EmployeeResponseModel>();
			while (i.hasNext()) {
				list1.add(modelMapper.map(i.next(), EmployeeResponseModel.class));
			}
			EmployeeResponseModel model = list1.get(0);
			return model;
		}
	}

	@Override
	public void updateById(String id) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Session currentSession = sessionFactory.openSession();
		Query query = currentSession.createQuery("select E from Employee E where E.employeeId=:empId")
				.setString("empId", id);
		List<Employee> list = query.getResultList();
		Employee emp = list.get(0);

		if (emp == null) {
			System.out.println("Employee not found");
		} else {
			System.out.println("Enter new employee first name");
			String nFirstname = sc.next();
			emp.setFirstName(nFirstname);
			System.out.println("Enter new employee last name");
			String nLastname = sc.next();
			emp.setLastName(nLastname);
			System.out.println("Enter new gmail");
			String gmail = sc.next();
			emp.setGmail(gmail);

			currentSession.getTransaction().begin();
			currentSession.merge(emp);
			currentSession.getTransaction().commit();
		}

	}

	@Override
	public void deleteById(String id) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Session currentSession = sessionFactory.openSession();
		Query query = currentSession.createQuery("select E from Employee E where E.employeeId=:empId")
				.setString("empId", id);
		List<Employee> list = query.getResultList();
		Employee emp = list.get(0);
		System.out.println(emp);
		currentSession.getTransaction().begin();
		currentSession.remove(emp);
		currentSession.getTransaction().commit();
	}

}

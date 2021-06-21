package com.ibm.dao;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.ibm.employee.Employee;
import com.ibm.exceptions.IdNotFoundException;
import com.ibm.factory.MyConnectionFactory;

public class EmployeeDaoImpl implements EmployeeDao {

	private List<Employee> list;
	private MyConnectionFactory myConnectionFactory;
	private Connection connection;
	PreparedStatement p = null;

	private static Scanner scanner = new Scanner(System.in);

	private File file;
	private FileOutputStream fileOutputStream;
	private ObjectOutputStream objectOutputStream;
	private FileInputStream fileInputStream;
	private ObjectInputStream objectInputStream;

	public EmployeeDaoImpl() throws SQLException {

		list = new ArrayList<Employee>();
		myConnectionFactory = MyConnectionFactory.createFactory();
		connection = myConnectionFactory.getMyConnection();
	}

	@Override
	public Employee createEmployee(Employee employee) throws SQLException {

		PreparedStatement preparedStatement = connection
				.prepareStatement("insert into employee(employee_id,first_name,last_name,gmail) values(?,?,?,?)");
		preparedStatement.setInt(1, employee.getEmployeeId());
		preparedStatement.setString(2, employee.getFirstName());
		preparedStatement.setString(3, employee.getLastName());
		preparedStatement.setString(4, employee.getGmail());
		int result = preparedStatement.executeUpdate();
		System.out.println(result + "rows added");
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {

		list = new ArrayList<Employee>();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from employee");

		while (resultSet.next()) {
			list.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4)));
		}

		return list;
	}

	@Override
	public List<Employee> findEmployeeId(int id) throws SQLException {
		list = new ArrayList<Employee>();
		String sql = "select * from employee where employee_id='" + id + "'";
		p = connection.prepareStatement(sql);

		ResultSet resultSet = p.executeQuery();
		while (resultSet.next()) {
			list.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4)));
		}

		return list;

	}

	@Override
	public List<Employee> displayEmployeeFromFile(List<Employee> employee)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		PreparedStatement preparedstatement = null;

		try {
			String read = null;
			BufferedReader in = new BufferedReader(new FileReader("jdbc.file"));
			while ((read = in.readLine()) != null) {
				String[] splited = read.split(",s+");
				String first_name = splited[0];
				String last_name = splited[1];
				String gmail = splited[2];
				addEmployee(connection, preparedstatement, first_name, last_name, gmail);
			}

		} catch (IOException e) {
			System.out.println("There was a problem: " + e);
		}
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException ignore) {
			}
		return employee;
	}

	public static void addEmployee(Connection connection, PreparedStatement preparedstatement, String first_name,
			String last_name, String gmail) throws SQLException {
		preparedstatement = connection
				.prepareStatement("insert into employee(first_name, last_name, gmail) values(?,?,?)");
		preparedstatement.setString(1, first_name);
		preparedstatement.setString(2, last_name);
		preparedstatement.setString(3, gmail);
		preparedstatement.executeUpdate();

	}

	@Override
	public Employee updateEmployee(int empId) throws SQLException {
		List<Employee> employees = findEmployeeId(empId);
		if (employees.isEmpty()) {
			throw new IdNotFoundException("Employee not found with id: " + empId);
		}

		System.out.println("Enter new first name: ");
		String firstName = scanner.next();
		String uFirstName = firstName.toUpperCase();
		System.out.println("Enter new last name: ");
		String lastName = scanner.next();
		String uLastName = lastName.toUpperCase();
		System.out.println("Enter new Gmail: ");
		String gmail = scanner.next();
		String lGmail = gmail.toLowerCase();

		PreparedStatement preparedStatement = connection
				.prepareStatement("update employee set first_name=?,last_name=?,gmail=? where employee_id=?");
		preparedStatement.setString(1, uFirstName);
		preparedStatement.setString(2, uLastName);
		preparedStatement.setString(3, lGmail);
		preparedStatement.setInt(4, empId);
		preparedStatement.executeUpdate();
		System.out.println("Successfully updated..");
		Employee employee = employees.get(0);
		employee.setFirstName(uFirstName);
		employee.setLastName(uLastName);
		employee.setGmail(lGmail);
		return employee;
	}

	@Override
	public Employee deleteEmployee(int empId) throws SQLException {
		List<Employee> employees = findEmployeeId(empId);

		Statement stmt = connection.createStatement();

		String sql = "delete from employee  where employee_id = '" + empId + "'";
		stmt.executeUpdate(sql);

		System.out.println("successfully deleted");

		return null;
	}

}

package com.ibm.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.ibm.dao.EmployeeDao;
import com.ibm.dao.EmployeeDaoImpl;
import com.ibm.employee.Employee;
import com.ibm.exceptions.IdNotFoundException;
import com.ibm.service.EmployeeService;
import com.ibm.service.EmployeeServiceImpl;

public class EmployeeApp {

	public static void main(String[] args) throws SQLException, IOException, NumberFormatException, ClassNotFoundException {
		EmployeeApp app = new EmployeeApp();

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		EmployeeService service = new EmployeeServiceImpl();
		int choice = 0;
		int empId;
		String firstName, lastName, email = null;
		String ufirstName, ulastName, lGmail = null;

		do {

			System.out.println("1. Create a new employee");
			System.out.println("2. Display all employees");
			System.out.println("3.Find by Employee Id");
			System.out.println("4.Read from a file and save to database");
			System.out.println("5.Update employee details by id");
			System.out.println("6.Delete employee details by id");
			System.out.println("7. exit");
			System.out.print("enter your choice: ");
			choice = Integer.parseInt(bufferedReader.readLine());

			switch (choice) {
			case 1:
				System.out.print("enter first name: ");
				firstName = bufferedReader.readLine();
				ufirstName=firstName.toUpperCase();
				System.out.print("enter last name");
				lastName = bufferedReader.readLine();
				ulastName=lastName.toUpperCase();
				System.out.print("enter email: ");
				email = bufferedReader.readLine();
				lGmail=email.toLowerCase();
				Employee employee = service
						.createEmployee(new Employee(new Random().nextInt(100), ufirstName, ulastName, lGmail));
				System.out.println(employee);
				break;
			case 2:
				List<Employee> employee1 = service.getAllEmployees();
				Iterator<Employee> iterator = employee1.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());

				}
				break;
			case 3:
				boolean found = false;
				System.out.println("Enter employee id");
				try {
					int id = Integer.parseInt(bufferedReader.readLine());

					List<Employee> list2 = service.findEmployeeId(id);

					for (Employee employee2 : list2) {
						System.out.println(employee2);
						found = true;
					}
					app.check(found);
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
			case 4:
				List<Employee> employee2 = service.getAllEmployees();
				EmployeeDao dao=new EmployeeDaoImpl();
				dao.displayEmployeeFromFile(employee2);
				
				
				break;
			case 5:
				System.out.print("Enter employee id: ");
				empId = Integer.parseInt(bufferedReader.readLine());
				employee=service.updateEmployee(empId);
				System.out.println("Updated Employee:\n"+employee);
				
				break;
			case 6:
			System.out.println("Enter employee id to delete");
			empId = Integer.parseInt(bufferedReader.readLine());
			employee=service.deleteEmployee(empId);
			break;
			case 7:
				System.out.println("Exit...");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice");
				break;

			}
		} while (choice != 0);

	}

	private void check(boolean found) {
		if (found == false) {
			throw new IdNotFoundException("Id not found exception");
		}

	}

}

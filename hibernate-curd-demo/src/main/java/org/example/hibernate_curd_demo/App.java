package org.example.hibernate_curd_demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.example.hibernate_curd_demo.dao.EmployeeNotFoundException;
import org.example.hibernate_curd_demo.model.Employee;
import org.example.hibernate_curd_demo.service.EmployeeService;
import org.example.hibernate_curd_demo.service.EmployeeServiceImpl;

public class App {
	private static Logger logger = Logger.getLogger("org.example.hibernate_crud_demo.App.class");

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");

		EmployeeService service = new EmployeeServiceImpl();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String firstName, lastName, gmail = null;
		int choice = 0;
	
		do {
			try {
				System.out.println("1. Create Employee.");
				System.out.println("2. Display All Employees");
				System.out.println("3. Find Employee By Id: ");
				System.out.println("4.Update Employee By Id ");
				System.out.println("5.Delete Employee By Id ");
				System.out.print("Enter Your Choice: ");
				choice = Integer.parseInt(bufferedReader.readLine());
				switch (choice) {
				case 1:
					System.out.print("Enter First Name: ");
					firstName = bufferedReader.readLine();
					System.out.print("Enter Last Name: ");
					lastName = bufferedReader.readLine();
					System.out.print("Enter gmail: ");
					gmail = bufferedReader.readLine();
					Employee employee = new Employee(new Random().nextInt(100), firstName, lastName, gmail);
					employee = service.createEmployee(employee);
					System.out.println("Created : " + employee);
					break;
				case 2:
					List<Employee> list = service.displayAllEmployee();
					Iterator<Employee> iterator = list.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					break;

				case 3:
					System.out.print("Enter id: ");
					int id = Integer.parseInt(bufferedReader.readLine());
					employee = service.getemployeeById(id);
					if (employee == null) {
						logger.info("No Such employee found.");
					} else {
						System.out.println("Employee found: " + employee);
					}

					break;
				case 4:
					try {
						System.out.println("Enter id");
						int id1 = Integer.parseInt(bufferedReader.readLine());
						employee = service.updateEmployee(id1);
						
						logger.info("Updated..");
						System.out.println(employee);
					} catch (EmployeeNotFoundException e) {

						System.err.println(e.getMessage());
					}
					break;
				case 5:
					try {
						System.out.println("Enter id");
						int id2 = Integer.parseInt(bufferedReader.readLine());
						service.deleteEmployee(id2);
						logger.info("Deleted..");
					} catch (EmployeeNotFoundException e) {
						System.err.println(e.getMessage());
					}

					break;
				case 6:
					System.out.println("Exit....");
					System.exit(0);
					break;
				default:
					System.out.println("invalid choice:");
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} while (choice != 0);

	}
}

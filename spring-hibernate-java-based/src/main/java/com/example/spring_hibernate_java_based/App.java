package com.example.spring_hibernate_java_based;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring_hibernate_java_based.config.ApplicationConfig;
import com.example.spring_hibernate_java_based.service.EmployeeService;
import com.example.spring_hibernate_java_based.ui.EmployeeRequestModel;
import com.example.spring_hibernate_java_based.ui.EmployeeResponseModel;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		String fName, lName, gmail, id = null;
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeService service = context.getBean("employeeServiceImpl", EmployeeService.class);

		do {
			System.out.println("1.Add new employee");
			System.out.println("2.Display all employees");
			System.out.println("3.Find by employee id");
			System.out.println("4.Update by employee id");
			System.out.println("5.Delete by employee id");
			System.out.println("6: Exit");
			System.out.print("Enter ur choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter employee first name");
				fName = sc.next();
				System.out.println("Enter employee last name");
				lName = sc.next();
				System.out.println("Enter gmail");
				gmail = sc.next();
				EmployeeResponseModel model = service.createEmployee(new EmployeeRequestModel(fName, lName, gmail));
				System.out.println(model);

				break;
			case 2:
				List<EmployeeResponseModel> list = service.displayAll();
				for (EmployeeResponseModel employeeResponseModel : list) {
					System.out.println(employeeResponseModel);
				}
				break;
			case 3:
				System.out.println("Enter employee id ");
				id = sc.next();
				EmployeeResponseModel model1 = service.findByEmployeeId(id);
				System.out.println(model1);
				break;
			case 4:
				System.out.println("Enter employee id ");
				id = sc.next();
				service.updateById(id);
				break;
			case 5:
				System.out.println("Enter employee id");
				id = sc.next();
				service.deleteById(id);
				break;
			default:
				break;
			}
		} while (choice != 0);

	}
}

package com.ibm;

import com.ibm.model.Employee;
import com.ibm.model.Engineer;
import com.ibm.model.Manager;
import com.ibm.model.Todo;

public class App {

	public static void main(String[] args) {
		/*App app=new App();
		Employee employee=new Manager("Ram", "sri", "ram@gmail.com", 50000, "CSE");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));
		employee=new Engineer("sita", "sreee", "sita@gmail.com", 23000, "ECE");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));*/
		
		
		//implementing todo
		Todo todo=new Todo();
		todo.createTodo("Compile", false);
		System.out.println(todo.toString());
		Todo todo1=new Todo();
		todo1.createTodo("Compile", false);
		System.out.println(todo1.toString());
		System.out.println(todo==todo1);
		System.out.println(todo.equals(todo1));
		
	}
	
	
	/*public double calculateTax(Employee employee)
	{
		double tax=0;
		if(employee instanceof Manager)
		{
			Manager manager=(Manager)employee;
			tax= (12.0/100)*manager.getSalary();
		}
		if(employee instanceof Engineer)
		{
			Engineer engineer=(Engineer)employee;
			
			tax=(11.9/100)*engineer.getSalary();
		}
		return tax;
	}*/


	}


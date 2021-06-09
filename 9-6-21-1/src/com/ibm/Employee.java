package com.ibm;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private int salary;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String firstName, String lastName, String email, int salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee=null;
		if(obj instanceof Employee)
		{
			employee=(Employee)obj;
		}
		if(this.salary==employee.salary)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	
}
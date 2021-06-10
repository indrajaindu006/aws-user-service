package com.ibm;

public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String gmail;
	private EmployeeType employeeType;
	
	//this is static method we can use in main method directly by importing pakage 
	public static int max=10;

	public Employee() {
		super();
	}
	public Employee(int employeeId, String firstName, String lastName, String gmail,EmployeeType employeeType) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gmail = gmail;
		this.employeeType=employeeType;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	public EmployeeType getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", gmail="
				+ gmail + ", employeeType=" + employeeType.getMessage() + "]";
	}
	
	
}

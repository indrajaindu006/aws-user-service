package com.ibm;

public class Employee implements Comparable {
	private String empId;
	private String empName;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		if (this.salary > ((Employee) o).salary)
			return -1;
		else if (this.salary < ((Employee) o).salary)
			return 1;
		return 0;

	}

}

package com.ibm;

public class Manager extends Employee {

	private String deptName;

	public Manager() {
		super();
	}

	public Manager(int id, String name, String deptName) {
		super(id, name);
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", toString()=" + super.toString() + "]";
	}

}

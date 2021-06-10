package com.ibm;

public abstract class Account extends Customer{
	
	protected int accountNumber;
	protected Customer cusObj;
	protected double balance;
	public Account() {
		super();
	}
	public Account(int accountNumber, Customer cusObj, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.cusObj = cusObj;
		this.balance = balance;
	}
	
	
	public abstract boolean withdraw(double amount);
	
}

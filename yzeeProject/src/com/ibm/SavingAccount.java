package com.ibm;

public class SavingAccount extends Account {

	// private int accountNumber;
	// private Customer cusObj;

	private double minBalance;


	public SavingAccount(int accountNumber, Customer cusObj, double balance, double minBalance) {
		super();
		this.accountNumber = accountNumber;
		this.cusObj = cusObj;
		this.balance = balance;
		this.minBalance = minBalance;
	}
	

	@Override
	public boolean withdraw(double amount) {
		if (this.balance > this.minBalance) {
			this.balance = this.balance - amount;
			return true;
		}
		return false;
	}

}

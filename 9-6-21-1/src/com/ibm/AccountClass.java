package com.ibm;

public class AccountClass {
	private String accountId;
	private Double balance;
	private String name;
	private AccountType accountType;
	public AccountClass() {
		super();
	}
	public void createAccount(String accountId, Double balance, String name, AccountType accountType) {
		
		this.accountId = accountId;
		this.balance = balance;
		this.name = name;
		this.accountType = accountType;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "AccountClass [accountId=" + accountId + ", balance=" + balance + ", name=" + name + ", accountType="
				+ accountType + "]";
	}
	
	
	

}

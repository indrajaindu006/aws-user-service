package com.ibm;

public class App {

	public static void main(String[] args) {
		
		AccountClass account=new AccountClass();
		//account.createAccount("qwqewe", 2399.0, "Raju", AccountType.SAVINGS);
		account.createAccount("abcde", 4000.0, "Rani", AccountType.CURRENT);
		if(account.getAccountType()==AccountType.SAVINGS) {
			CreateSavingsAccount savings=new CreateSavingsAccount();
			savings.CreateSavingsAccount();
		}
		
		if(account.getAccountType()==AccountType.CURRENT) {
		  CreateCurrentAccount current=new CreateCurrentAccount();
		  current.createCurrentAccount();
			
		}
		

	}

}

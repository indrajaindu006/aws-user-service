package com.ibm;

import java.util.Scanner;

public class App {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Customer cu = new Customer();
		// SavingAccount savings=new SavingAccount();

		/*
		 * Account ac=new Account(); int id; String name; String email; int choice; do {
		 * System.out.println("1.login to the bank\n2.Withdraw\n3.exit"); choice =
		 * sc.nextInt();
		 * 
		 * switch (choice) { case 1: for(int j=0;j<1;j++) {
		 * System.out.println("Enter cus id"); int i=sc.nextInt();
		 * System.out.println("enter name"); String n=sc.next();
		 * System.out.println("enter email"); String e=sc.next();
		 * System.out.println("Enter accountnumber"); int a=sc.nextInt();
		 * System.out.println("Enter balance"); double bal=sc.nextDouble();
		 * cu.setCusId(i); cu.setCusName(n); cu.setCusEmail(e); c[i]=new Customer(i, n,
		 * e); c[i]=new C }
		 * 
		 * 
		 * 
		 * 
		 * break;
		 * 
		 * 
		 * case 2: break; case 4: System.out.println("Exited the program");
		 * System.exit(0); break;
		 * 
		 * default: System.out.println("Invalid number"); break; } } while (choice !=
		 * 0);
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

		System.out.println("Enter cus id");
		cu.setCusId(sc.nextInt());
		System.out.println("enter name");
		cu.setCusName(sc.next());
		System.out.println("enter email");
		cu.setCusEmail(sc.next());
		System.out.println("Enter accountnumber");
		int acc_num = sc.nextInt();
		System.out.println("Enter balance");
		double balance = sc.nextDouble();
		SavingAccount sa = new SavingAccount(acc_num, cu, balance, 2000);
		System.out.println("Enter withdraw amount");
		int withdraw = sc.nextInt();
		boolean result = sa.withdraw(withdraw);
		if (result) {
			System.out.println("withdraw sucessfull.......\n Remaining balance " + sa.balance);
		}else {
			System.out.println("You don't have minimum balance");
		}

	}
}

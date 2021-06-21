package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.example.demo.dto.AccountDto;
import com.example.demo.model.Account;
import com.example.demo.model.AccountType;
import com.example.demo.model.Address;
import com.example.demo.model.City;
import com.example.demo.service.AccountService;
import com.example.demo.service.AccountServiceImpl;

public class App {
	public static void main(String[] args) throws IOException, SQLException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		AccountService service = new AccountServiceImpl();
		int choice = 0;

		do {

			System.out.println("1. Create a new employee");
			System.out.println("2. Display all Accounts");
			System.out.println("3.Withdraw");
			System.out.println("4.Deposit");

			System.out.println("5. exit");
			System.out.print("enter your choice: ");
			choice = Integer.parseInt(bufferedReader.readLine());

			switch (choice) {
			case 1:
				System.out.print("Enter Account type:\nSAVINGS\n" + "CURRENT\n" + "LOAN\n" + "CREDIT_CARD");
				String accountType = bufferedReader.readLine();

				AccountType at = AccountType.valueOf(accountType.toUpperCase());

				System.out.print("Enter Holder name");
				String holderName = bufferedReader.readLine();
				System.out.print("Enter Address1: ");
				String address1 = bufferedReader.readLine();
				System.out.print("Enter Address2: ");
				String address2 = bufferedReader.readLine();
				System.out.print("Enter city:\nMUMBAI\n" + "CHENNAI\n" + "KOLKATA\n" + "HYDERABAD");

				String city = bufferedReader.readLine();
				City c = City.valueOf(city.toUpperCase());
				Address address = new Address(address1, address2, c);
				System.out.println("Enter balance");

				String inputString = bufferedReader.readLine();

				double balance = Double.parseDouble(inputString);

				Account account = service
						.createAccount(new Account(UUID.randomUUID().toString(), at, holderName, address, balance));
				System.out.println(account);
				break;
			case 2:
				List<AccountDto> account1 = service.displayAllAccount();
				for (AccountDto accountDto : account1) {
					System.out.println(accountDto);
				}
				break;
			case 3:
				System.out.println("Enter Account id");
				String id = bufferedReader.readLine();
				System.out.println("Enter withdraw money ");
				String inputString1 = bufferedReader.readLine();
				double withdraw = Double.parseDouble(inputString1);
				service.withdrawl(id, withdraw);

				break;
			case 4:

				System.out.println("Enter Account id");
				String id1 = bufferedReader.readLine();
				System.out.println("Enter deposit money ");
				String inputString2 = bufferedReader.readLine();
				double deposit = Double.parseDouble(inputString2);
				service.deposite(id1, deposit);

				break;

			case 5:
				System.out.println("Exit...");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
				break;

			}
		} while (choice != 0);

	}
}

package com.example.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.AccountDto;
import com.example.demo.factory.MyConnectionFactory;
import com.example.demo.model.Account;

public class AccountDaoImpl implements AccountDao {

	private Connection connection;
	private List<AccountDto> list;
	private MyConnectionFactory myConnectionFactory;

	{
		list = new ArrayList<AccountDto>();
		try {
			myConnectionFactory = MyConnectionFactory.createFactory();
			connection = myConnectionFactory.getMyConnection();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public Account createAccount(Account account) throws SQLException {

		PreparedStatement preparedStatement = connection.prepareStatement("insert into account values(?,?,?,?,?,?,?)");
		preparedStatement.setString(1, account.getAccountId());
		preparedStatement.setString(2, account.getAccountType().getMessage());
		preparedStatement.setString(3, account.getHolderName());
		preparedStatement.setString(4, account.getAddress().getAddress1());
		preparedStatement.setString(5, account.getAddress().getAddress2());
		preparedStatement.setString(6, account.getAddress().getCity().getCity());
		preparedStatement.setDouble(7, account.getBalance());
		preparedStatement.executeUpdate();
		return account;
	}

	@Override
	public List<AccountDto> displayAllAccount() throws SQLException {

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from account");
		while (resultSet.next()) {

			list.add(new AccountDto(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getDouble(7)));
		}

		return list;
	}

	@Override
	public void withdrawl(String id, double amount) throws SQLException {

		for (AccountDto accountDto : list) {
			if (accountDto.getAccountId().equals(id)) {
				PreparedStatement preparedStatement = connection
						.prepareStatement("update account set balance=? where account_id='" + id + "'");
				double balance = accountDto.getBalance();
				if (balance > 2000) {
					System.out.println("main bal" + balance);
					double withdraw = balance - amount;
					System.out.println("Withdraw successfull..");
					System.out.println("Main balance After withdraw : " + withdraw);
					preparedStatement.setDouble(1, withdraw);
					preparedStatement.executeUpdate();

					accountDto.setBalance(withdraw);
				} else
					System.out.println("You doesn't have minimum balance" + balance);

			}

		}
	}

	@Override
	public void deposite(String id, double amount) throws SQLException {
		
		for (AccountDto accountDto : list) {
			if (accountDto.getAccountId().equals(id)) {
				PreparedStatement preparedStatement = connection
						.prepareStatement("update account set balance=? where account_id='" + id + "'");
				double balance = accountDto.getBalance();
				System.out.println("main bal" + balance);
				double deposit = balance +amount;
				System.out.println("Deposit successfull..");
				System.out.println("Main balance After deposit : " + deposit);
				preparedStatement.setDouble(1, deposit);
				preparedStatement.executeUpdate();

				accountDto.setBalance(deposit);

			}

		}

	}

}

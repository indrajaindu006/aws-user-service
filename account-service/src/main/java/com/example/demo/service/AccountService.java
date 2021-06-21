package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.dto.AccountDto;
import com.example.demo.model.Account;

public interface AccountService {
	

	public List<AccountDto> displayAllAccount() throws SQLException;


	public void withdrawl(String id,double amount) throws SQLException;

	public Account createAccount(Account account) throws SQLException;

	public void deposite(String id, double amount) throws SQLException;

	

}

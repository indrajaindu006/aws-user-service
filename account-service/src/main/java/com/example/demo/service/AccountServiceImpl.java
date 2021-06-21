package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.dao.AccountDao;
import com.example.demo.dao.AccountDaoImpl;
import com.example.demo.dto.AccountDto;
import com.example.demo.model.Account;

public class AccountServiceImpl implements AccountService {
	
	AccountDao accountDao=new AccountDaoImpl();

	@Override
	public List<AccountDto> displayAllAccount() throws SQLException {
		return accountDao.displayAllAccount();
	}

	@Override
	public void deposite(String id,double amount) throws SQLException {
		accountDao.deposite(id,amount);
	}

	@Override
	public void withdrawl(String id,double amount) throws SQLException {
		 accountDao.withdrawl(id, amount);
	}

	@Override
	public Account createAccount(Account account) throws SQLException {
		return accountDao.createAccount(account);
	}

}

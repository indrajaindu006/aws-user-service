package com.example.demo.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Account {
	
	private String accountId;
	private AccountType accountType;
	private String holderName;
	private Address address;
	private double balance;
	
}

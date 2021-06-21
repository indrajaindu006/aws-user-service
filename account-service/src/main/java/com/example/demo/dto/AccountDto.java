package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class AccountDto {
	
	private String accountId;
	private String accountType;
	private String holderName;
	private String address1;
	private String address2;
	private String city;
	private double balance;
	
	
	

}

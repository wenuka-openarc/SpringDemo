package com.demo.spring;

public class SavingsAccount implements Account {
	private String accountNumber ; 
	
	
	public SavingsAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountDetails() {
		return this.accountNumber ;
	}
	

}

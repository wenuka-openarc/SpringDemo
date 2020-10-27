package com.demo.spring;

public class Payment {

	Account account ;
	public Payment(Account account) {
		this.account = account ;
	}

	public void pay() {	
		System.out.println("payment processed for Account Number -- > " +  account.getAccountDetails()   );
	}
	
	
}

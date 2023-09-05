package com.ey.bank;

public interface Bank {

	int INIT_ACCOUNT_NO = 10101;

	double MIN_ACCOUNT_SAVINGS = 1000;

	double OPENING_CURRENT_BAL = 5000;
	double MINIMUM_CURRENT_BAL = 0;
	double OVERDRAFT_LIMIT = 10000;
 
	void summary();
 
	void deposit(double amount);

	void withdraw(double amount) throws BalanceException;
	
	void statement();
	
	
}

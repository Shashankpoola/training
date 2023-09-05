package com.ey.bank;

public class TestAccounts {

	public static void main(String[] args) {
		Bank c1 = AccountsFactory.createCurrentAccount("Sam");
//		c1.summary();

		Bank s1 = AccountsFactory.createSavingsAccount("Ben");
//		s1.summary();
		c1.deposit(10000);
		//s1.deposit(20000);
		try {
			
		//	s1.withdraw(200);
			c1.withdraw(200);
		} catch (BalanceException e) {
		//	e.printStackTrace();    // Developers: Troubleshoot the issues
		
			System.out.println(e); 	// Logging: To audit system Behaviour
		
		}
		s1.statement();
	}
}

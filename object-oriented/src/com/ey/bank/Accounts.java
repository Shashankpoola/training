package com.ey.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Accounts implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	protected List<Transaction> txns;
	private static int autogen = INIT_ACCOUNT_NO;

	public Accounts() {

	}

	public Accounts(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		txns = new ArrayList<Transaction>();
	}

	public void summary() {

		System.out.println("A/c No  " + acntNo);
		System.out.println("Holder  " + holder);
		System.out.println("Balance  " + balance);

	}

	public void deposit(double amount) {

		balance += amount;
		txns.add(new Transaction("Deposit", amount, balance));
	}
	
	public void withdraw(double amount) throws BalanceException {
		if(amount <= balance)
			balance -= amount;
		
		else
			System.out.println("Insufficient Balance!");
	} 

	@Override
	public void statement() {
		txns.forEach(System.out::println);
	}

}

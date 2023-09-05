package com.ey.bank;

import java.util.ArrayList;
import java.util.List;

public class Current extends Accounts {
	private double overdraft;
	private List<CurrentTransaction> ctxns;

	public Current() {
		//ctxns = new ArrayList<CurrentTransactions>();
	}
	
	public Current(String holder) {
		super(holder, OPENING_CURRENT_BAL);
		this.overdraft = OVERDRAFT_LIMIT;
	//	ctxns = new ArrayList<CurrentTransactions>();
	}

	

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public void deposit(double amount) {

		overdraft += amount;
		if (overdraft < OVERDRAFT_LIMIT) {

			balance += (overdraft - OVERDRAFT_LIMIT);
			overdraft = OVERDRAFT_LIMIT;
			ctxns.add(new CurrentTransaction("Deposit", amount, balance, overdraft));

		}
		
	}

	@Override
	public void withdraw(double amount) throws BalanceException {

		if (amount <= balance) {
			balance -= amount;
			ctxns.add(new CurrentTransaction("Withdrawl", amount, balance, overdraft));
		}
		else if (amount <= (balance + overdraft)) {
				overdraft += balance;
				balance = 0;
				ctxns.add(new CurrentTransaction("withdrawl", amount, balance, overdraft));
			}

			else
				throw new BalanceException("InSufficient Balance!");

		}

	

	@Override
	public void statement() {
		ctxns.forEach(System.out::println);
	}

}

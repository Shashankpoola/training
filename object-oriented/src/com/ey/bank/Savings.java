package com.ey.bank;

public class Savings extends Accounts {


	public Savings() {
		super();
		
		}

	public Savings(String holder) {
		super(holder, OPENING_CURRENT_BAL);
		
	}

	@Override

	public void withdraw(double amount) throws BalanceException {

		if (amount <= (balance - 1000)) {
			
			balance -= amount;
			txns.add(new Transaction("withdraw", amount, balance));	
		
		}
		else
			throw new BalanceException("Insufficient balance!");

	}
}
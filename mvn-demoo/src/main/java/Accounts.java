public class Accounts {

	private double balance;

	public Accounts(double balance) {
		this.balance = balance;
	}

	public double deposit(double amount) {
		
		if(amount < 0)
			throw new NumberFormatException("Negative Amount");
		balance += amount;
		return balance;	
		
	}

	public double withdraw(double amount) throws BalanceException{
		if(amount < 0)
			throw new NumberFormatException("Negative Amount");
		if(amount > balance )
			throw new BalanceException("Insufficient funds!");
		
		balance -= amount;
		return balance;
		
		
		
	}
	
	
	
	
	

}

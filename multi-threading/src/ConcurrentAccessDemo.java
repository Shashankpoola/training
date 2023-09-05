class BankAccount {
	private double balance = 5000.0;

	public synchronized void withdraw(double amount) {

		try {
			Thread.sleep(100);
			if (amount < balance) {
				
				
				Thread.sleep(1000);
			
				balance -= amount;
			
				

				System.out.println("Balance left " + balance);
			} else 
				System.out.println("Insuffiecient Balance");
			
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

}

class Transaction implements Runnable {

	BankAccount bankAccount;
	double amount;

	public Transaction(BankAccount bankAccount, double amount) {
		this.bankAccount = bankAccount;
		this.amount = amount;
	}

	@Override
	public void run() {

		bankAccount.withdraw(amount);
	}

}

public class ConcurrentAccessDemo {

	public static void main(String[] args) {
		
		
		BankAccount bankAccount = new BankAccount();
		
		Transaction t1 = new Transaction(bankAccount, 3000.0);

		Transaction t2 = new Transaction(bankAccount, 3000.0);
		 
		new Thread(t1).start();
		
		new Thread(t2).start();
	}

}


public class Customer {

	private int custId;
	private String custName;
	private double creditLimit;
   private static int counter =101;
	public Customer(String custName, double creditLimit) {
		super();
		this.custId = counter ++;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}

	public void details() {
		System.out.println("custName 	" + custName);
		System.out.println("custId 		" + custId);
		System.out.println("creditLimit 	" + creditLimit);
	}

	public double getCreditLimit() {
		return creditLimit;
	}

}

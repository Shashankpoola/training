import com.ey.bank.BalanceException;
import com.ey.bank.Bank;
import com.ey.bank.Current;

public class TestAccounts {

	public static void main(String[] args) throws Exception {

//		Accounts a1=new Accounts(101, "polo", 5000);
//		a1.summary();
//		
//		a1.deposit(1000);
//		a1.summary();
//		
//		a1.withdraw(3000);
//		a1.summary();
//		
//		a1.withdraw(4000);
		
		Bank c1= new Current("Sam");
		c1.summary();
//		
		c1.deposit(1000);
		c1.summary();
		
		c1.withdraw(3000);
		c1.summary();
		
		c1.withdraw(4000);
		
	}

}

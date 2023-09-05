import com.ey.bank.BalanceException;
import com.ey.bank.Savings;

public class TestSavings {

    public static void main(String[] args) throws BalanceException {

        Savings s1 = new Savings();

        s1.summary();

        

        s1.withdraw(1);

        

        s1.deposit(100);

        s1.summary();

    }

}
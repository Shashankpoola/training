import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccounts {
	private Accounts acnt;

	@BeforeEach
	public void init() {
		acnt = new Accounts(1000);
	}

	@Test
	public void testValidDeposit() {

		assertEquals(2000, acnt.deposit(1000));
	}
	
	@Test
	public void testNegativeDeposit() {
		
		assertThrows(NumberFormatException.class, () -> acnt.deposit(-100));		
	}
	
	@Test
	public void testValidWithdraw() throws BalanceException {

		assertEquals(500, acnt.withdraw(500));
	}

	@Test
	public void testNegativeWithdraw() {

		assertThrows(NumberFormatException.class, () -> acnt.withdraw(-100));
	}

	@Test
	public void testInvalidwithdraw() {

		assertThrows(BalanceException.class, () -> acnt.withdraw(2000));
	}
}

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestLifeCycle {

	private List<String> cart;

	@BeforeAll
	public static void setup() {
		System.out.println("setup before all testcases");
	}
	@AfterAll
	public static void teardown() {
		System.out.println("tear down after all test cases");
	}
	@BeforeEach
	public void setupEach() {
		cart  = new ArrayList<String>();
		cart.add("kiwi");
		System.out.println("setup before each test case");
	}
	@AfterEach
	public void teardownEach() {
		
		cart = null;
		System.out.println("tear down after each test case");
		
	}
	@Disabled
	@Test
	public void testEmptyCart() {
		
		System.out.println("Testing empty Cart");
		assertTrue(cart.isEmpty());
	}
	
	
	
	@Test
	public void testOneItem() {
		cart.add("apple");
		System.out.println("Testing cart with 1 item");
		assertEquals(1, cart.size());
		
	}
	
	
}

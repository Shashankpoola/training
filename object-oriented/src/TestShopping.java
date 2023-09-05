import com.ey.shop.CartException;
import com.ey.shop.Product;
import com.ey.shop.ShoppingCart;

public class TestShopping {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product p1 = new Product("iPhone X", 23000);
		try {
			cart.addToCart(p1);
		} catch (CartException e) {
			e.printStackTrace();
		}
		try {
			cart.addToCart(new Product("Airpods2", 11000));
		} catch (CartException e) {
			e.printStackTrace();
		}
		try {
			cart.addToCart(new Product("Apple Watch SE", 33000));
		} catch (CartException e) {
			e.printStackTrace();
		}
		try {
			cart.addToCart(new Product("Apple Air Tag", 5000));
		} catch (CartException e) {
		//	e.printStackTrace();  // avoid tech.terms to user
			System.out.println(e);
		}
		 cart.checkout(); //we are using array list to have unlimited cart, so we dont get exception
	}

}

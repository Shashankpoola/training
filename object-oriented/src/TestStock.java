import com.ey.stock.Broker;
import com.ey.stock.Exchange;
import com.ey.stock.Holder;
import com.ey.stock.Stock;
import com.ey.stock.StockSingleton;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// tisco = new Stock(); //single object

		Holder h = StockSingleton.getStock(); // reference
		h.viewQuote();

		Broker b = StockSingleton.getStock(); // reference
		b.viewQuote();
		b.getQuote();

		Exchange e = StockSingleton.getStock();
		e.viewQuote();
		e.getQuote();
		e.setQuote();

		System.out.println(h == b);
		System.out.println(b == e);
	}

}


public class TestCalculator {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.add(100);
		cal.sub(50);
		
		cal.result();
		
		cal.multiply(3);
		cal.divide(2);
		
		cal.result();
	}

}

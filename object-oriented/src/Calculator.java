
public class Calculator {

	
		private double total=0;
		
		public void add(double num)
		{
			total += num;
		}
		public void sub(double num)
		{
			
			total -= num;
		}
		public void multiply(double num)
		{
			total *= num;
		}
		public void divide(double num)
		{
			total /= num;
		}
		
		public void result()
		{
			
			System.out.println("result is " +total);
			
		}
		
	}


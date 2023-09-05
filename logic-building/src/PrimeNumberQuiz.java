import java.util.Scanner;

public class PrimeNumberQuiz {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = console.nextInt();
		System.out.println(checkPrime(num) ? "Primr no" : "composite no");		
		
	}

	private static boolean checkPrime(int num) {
		 for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
		
		return true;
	}
	
	
}

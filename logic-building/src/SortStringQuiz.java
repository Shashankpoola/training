import java.util.Scanner;

public class SortStringQuiz {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("enter a string");
		String word = console.next();

		System.out.println(sort(word));

	}

	private static String sort(String word) {

		char[] con = word.toCharArray();
		
		for (int i = 0; i < con.length; i++) {
			for(int j =0 ; j< con.length; j++)
			if (con[i] < con[j]) {
				
				char temp = con[i];
				con[i] = con[j];
				con[j] = temp;
			}

		}

		return new String(con);

	}

}

import java.util.Scanner;

public class checkPalindrome {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("enter a string");
		String word = console.next();

		System.out.println(checkPalindrome(word) ? "Palindrome" : "Not Palindrome");

	}

	private static boolean checkPalindrome(String word) {
		int start = 0;
		int end = word.length() - 1;

		while (start <= word.length() / 2) {

			if (word.charAt(start) != word.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}
}

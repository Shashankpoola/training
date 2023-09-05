
public class LinearSearch {

	public static void main(String[] args) {

		int[] ar = { 2, 13, 5, 9, 11, 22, 27, 15, 20 };
		int x = 11;
		for (int i = 0; i < ar.length; i++) {
			if (x == ar[i]) {
				System.out.println("Searched element is  " + ar[i]);
			}
		}

	}

}

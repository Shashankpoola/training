public class StatisticsQuiz {

	public static void main(String[] args) {

		int[] ar = { 3, 8, 2, 4, 5, 9, 7 };

		System.out.println("Sum: " + sum(ar));

		System.out.println("Sum: " + max(ar));

		System.out.println("Sum: " + min(ar));

		System.out.println("Sum: " + avg(ar));

	}

	private static int avg(int[] ar) {

		int sum = 0;

		for (int i : ar) {
			sum = sum + i;
		}
		return sum / ar.length;
	}

	private static int min(int[] ar) {

		int min = ar[0];
		for (int i : ar) { // for(int i=0 ; i< ar.length ; i++)
			if (i < min)
				min = i;
		}
		return min;
	}

	private static int max(int[] ar) {
		int max = 0;
		for (int i : ar) {
			if (i > max)
				max = i;
		}

		return max;

	}

	private static int sum(int[] ar) {
		int tot = 0;
		for (int i : ar) {
			tot = tot + i;
		}
		return tot;

	}

}
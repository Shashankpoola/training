public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = { 2, 5, 3, 1, 26, 99, 70 };
		int len = arr.length;
		bsort(arr, len);

	}

	private static void bsort(int[] arr, int len) {
		// TODO Auto-generated method stub

		for (int i = 0; i < len; i++) {
			
			for (int j =i+1; j < len - i - 1; j++) {
				
				if (arr[j] > arr[j+1]) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(arr[i]);
		}
	
	}
}

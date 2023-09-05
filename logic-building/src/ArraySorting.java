import java.util.*;

public class ArraySorting {

	public static void main(String[] args) {

		int[] ar = { 5, 3, 4, 1, 2 };

		for (int i : ar)
			System.out.print(i);
		System.out.println();
		System.out.println("\n" + "Sorted Array\n");
		long start = System.currentTimeMillis();
		Arrays.sort(ar);
		for (int i : ar)
			System.out.print(i);

		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println("time taken \t" + (end - start) + "ms");
//		for (int i : ar)
//			System.out.print(i);

		System.out.println("\n");

		start = System.currentTimeMillis();

		for (int i = 0; i <= ar.length - 1; i++) {
			for (int j = i + 1; j <= ar.length - 1; j++) {

				int temp = 0;
				if (ar[i] < ar[j]) {

					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		end = System.currentTimeMillis();
		System.out.println("time taken \t" + (end - start) + "ms");
		
		
		 int n = ar.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = ar[j];  
	            int i = j-1;  
	            while ( (i >=0) && ( ar [i] > key ) ) {  
	                ar [i+1] = ar [i];  
	                i--;  
	            } 
	            ar[i+1] = key;  
	          //  System.out.println(Arrays.toString(ar));
	            
	        }  
	        System.out.println(Arrays.toString(ar));
		
		
		

	}

}

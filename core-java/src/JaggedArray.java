
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int[][] jaggedArray = {{1, 2},{4, 5,6 },{6, 7, 8, 9}  };

		        for (int[] row : jaggedArray) {
		            for (int element : row) {
		                System.out.print(element + " 	");
		            }
		            System.out.println(); 
		        }
			
		}
		
	}



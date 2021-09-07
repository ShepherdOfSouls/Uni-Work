package lab5;

/**
 * Program initialises a 2D array with random values, prints it and then calculates the sum of all elements above the diagonal.
 */
public class AboveMainDiag {

	public static void main(String[] args) {
		final int N = 4;
		int[][] array = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = (int) (Math.random()*100) + 1;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The sum of the elements above the main diagonal is: " + sumAboveMainDiag(array));
		

	}
	
	/**
	 * Calculates the sum of elements in a 2D array that are above the diagonal, ie column number > row number.
	 * @param arr 2D array to be summed
	 * @return int sum of the elements above the diagonal
	 */
	public static int sumAboveMainDiag(int[][] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
		}
		
		return sum;
	}

}

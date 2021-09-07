package lab5;

/**
 * Takes an array of doubles, prints it with a separator and then calculates the alternating sum, eg {2, 6, 3, 1} = 2 - 6 + 3 - 1.
 */
public class AlternatingSum {

	public static void main(String[] args) {
		double[] data = {1.6, 4.2, 9.3, 16.0, 9.0, 7.4, 4.0, 9.0, 11.2};
		
		System.out.println("Array:");
		printArray(data);
		System.out.println("Alternating sum: " + alternatingSum(data));

	}
	
	/**
	 *Computes the alternating sum of the values in an array, e.g.
	 *if the array is {1 6 7 9}, the sum will be 1‐6+7‐9
	 *@param data ‐ an array
	 *@return the alternating sum of the values in data
	 */
	public static double alternatingSum(double[] data) {
		double sum = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			if (i % 2 == 0) {
				sum = sum + data[i];
			}
			else {
				sum = sum - data[i];
			}
		}
		
		return sum;
		
	}
	
	/**
	 *Prints the array elements using | as separator
	 *@param data ‐ an array
	 */
	public static void printArray(double[] data) {
		for (int i = 0; i < data.length; i++) {
			if (i < data.length - 1) {
				System.out.print(data[i] + " | ");
			}
			else {
				System.out.println(data[i]);
			}
		}
	}

}

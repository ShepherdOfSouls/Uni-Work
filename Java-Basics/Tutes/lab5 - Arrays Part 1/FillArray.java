package lab5;

import java.util.Scanner;

/**
 * Asks the user to fill a 2D array of doubles and then prints with formatting.
 */
public class FillArray {

	public static final int N = 2;
	public static final int M = 3;
	
	public static void main(String[] args) {
		double[][] ar = readPicture();
		printArray(ar);
	}
	
	/**
	 *Reads double values from the keyboard and fills in an N x M array
	 *@return the N x M array
	 */
	public static double[][] readPicture() {
		Scanner keyboard = new Scanner(System.in);
		double[][] ar = new double[N][M];
		
		System.out.println("Please enter 6 numbers:");
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				ar[i][j] = keyboard.nextDouble();
			}
		}
		keyboard.close();
		return ar;

	}
	
	/**
	 *Prints a 2D array of double values using %6.2f
	 *@param ar ‐ the array to print
	 */
	public static void printArray(double[][] ar) {
		System.out.println("The picture is:");
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.printf("%6.2f", ar[i][j]);
			}
			
			System.out.println();
		}
	}

}

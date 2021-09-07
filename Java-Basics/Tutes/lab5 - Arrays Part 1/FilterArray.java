package lab5;

import java.util.Scanner;
 /**
  * Program gets user to input values into a 2D array and then transforms values into either 1.0 or 0.0 based of whether
  * they are above or below the boundary value, which is the average of all original inputs multiplied by a factor.
  */
public class FilterArray {
		
	public static final int N = 2; //number of rows
	public static final int M = 3; //number of columns
	public static final double FACTOR = 0.8; //factor for multiplication	
		
	public static void main(String[] args) {		
	      double[][] picture = readPicture();
	      System.out.println("\nOld picture:");
	      printArray(picture);
	      double[][] newPicture = applyThreshold(picture, FACTOR);
	      System.out.println("\nNew picture:");
	      printArray(newPicture);							
	}
		
	 /**
	  *Reads double values from the keyboard and fills in a N x M array
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
	 *Takes a 2D array (pic) and a coefficient. Returns newPic ‐ a filtered version
	 *of pic, whose elements are either 0 or 1 depending on a threshold.
	 *Threshold = coefficient * average value of all elements in pic.
	 *The value of newPic will be 1, if the corresponding value in pic is above the
	 *threshold and 0 otherwise.
	 *Prints the message “The average is … etc”
	 *@param pic ‐ the original array (picture)
	 *@param coefficient ‐ the coefficient used to compute the threshold
	 *@return the new filtered picture
	 */
	public static double[][] applyThreshold(double[][] pic, double coefficient) {
		double[][] result = new double[N][M];
    	double sum = 0;
    	double amount = 0;
      
    	for(int i = 0; i < N; i++) {
   			for(int j = 0; j < M; j++) {
    			sum = sum + pic[i][j];
    			amount++;
			}
    	}
      
    	double average = sum/amount;
    	double threshold = coefficient*average;
    	System.out.println("The average is: " + average + "; anything below " + threshold + " will be 0; anything above will be 1");
      
    	for (int i = 0; i < N; i++) {
    		for(int j = 0; j < M; j++) {
    			if (pic[i][j] > threshold) {
    				result[i][j] = 1;
    			}
    		}
    	}
      
    	return result;
    }

	/**
	 *Prints a 2D array of double values using %.2f
	 *@param ar ‐ the array to print
	 */
	public static void printArray(double[][] ar) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.printf("%6.2f", ar[i][j]);
			}
			
			System.out.println("\n");
		}
	}
}

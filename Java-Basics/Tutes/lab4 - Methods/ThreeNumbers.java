package lab4;

import java.util.Scanner;

/**
* This program contains a method that takes 3 numbers from the user
* and prints the smallest and the average of those numbers.
* @author Caleb Barber
*/
public class ThreeNumbers {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		double x = keyboard.nextDouble();
		double y = keyboard.nextDouble();
		double z = keyboard.nextDouble();
		
		double smallestResult = smallest(x, y, z);
		double averageResult = average(x, y, z);
		
		System.out.println("The smallest number is: " + smallestResult);
		System.out.println("The average of the numbers is: " + averageResult);
		keyboard.close();

	}
	
	/**
	 * Method returns the smallest of 3 numbers
	 * @param x, @param y, @param z The three numbers to compare
	 * @return the smallest of the three parameters or 0 if none.
	 */
	public static double smallest(double x, double y, double z)
	{
		if (x < y && x < z)
		{
			return x;
		}
		else if (y < x && y < z)
		{
			return y;
		}
		else if (z < x && z < y)
		{
			return z;
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Calculates the average of three numbers
	 * @param x, @param y, @param z The numbers to compare
	 * @return the average of the parameters
	 */
	public static double average(double x, double y, double z)
	{
		double result = (x + y + z)/3.0;
		return result;
	}

}

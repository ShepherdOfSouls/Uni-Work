package lab3;

import java.util.Scanner;

/**
 * Sums the input numbers from the user and continues going until the user enters a negative number which flips the boolean sentinel.
 */
public class NonNegativeSumSentinelBoolean {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter nonnegative whole numbers and a negative number at the end to quit:");
		
		double sum = 0;
		
		boolean areMore = true; 
		
		while (areMore == true)
		{
			double next = keyboard.nextDouble();
			sum = sum + next ;
			if (next <= 0)
			{
				areMore = false;
			}
		}
		
		System.out.print("The sum of the numbers is " + sum);
		keyboard.close();	

	}

}

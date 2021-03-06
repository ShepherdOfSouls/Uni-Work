package lab3;

import java.util.Scanner;

/**
 * Sums the input numbers from the user and continues going until the user enters a negative number, the sentinel.
 */
public class NonNegativeSumSentinel {

	public static void main(String[] args) 
	{
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter nonnegative whole numbers and a negative number at the end to quit:");
	
	double sum = 0;
	
	double next = keyboard.nextDouble();
	
	while (next >= 0)
	{
		sum = sum + next ;
		next = keyboard.nextDouble();
	}
	
	System.out.print("The sum of the numbers is " + sum);
	keyboard.close();
	}

}

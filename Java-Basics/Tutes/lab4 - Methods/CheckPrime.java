package lab4;

import java.util.Scanner;

/**
* This program calculates whether a given number is prime using the trial division method.
* It whether n if a multiple of any numbers between 2 and sqrt(n).
* @author Caleb Barber
*/
public class CheckPrime {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = keyboard.nextInt();
		
		checkPrime(number);
		
		keyboard.close();
	}
	/**
	 * Checks if n is prime by testing numbers between 2 and sqrt(n) for being factors.
	 * @param n number to test
	 */
	public static void checkPrime (int n)
	{
		boolean prime = true;
		
		for (int i = 2; i <= Math.sqrt(n); i++)
		{
			if (n % i == 0)
			{
				prime = false;
			}
		}
		
		if (prime == true)
		{
			System.out.println("The number " + n + " is prime.");
		}
		if (prime == false)
		{
			System.out.println("The number " + n + " is not prime.");
		}
	}

}

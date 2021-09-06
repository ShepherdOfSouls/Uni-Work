package lab4;

import java.util.Scanner;

/**
* This program contains a method that prints all numbers in a range
* and whether each one is odd or even
* @author Caleb Barber
*/
public class EvenAndOddNumbers {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int firstNumber = keyboard.nextInt();
		int lastNumber = keyboard.nextInt();
		printNumbers (firstNumber, lastNumber);
		keyboard.close();

	}
	

	/**
	* Prints all numbers between the 2 given numbers (inclusive),
	* and whether they are odd or even
	*/
	public static void printNumbers(int low, int high)
	{
		if (low > high)
		{
			int holder = low;
			low = high;
			high = holder;
		}
		
		for (int i = low; i <= high; i++)
		{
			isEven (i);
		}
	}
	
	/** Prints if an integer number is even or odd
	* @param n number to test
	*/
	public static void isEven(int n)
	{
		if (n % 2 == 0)
			System.out.println(n + " is even");
		else
			System.out.println(n + " is odd");
	}

}

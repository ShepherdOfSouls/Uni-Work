package lab4;

import java.util.Scanner;


public class EvenAndOddNumbers {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int firstNumber = keyboard.nextInt();
		int lastNumber = keyboard.nextInt();
		printNumbers (firstNumber, lastNumber);

	}
	
	
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
	
	
	public static void isEven(int n)
	{
		if (n % 2 == 0)
			System.out.println(n + " is even");
		else
			System.out.println(n + " is odd");
	}

}

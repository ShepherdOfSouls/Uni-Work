package lab3;

import java.util.Scanner;

/**
 * Given two boundary numbers and a factor, the program checks whether any numbers in between the two boundaries are a multiple of the factor.
 */
public class Multiples {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int firstNum = keyboard.nextInt();
		
		System.out.println("Enter the second number:");
		int secondNum = keyboard.nextInt();
		
		System.out.println("Enter the factor:");
		int factor = keyboard.nextInt();
		
		if (firstNum > secondNum) //Swapping the numbers
		{
			int temp = firstNum;
			firstNum = secondNum;
			secondNum = temp;
		}
		
		boolean isMultiples = false;
		for (int i = firstNum; i <= secondNum; i++) //checks every number between the two numbers to see whether it is a factor
		{
			if (i % factor == 0)
			{
				System.out.print(i + " ");
				isMultiples = true;
			
			}
		}
		
		if (isMultiples == false)
		{
			System.out.println("There are no multiples in that range.");
		}
		
		keyboard.close();
	}

}

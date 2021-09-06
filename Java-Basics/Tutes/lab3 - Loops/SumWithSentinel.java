package lab3;

import java.util.Scanner;

public class SumWithSentinel {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		double sum = 0;
		
		System.out.println("Enter a number or type q to quit:");
		
		int numOfValues = 0;
		
		
		while (keyboard.hasNextDouble())
		{
			System.out.println("Enter a number or type q to quit:");
			
			double n = keyboard.nextDouble();
			
			sum = sum + n;
			
			numOfValues++;		
			
			
		}
		
		System.out.println("The total is " + sum);
		System.out.println("The number of values summed is " + numOfValues);
		keyboard.close();
		

	}

}

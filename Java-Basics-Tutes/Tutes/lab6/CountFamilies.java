package lab6;

import java.util.Scanner;

public class CountFamilies {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of families:");
		int famAmount = keyboard.nextInt();
		
		double[] incomeArray = new double[famAmount];
		
		System.out.println("Enter the monthly income for each of the families");
		for (int i = 0; i < famAmount; i++)
		{
			System.out.println("Income for family " + (i+1) + ":");
			incomeArray[i] = keyboard.nextDouble();
		}
		
		Double max = 0.0;
		for (int i = 0; i < famAmount; i++)
		{
			if (incomeArray[i] > max)
			{
				max = incomeArray[i];
			}
		}
		
		double threshold = max/10.0;
		System.out.println("\nThe maximum income is: " + max);
		System.out.println("10% of the maximum income is: " + threshold);
		System.out.println("\nDisplaying all families with income less than 10% of the maximum income:");
		
		int count = 0;
		
		for (int i = 0; i < famAmount; i++)
		{
			if (incomeArray[i] < threshold)
			{
				System.out.println("Family " + (i+1) + " had income " + incomeArray[i]);
				count++;
			}
		}
		
		System.out.println("Total number of families: " + count);

	}

}

package lab4;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

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

	}
	
	
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
	
	
	public static double average(double x, double y, double z)
	{
		double result = (x + y + z)/3.0;
		return result;
	}

}

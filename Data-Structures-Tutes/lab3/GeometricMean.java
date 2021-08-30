package lab3;

import java.util.Scanner;

public class GeometricMean {

	public static void main(String[] args) {
		System.out.println("Enter a letter or negative number to quit:");
		
		Scanner keyboard = new Scanner(System.in);
		
		double product = 1.0;
		double current;
		int count = 0;
		
		while (keyboard.hasNextDouble())
		{
			current = keyboard.nextDouble();
			if (current > 0)
			{
				product = product * current;
				count++;
			}
			else
			{
				break;
			}
			
			
		}
		
		
		System.out.println(Math.pow(product, 1.0/count));
		
		

	}

}

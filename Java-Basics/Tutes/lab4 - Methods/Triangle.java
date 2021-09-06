package lab4;

import java.util.Scanner;

/**
* This program takes a number n and creates a right aligned triangle counting down from n.
* @author Caleb Barber
*/

public class Triangle {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int a = keyboard.nextInt();
		
		printTriangle(a);
		
		int b = keyboard.nextInt();
		
		printTriangle(b);

		keyboard.close();

	}
	
	/**
	 * Prints out a right aligned triangle counting down from a number.
	 * Each row starts from the previous start - 1 and all columns contain the same number.
	 * @param n The start of the first row.
	 */
	public static void printTriangle(int n)
	{
		
		for (int i = n; i > 0; i--)
		{
			
			for (int j = n; j > 0; j--)
			{
				if (j > i)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(j + " ");
				}
			}
			
			System.out.println(" ");			
			
		}
	}

}
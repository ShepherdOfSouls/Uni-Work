package lab4;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int a = keyboard.nextInt();
		
		printTriangle(a);
		
		int b = keyboard.nextInt();
		
		printTriangle(b);

	}
	
	
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
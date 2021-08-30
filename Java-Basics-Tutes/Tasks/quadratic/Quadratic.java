package quadratic;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the coefficient (a) of x^2: ");
		int a = keyboard.nextInt();
		
		System.out.println("Enter the coefficient (b) of x: ");
		int b = keyboard.nextInt();
		
		System.out.println("Enter the constant (c):");
		int c = keyboard.nextInt();
		
		double descriminant = Math.pow(b, 2) - 4*a*c;
		double root1 = 0.0;
		double root2 = 0.0;
		
		if (a == 0)
		{
			System.out.println("The equation is not a quadratic!");
		}
		
		else if (descriminant < 0)
		{
			System.out.println("The roots of this equation are complex numbers.");
		}

		else if (descriminant == 0)
		{
			root1 = -b/(2.0*a);
			System.out.println("There is one root: " + root1);
		}
		
		else if (descriminant > 0)
		{
			root1 = (-b + Math.sqrt(descriminant))/(2.0*a);
			root2 = (-b - Math.sqrt(descriminant))/(2.0*a);
			System.out.println("There are two roots: " + root1 + " and " + root2);
		}
		
	}

}

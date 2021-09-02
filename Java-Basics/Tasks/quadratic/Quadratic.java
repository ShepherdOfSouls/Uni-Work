package quadratic;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//User input is collected to fill in the coefficients for the quadratic equation ax^2 + bx + c = 0. That the user inputs integers is assumed.
		System.out.println("Enter the coefficient (a) of x^2: ");
		int a = keyboard.nextInt();
		
		System.out.println("Enter the coefficient (b) of x: ");
		int b = keyboard.nextInt();
		
		System.out.println("Enter the constant (c):");
		int c = keyboard.nextInt();
		
		keyboard.close();

		//The discriminant is calculated and then used to determine the behaviour of the roots.
		//Depending on the results of the discriminant and a variable the correct root is calculated and a message delivered to the user.
		double discriminant = Math.pow(b, 2) - 4*a*c;
		
		if (a == 0) {
			System.out.println("The equation is not a quadratic!");
		} else if (discriminant < 0) {
			System.out.println("The roots of this equation are complex numbers. There are no roots on the cartesian plane");
		} else if (discriminant == 0) {
			double root1 = -b/(2.0*a);
			System.out.println("There is one root: " + root1);
		} else if (discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant))/(2.0*a);
			double root2 = (-b - Math.sqrt(discriminant))/(2.0*a);
			System.out.println("There are two roots: " + root1 + " and " + root2);
		}
		
	}

}

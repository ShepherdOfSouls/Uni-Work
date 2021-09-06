package lab2;

import java.util.Scanner;

/**
 * Converts Fahrenheit input to Celcius.
 */
public class FtoC {

	//Converts fahrenheit to celcius.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a temperature in degrees Fahrenheit (no decimals!):");
		
		int degreeF = input.nextInt();
		
		double degreeC = 5*(degreeF-32)/9.0;
		
		System.out.println(degreeF + " degrees Fahrenheit = " + degreeC + " degrees Celcius");

		input.close();
	}

}

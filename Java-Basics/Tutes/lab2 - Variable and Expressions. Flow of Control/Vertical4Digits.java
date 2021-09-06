package lab2;

import java.util.Scanner;

/**
 * Takes a 4 digit number and prints the digits vertically.
 */
public class Vertical4Digits 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type a 4 digit number and press enter");
		
		String number = input.nextLine();
		
		System.out.println(number.charAt(0));
		System.out.println(number.charAt(1));
		System.out.println(number.charAt(2));
		System.out.println(number.charAt(3));

		input.close();

	}

}

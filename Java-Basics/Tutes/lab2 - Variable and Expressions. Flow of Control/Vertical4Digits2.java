package lab2;
import java.util.Scanner;

/**
 * Takes a 4 digit number and prints its digits vertically using moduli to separate the digits.
 */
public class Vertical4Digits2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type a 4 digit number and press enter");
		
		int number = input.nextInt();
		
		System.out.println(number/1000);
		System.out.println((number/100)%10);
		System.out.println((number/10)%10);
		System.out.println(number%10);

		input.close();
	}

}
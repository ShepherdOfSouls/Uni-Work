package lab5;

import java.util.Scanner;

/**
 * Program that asks the user to input 10 values into an array and then reads them backwards back to the user.
 */
public class ReverseArray {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] numArray = new int[10];
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.println("Enter element " + (i + 1) + ":");
			numArray[i] = keyboard.nextInt();
		}
		
		System.out.print("The entered numbers in reverse order are:");
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(" " + numArray[(numArray.length - 1 - i)]);
		}

		keyboard.close();

	}

}

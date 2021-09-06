package lab2;

import java.util.Scanner;

/**
 * Uses user input to construct a sentence.
 */
public class SillySentence {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the name of a friend:");
		
		String friend = keyboard.nextLine();
		
		System.out.println("Enter your favourite colour:");
		
		String colour = keyboard.nextLine();
		
		System.out.println("Enter your favourite food:");
		
		String food = keyboard.nextLine();
		
		System.out.println("Enter your favourite animal:");
		
		String animal = keyboard.nextLine();
		
		System.out.println("I had a dream that " + friend + " ate a " + colour + " " + animal + " and said it tasted like " + food + "!");

		keyboard.close();

	}

}

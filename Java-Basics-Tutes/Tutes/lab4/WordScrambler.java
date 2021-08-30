package lab4;

import java.util.Scanner;

public class WordScrambler {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter words to scramble, one per line, or \"end\" to quit.");
		
		String words = keyboard.next();
		
		while (words.equals("end") == false)
		{
		System.out.println(scramble(words));
		
		words = keyboard.next();
		}
		
		System.out.println("Goodbye!");

	}
	
	public static String scramble(String word)
	{
		int length = word.length();
		
		if (length <= 3)
		{
			return word;
		}
		
		int pos1 = (int) ((Math.random()*(length - 3)) + 1) ;
		int pos2 = (int) ((Math.random()*(length - pos1 - 2)) + pos1 + 1);
		
		
		String result = word.substring(0, pos1) + word.charAt(pos2) + word.substring(pos1 + 1, pos2) + word.charAt(pos1) + word.substring(pos2 + 1);
		return result;
		
	}

}

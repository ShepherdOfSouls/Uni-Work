package lab4;

import java.util.Scanner;

/**
* This program counts how many words are in a sentence
* given by the user. Assumes words are separated by one space.
* @author Caleb Barber
*/
public class NumberOfWords {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = keyboard.nextLine();
		
		int wordNum = countWords(sentence);
		
		System.out.println("The number of words is " + wordNum);
		keyboard.close();

	}
	
	/**
	 * Counts the amount of words in a sentence. 
	 * Assumes words are separated by one space.
	 * @param str sentence to count
	 * @return the amount of words
	 */
	public static int countWords(String str)
	{
		int result = 1;
		String sentence = str.trim();
		for (int i = 0; i < sentence.length(); i++)
		{
			char letter = sentence.charAt(i);
			
			if (letter == ' ')
			{
				result++;
			}
		}
		
		return result;
	}

}

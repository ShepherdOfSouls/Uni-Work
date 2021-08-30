package lab4;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = keyboard.nextLine();
		
		int wordNum = countWords(sentence);
		
		System.out.println("The number of words is " + wordNum);

	}
	
	
	public static int countWords(String str)
	{
		int result = 1;
		
		for (int i = 0; i < str.length(); i++)
		{
			char letter = str.charAt(i);
			char space = ' ';
			
			if (letter == space)
			{
				result++;
			}
		}
		
		return result;
	}

}

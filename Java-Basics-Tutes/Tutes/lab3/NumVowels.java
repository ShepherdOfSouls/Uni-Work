package lab3;

import java.util.Scanner;

public class NumVowels {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a word with no spaces: ");
		
		String word = keyboard.next();
		int numVowels = 0;
		for (int i = 0; i < word.length(); i++)
		{
			
			char ch = word.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				numVowels++;
			}
		
		}
		
		System.out.println("Numbers of vowels: " + numVowels);
	}

}

package lab12;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class NumbersWithDelimiter {

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("numbers_with_commas.txt"));
		int sum = 0;
		
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			Scanner lineBreaker = new Scanner(line);
			lineBreaker.useDelimiter(",");
			while (lineBreaker.hasNext())
			{
				int currentNumber = lineBreaker.nextInt();
				System.out.print(currentNumber + "   ");
				sum = sum + currentNumber;
			}
		}
		
		in.close();
		
		System.out.println("\n Sum is: " + sum);

	}

}

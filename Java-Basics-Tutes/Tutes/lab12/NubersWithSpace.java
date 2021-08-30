package lab12;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class NubersWithSpace {

	public static void main(String[] args) throws FileNotFoundException
	{
		String fileName = "numbers_with_space.txt";
		File file = new File(fileName);
		Scanner in = new Scanner(file);
		int sum = 0;
		while (in.hasNextInt())
		{
			int number = in.nextInt();
			System.out.print(number + "   ");
			sum = sum + number;
		}
		in.close();
		
		System.out.println("\nSum is: " + sum);

	}

}

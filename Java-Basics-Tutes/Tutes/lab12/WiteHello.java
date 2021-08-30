package lab12;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WiteHello 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String outputFileName = "hello.txt";
		PrintWriter out = new PrintWriter(outputFileName);
		out.println("Hello, World!");
		out.close();
	
		File inputFile = new File(outputFileName);
		Scanner in = new Scanner(inputFile);
		
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			System.out.println(line);
		}
		in.close();
	}
}

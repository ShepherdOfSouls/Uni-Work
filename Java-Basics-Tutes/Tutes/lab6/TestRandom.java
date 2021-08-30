package lab6;

import java.util.Scanner;

public class TestRandom {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int[] counter = new int[10];
		
		System.out.println("How many random numbers do you want to generate?");
		int amount = keyboard.nextInt();
		
		for (int i = 1; i <= amount; i++)
		{
			int n = (int) (Math.random()*10);
			counter[n]++;
		}
		
		for (int i = 0; i < counter.length; i++)
		{
			System.out.println(i + " " + counter[i]);
		}
		

	}

}

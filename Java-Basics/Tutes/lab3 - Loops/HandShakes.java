package lab3;

import java.util.Scanner;

public class HandShakes {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many people attended the party?");
		int k = keyboard.nextInt();
		int handShakes = 0; 
		
		for (int i = 1; i <= k; i++)
		{
			handShakes = handShakes + k - i;
		}
		
		System.out.println("The total number of handshakes is " + handShakes);

		keyboard.close();

	}

}

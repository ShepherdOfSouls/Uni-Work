package lab3;

import java.util.Scanner;

public class NumberCrunch {

	//Not sure where this came from, it isn't in this week's lab specification. 
	//It seems to be a program that accepts up to 3 numbers and does various mathematical operations based on the amount of numbers given.
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter up to three positive numbers, type a negative or non-number to exit early:");
		
		int posNum = 0;
		int max = 0;
		int num_1 = 0;
		int num_2 = 0;

		while(keyboard.hasNextInt()){
			int temp = keyboard.nextInt();
			if (temp > 0){
				num_2 = num_1;
				num_1 = temp;
				posNum++;
				if (temp > max){
					max = temp;
				}
			}
			if(temp <= 0 || posNum == 3){
				break;
			}
		}
			
		if (posNum == 0) {
			System.out.println("You have entered no positive numbers.");
		}
		if (posNum == 1)
		{
			System.out.println("You have entered 1 positive number.");
			System.out.print("The factors of " + num_1 + " are: ");
			for (int i = 1; i <= num_1; i++)
			{
				if (i == num_1)
				{
					System.out.println(i + ".");
				}
				else if (num_1 % i == 0)
				{
					System.out.print(i + ", ");
				}
			}
		}
		else if (posNum == 2)
		{
			System.out.println("You have entered 2 positive numbers.");
			System.out.print("Their product is " + (num_1 * num_2) + ", ");
			if (num_1 > num_2)
			{
				System.out.println("and " + num_1 + " is greater than " + num_2 + ".");
			}
			else if (num_1 < num_2)
			{
				System.out.println("and " + num_1 + " is less than " + num_2 + ".");
			}
			else if (num_1 == num_2)
			{
				System.out.println("and they are equal.");
			}
		}
		else if (posNum == 3)
		{
			System.out.println("You have entered 3 positive numbers.");
			System.out.println("The largest is " + max + ".");
		}
		

	
		keyboard.close();

	}

}

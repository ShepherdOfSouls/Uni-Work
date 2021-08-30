package lab3;

import java.util.Scanner;

public class NumberCrunch {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter up to three positive numbers:");
		
		int posNum = 1;
		int max = 0;
		int newNum = keyboard.nextInt();
		int oldNum = 0;
		int oldOldNum = 0;
		if (newNum < 0)
		{
			System.out.println("You have not entered any positive numbers. Please input at least one positive number.");
		}
		else
		{
			do
			{
				
				if (newNum > max)
				{
					max = newNum;
				}
				oldOldNum = oldNum;
				oldNum = newNum;
				newNum = keyboard.nextInt();
				if (newNum >= 0)
				{
					posNum++;
				}
				
			}
			while (newNum >=0 && posNum < 3);
			
			if (posNum == 1)
			{
				System.out.println("You have entered 1 positive number.");
				System.out.print("The factors of " + oldNum + " are: ");
				for (int i = 1; i <= oldNum; i++)
				{
					if (i == oldNum)
					{
						System.out.println(i + ".");
					}
				else if (oldNum % i == 0)
					{
						System.out.print(i + ", ");
					}
				}
			}
			else if (posNum == 2)
			{
				System.out.println("You have entered 2 positive numbers.");
				System.out.print("Their product is " + (oldOldNum * oldNum) + ", ");
				if (oldOldNum > oldNum)
				{
					System.out.println("and " + oldOldNum + " is greater than " + oldNum + ".");
				}
				else if (oldOldNum < oldNum)
				{
					System.out.println("and " + oldOldNum + " is less than " + oldNum + ".");
				}
				else if (oldOldNum == oldNum)
				{
					System.out.println("and they are equal.");
				}
			}
			else if (posNum == 3)
			{
				System.out.println("You have entered 3 positive numbers.");
				System.out.println("The largest is " + max + ".");
			}
			
		}
		

	}

}

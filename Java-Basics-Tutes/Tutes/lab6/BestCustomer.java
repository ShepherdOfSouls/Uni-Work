package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class BestCustomer {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Double> moneySpent = new ArrayList<Double>();
		ArrayList<String> names = new ArrayList<String>();
			
		boolean sentinel = false;
		int count = 1;
		
		while (sentinel == false)
		{
			System.out.println("Customer " + count + ":");
			System.out.println("--Amount spent:");
			double amountSpent = keyboard.nextDouble();
			
			if (amountSpent == 0)
			{
				sentinel = true;
			}
			else
			{
				moneySpent.add(amountSpent);
				System.out.println("--Name:");
				names.add(keyboard.next());
				System.out.println();
				count++;
			}
			
		}
		
		System.out.println("The best customer's name is: " + nameOfBestCustomer(moneySpent, names));

	}
	
	
	public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers)
	{
		double max = 0.0;
		int index = 0;
		
		for (int i = 0; i < sales.size(); i++)
		{
			if (sales.get(i) > max)
			{
				max = sales.get(i);
				index = i;
			}
		}
		
		return customers.get(index);
	}

}

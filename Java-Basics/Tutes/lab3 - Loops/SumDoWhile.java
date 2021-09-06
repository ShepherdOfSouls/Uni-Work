package lab3;

/**
 * Prints and sums all numbers from 1 to 100 using a do while loop.
 */
public class SumDoWhile {

	public static void main(String[] args) 
	{
		int number = 1;
		int total = 0;
		
		System.out.print(number);
		
		do
		{
			total = total + number;
			number++;
			System.out.print(" + " + number);
		}
		while (number < 100);
		
		total = total + number; 

		System.out.print(" = " + total);
		

	}

}

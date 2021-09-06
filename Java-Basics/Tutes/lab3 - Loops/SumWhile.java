package lab3;

/**
 * Prints and sums all numbers from 1 to 100 using a while loop.
 */
public class SumWhile {

	public static void main(String[] args) 
	{
		int number = 1;
		int total = 0;
		
		System.out.print(number);
		
		while (number < 100)
		{
			total = total + number;
			number++;
			System.out.print(" + " + number);
		}
		
		total = total + number; 

		System.out.print(" = " + total);
		
	}

}

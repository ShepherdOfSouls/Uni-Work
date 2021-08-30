package lab5;

public class NumberAboveAverage {

	public static void main(String[] args) 
	{
		double[] numArray = {18.3, 20.4, 19.6, 22, 24, 24.6, 21.3, 19.2, 17.1, 18.6};
		double total = 0.0;
		
		for (int i = 0; i < numArray.length; i++)
		{
			total = total + numArray[i];
		}
		
		double average = total/numArray.length;
		System.out.println("The average temperature is: " + average);
		
		int aboveAverage = 0;
		
		for (int i = 0; i < numArray.length; i++)
		{
			if (numArray[i] > average)
			{
				System.out.println("Day " + (i + 1) + " had temperature " + numArray[i] + " which was above average");
				aboveAverage++;
			}
		}
		
		System.out.println("The number of days with a temperature above average is: " + aboveAverage);

	}

}

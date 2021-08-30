package lab5;


public class AlternatingSum {

	public static void main(String[] args) 
	{
		double[] data = {1.6, 4.2, 9.3, 16.0, 9.0, 7.4, 4.0, 9.0, 11.2};
		
		System.out.println("Array:");
		printArray(data);
		System.out.println("Alternating sum: " + alternatingSum(data));

	}
	
	
	public static double alternatingSum(double[] data)
	{
		double sum = 0.0;
		
		for (int i = 0; i < data.length; i++)
		{
			if (i % 2 == 0)
			{
				sum = sum + data[i];
			}
			else
			{
				sum = sum - data[i];
			}
		}
		
		return sum;
		
	}
	
	
	public static void printArray(double[] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			if (i < data.length - 1)
			{
				System.out.print(data[i] + " | ");
			}
			
			else
			{
				System.out.println(data[i]);
			}
		}
	}

}

package lab1;

public class SimpleCalculator {
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	public static int subtract(int a, int b)
	{
		return a - b;
	}
	
	public static int multiply(int a, int b)
	{
		return a * b;
	}
	
	public static double divide(int a, int b)
	{
		if (b == 0)
		{
			System.out.println("Can't divide by 0");
			return 0;
		}
		
		return a/ (double) b;
	}

}

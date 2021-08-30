package lab1;

public class EnglishCalculator {
	public static double calculate(String s)
	{
		if (s.contains(" times "))
		{
			String[] strArray = s.split(" times ");
			int a = Integer.parseInt(strArray[0]);
			int b = Integer.parseInt(strArray[1]);
			return (double) SimpleCalculator.multiply(a, b);
			
		}
		
		else if(s.contains(" plus "))
		{
			String[] strArray = s.split(" plus ");
			int a = Integer.parseInt(strArray[0]);
			int b = Integer.parseInt(strArray[1]);
			return (double) SimpleCalculator.add(a, b);
		}
		
		else if(s.contains(" minus "))
		{
			String[] strArray = s.split(" minus ");
			int a = Integer.parseInt(strArray[0]);
			int b = Integer.parseInt(strArray[1]);
			return (double) SimpleCalculator.subtract(a, b);
		}
		
		else if(s.contains(" divided by "))
		{
			String[] strArray = s.split(" divided by ");
			int a = Integer.parseInt(strArray[0]);
			int b = Integer.parseInt(strArray[1]);
			return (double) SimpleCalculator.divide(a, b);
		}
		
		else
		{
			System.out.println("not a correct sentence");
			return 0.0;
		}
	}

}

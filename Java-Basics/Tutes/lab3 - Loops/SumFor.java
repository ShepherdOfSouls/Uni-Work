package lab3;

public class SumFor {

	public static void main(String[] args) 
	{
		int total = 0;
		
		for (int number = 1; number <= 100; number++)
		{
			total = total + number;
		}
		
		System.out.print("The Sum is: " + total);
		

	}

}

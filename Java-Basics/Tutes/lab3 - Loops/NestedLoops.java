package lab3;

/**
 * Basic for loop that prints numbers to show how it works.
 * First number is outer loop iteration and second number is inner loop.
 */
public class NestedLoops {

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 2; i++)
		{
			for (int j = 1; j <= 4; j++)
			{
				System.out.println(i + " " + j);
			}
			
			System.out.println("");
		}
		

	}

}

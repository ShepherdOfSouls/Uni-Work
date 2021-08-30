package lab5;

public class ArrayInitialization {

	public static void main(String[] args) 
	{
		int[] numArray = new int[10];
		
		for (int i = 0; i < numArray.length; i++)
		{
			numArray[i] = i + 1;
			
			if (i < (numArray.length - 1))
			{
				System.out.print(numArray[i] + " | ");
			}
			else
			{
				System.out.println(numArray[i]);
			}
		}
		
		for (int i = 0; i < numArray.length; i++)
		{
			numArray[i] = i * 2;
			
			if (i < 9)
			{
				System.out.print(numArray[i] + " | ");
			}
			else
			{
				System.out.println(numArray[i]);
			}
		}
		
		for (int i = 0; i < numArray.length; i++)
		{
			numArray[i] = i * i;
			
			if (i < 9)
			{
				System.out.print(numArray[i] + " | ");
			}
			else
			{
				System.out.println(numArray[i]);
			}
		}
		

	}

}

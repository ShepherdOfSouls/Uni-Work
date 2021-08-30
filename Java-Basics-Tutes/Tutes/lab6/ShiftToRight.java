package lab6;

public class ShiftToRight {

	public static void main(String[] args) 
	{
		int[] numbers = {12, 14, 87, 54, 67, 78};
		printArray(numbers);
		shift(numbers);
		printArray(numbers);
	}
	
	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void shift(int[] arr)
	{
		int temp = arr[arr.length - 1];
		for (int i = (arr.length - 1); i >= 0; i--)
		{	
			if (i == 0)
			{
				arr[i] = temp;
			}
			else
			{
				arr[i] = arr[i-1];
			}
		}
	}

}

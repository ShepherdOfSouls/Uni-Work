package lab6;

public class SwapTwoElements {

	public static void main(String[] args) 
	{
		int[] numbers = {12, 14, 87, 54, 67, 78};
		printArray(numbers);
		swapFirstLast(numbers);
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
	
	public static void swapFirstLast(int[] arr)
	{
		int temp = arr[0];
		arr[0] = arr [arr.length - 1];
		arr[arr.length - 1] = temp;
	}

}

package lab6;

public class Duplicates {

	public static void main(String[] args) 
	{
		int[] arr1 = {1, 2, 3, 4, 5, 6, 6, 7, 8, 10};
		int[] arr2 = {1, 2, 3, 6, 7, 6, 8};
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		printArray(arr1);
		if (hasAdjDuplicate(arr1))
		{
			System.out.println("This array contains adjacent duplicates.");
		}
		else if (hasAnyDuplicates(arr1))
		{
			System.out.println("This array contains duplicates.");
		}
		else
		{
			System.out.println("This array doesn't contain any duplicates.");
		}
		
		
		printArray(arr2);
		if (hasAdjDuplicate(arr2))
		{
			System.out.println("This array contains adjacent duplicates.");
		}
		else if (hasAnyDuplicates(arr2))
		{
			System.out.println("This array contains duplicates.");
		}
		else
		{
			System.out.println("This array doesn't contain any duplicates.");
		}
		
		
		printArray(arr3);
		if (hasAdjDuplicate(arr3))
		{
			System.out.println("This array contains adjacent duplicates.");
		}
		else if (hasAnyDuplicates(arr3))
		{
			System.out.println("This array contains duplicates.");
		}
		else
		{
			System.out.println("This array doesn't contain any duplicates.");
		}

	}
	
	
	public static boolean hasAdjDuplicate(int[] arr)
	{
		boolean result = false;
		
		for (int i = 0; i < (arr.length - 1); i++)
		{
			if (arr[i] == arr[i+1])
			{
				result = true;
				return result;
			}
		}
		
		return result;
	}
	
	
	public static boolean hasAnyDuplicates(int[] arr)
	{
		boolean result = false;
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if (arr[i] == arr[j] && i != j)
				{
					result = true;
					return result;
				}
			}
		}
		
		return result;
	}
	
	
	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

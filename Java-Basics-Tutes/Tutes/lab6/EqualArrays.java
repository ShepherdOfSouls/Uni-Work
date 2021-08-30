package lab6;

public class EqualArrays {

	public static void main(String[] args) 
	{
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr4 = {1, 2, 3, 4, 5, 4, 7, 8};
		
		System.out.println(equals(arr1, arr2));
		System.out.println(equals(arr1, arr3));
		System.out.println(equals(arr1, arr4));
		System.out.println(equals(arr3, arr4));

	}
	
	public static boolean equals(int[] a, int[] b)
	{
		boolean equals = true;
		if (a.length != b.length)
		{
			equals = false;
			return equals;
		}
		
		for(int i = 0; i < a.length && i < b.length; i++)
		{
			if (a[i] != b[i])
			{
				equals = false;
				return equals;
			}
		}
		
		return equals;
	}

}

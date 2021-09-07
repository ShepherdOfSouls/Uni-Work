package lab5;

/**
 * Program takes an array and checks whether it has the numbers 0 - (n-1), printing the result.
 */
public class CheckArray {

	public static void main(String[] args) {
		int [] arr1 = {2, 1, 0, 4, 5, 3};
		if (check(arr1) == true) {
			System.out.println("The array contains the numbers from 0 to n-1");
		}
		else {
			System.out.println("The array does not contain the numbers from 0 to n-1");
		}
		
		
		int [] arr2 = {2, 8, 0, 4, 5, 3};
		if (check(arr2) == true) {
			System.out.println("The array contains the numbers from 0 to n-1");
		}
		else {
			System.out.println("The array does not contain the numbers from 0 to n-1");
		}
		
		
		int [] arr3 = {1, 2, 3, 4, 5, 6};
		if (check(arr3) == true) {
			System.out.println("The array contains the numbers from 0 to n-1");
		}
		else {
			System.out.println("The array does not contain the numbers from 0 to n-1");
		}
		
		
		int [] arr4 = {3, 4, 1, 6, 2, 5, 7, 9, 8, 0};
		if (check(arr4) == true) {
			System.out.println("The array contains the numbers from 0 to n-1");
		}
		else {
			System.out.println("The array does not contain the numbers from 0 to n-1");
		}

	}

	/**
	 * Checks if a given array arr with size n contains the numbers from 0 to n‐1
	 * @param arr ‐ array with n integer elements
	 * @return true if arr contains the numbers from 0 to n‐1 (all numbers, and just once)
	 * and false otherwise
	 */
	public static boolean check(int[] arr) {
		boolean result = true;
		boolean[] check = new boolean[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 || arr[i] >= arr.length) {
				result = false;
				return result;
			}
			else if (check[arr[i]] == false) {
				check[arr[i]] = true;
			}
			else if (check[arr[i]] == true) {
				result = false;
				return result;
			}
		}
		return result;
	}
	
}

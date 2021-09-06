package lab2;

import java.util.Scanner;

public class CheckDate {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a date to be checked:");
		
		System.out.println("Day:");
		int day = keyboard.nextInt();
		
		System.out.println("Month: ");
		int month = keyboard.nextInt();
		
		System.out.println("Year: ");
		int year = keyboard.nextInt();
		
		System.out.println("Date is " + day + ":" + month + ":" + year);
		
		if (day < 1) {
			System.out.println("Invalid Date: The day value is less than 1");
		} else if (day > 29 && month == 2 && year % 4 == 0 && year % 100 != 0) {
			System.out.println("Invalid Date: The day is greater than 29 in Februrary in a leap year");
		} else if (day > 28 && month == 2 && (year % 4 != 0 || year % 100 == 0)) {
			System.out.println("Invalid Date: The day is greater than 28 in February in a non-leap year");
		} else if (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
			System.out.println("Invalid Date: The day is greater than 30 in a month with 30 days");
		} else if (day > 31) {
			System.out.println("Invalid Date: The day is greater than 31");
		} else if (month < 1 || month > 12) {
			System.out.println("Invalid Date: The month must be between 1 and 12");
		} else {
			System.out.println("Valid Date");
		}
	
		keyboard.close();
		
	}

}

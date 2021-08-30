package lab4;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type the length of the rectangle:");
		double length = keyboard.nextDouble();
		
		System.out.println("Type the width of the rectangle:");
		double width = keyboard.nextDouble();
		
		double area = calculateArea(length, width);
		System.out.println("The area is: " + area);
		

	}
	
	public static double calculateArea(double length, double width)
	{
		double area = length * width;
		return area;
	}

}

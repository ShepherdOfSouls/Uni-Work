package lab4;

import java.util.Scanner;
/**
* This program contains a method which takes input from the user for the 
* length and width of a rectangle and then calculates the area.
* @author Caleb Barber
*/
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
		
		keyboard.close();
	}
	/**
	Computes the area of a rectangle, given its length and width.
	@param length the length of the rectangle
	@param width the width of the rectangle
	@return the area of the rectangle
	*/
	public static double calculateArea(double length, double width)
	{
		double area = length * width;
		return area;
	}

}

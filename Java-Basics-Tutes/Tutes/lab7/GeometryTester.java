package lab7;

import java.util.Scanner;

public class GeometryTester {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = keyboard.nextDouble();
		System.out.println("Enter height: ");
		double height = keyboard.nextDouble();
		
		Sphere s = new Sphere(radius);
		Cylinder cyl = new Cylinder(radius, height);
		Cone con = new Cone(radius, height);
		
		System.out.println("Sqhere volume: " + s.calculateVolume());
		System.out.println("Sphere area: " + s.calculateArea());
		System.out.println("Cylinder volume: " + cyl.calculateVolume());
		System.out.println("Cylinder area: " + cyl.calculateArea());
		System.out.println("Cone volume: " + con.calculateVolume());
		System.out.println("Cone area: " + con.calculateArea());

	}

}

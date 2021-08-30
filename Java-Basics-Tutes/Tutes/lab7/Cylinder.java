package lab7;

public class Cylinder 
{
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	public double calculateVolume()
	{
		return Math.PI * radius * radius * height;
	}
	
	public double calculateArea()
	{
		return (2.0 * Math.PI * radius * radius) + (2.0 * height * Math.PI * radius);
	}
	

}

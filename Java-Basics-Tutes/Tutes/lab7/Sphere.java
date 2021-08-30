package lab7;

public class Sphere 
{
	private double radius;
	
	public Sphere(double radius)
	{
		this.radius = radius;
	}
	
	public double calculateVolume()
	{
		return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
	}
	
	public double calculateArea()
	{
		return 4.0 * Math.PI * radius * radius;
	}
	

}

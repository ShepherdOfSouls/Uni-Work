package lab11;

public class Circle implements Computable
{
	private double radius;
	
	public Circle (double radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
}

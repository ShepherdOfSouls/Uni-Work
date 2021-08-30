package lab7;

public class Square 
{
	private double width;
	private double xCentre;
	private double yCentre;
	
	public Square(double w, double x, double y)
	{
		if (w < 0)
		{
			width = 0;
		}
		else
		{
			width = w;
		}
		
		xCentre = x;
		yCentre = y;
	}
	
	public double getArea()
	{
		return width*width;
	}
	
	public double getPerimeter()
	{
		return 4*width;
	}
	
	public boolean isInside(double x, double y)
	{
		if (y < (yCentre+(width/2)) && y > (yCentre-(width/2)) && x < (xCentre+(width/2)) && x > (xCentre-(width/2)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getXCentre()
	{
		return xCentre;
	}
	
	public double getYCentre()
	{
		return yCentre;
	}

}

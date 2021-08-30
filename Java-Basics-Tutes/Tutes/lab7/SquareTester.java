package lab7;

public class SquareTester {

	public static void main(String[] args) 
	{
		Square s1 = new Square(4, 1, 0);
		
		System.out.println("Area= " + s1.getArea());
		System.out.println("Perimeter= " + s1.getPerimeter());
		System.out.println("Width= " + s1.getWidth());
		System.out.println("xCentre= " + s1.getXCentre());
		System.out.println("yCentre= " + s1.getYCentre());
		
		if (s1.isInside(3, 2))
		{
			System.out.println("Point 3,2 is inside the square.");
		}
		else if (!s1.isInside(3, 2))
		{
			System.out.println("Point 3,2 is not inside the square.");
		}
		
		
		if (s1.isInside(0, 1))
		{
			System.out.println("Point 0,1 is inside the square.");
		}
		else if (!s1.isInside(0, 1))
		{
			System.out.println("Point 0,1 is not inside the square.");
		}


	}

}

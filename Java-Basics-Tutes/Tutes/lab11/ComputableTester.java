package lab11;

public class ComputableTester {

	public static void main(String[] args) 
	{
		Computable[] test = new Computable[3];
		test[0] = new Circle(2);
		test[1] = new Square(2);
		test[2] = new Square(3);
		
		for(Computable element : test)
		{
			System.out.println("Area is: " + element.getArea());
			System.out.println("Perimeter is: " + element.getPerimeter());
			System.out.println();
		}

	}

}

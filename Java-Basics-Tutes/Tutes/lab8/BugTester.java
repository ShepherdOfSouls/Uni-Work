package lab8;

public class BugTester {

	public static void main(String[] args) 
	{
		Bug myBug = new Bug(10);
		myBug.move();
		myBug.move();
		myBug.turn();
		myBug.move();
		myBug.turn();
		myBug.move();
		myBug.move();
		myBug.turn();
		myBug.move();
		myBug.move();
		myBug.move();
		
		System.out.println("10");
		System.out.println(myBug.getPosition());
		
	}

}

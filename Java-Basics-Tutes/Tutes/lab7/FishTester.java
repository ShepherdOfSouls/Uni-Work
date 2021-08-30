package lab7;


public class FishTester {

	public static void main(String[] args) 
	{
		Fish f1 = new Fish();
		
		while (f1.canBreed() == false)
		{
			f1.incrementAge();
		}
		
		System.out.println(f1.getAge());

	}

}

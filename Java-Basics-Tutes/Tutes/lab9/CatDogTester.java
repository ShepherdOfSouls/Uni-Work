package lab9;

public class CatDogTester {

	public static void main(String[] args) 
	{
		Dog d = new Dog("Fluffy");
		Cat c = new Cat("Bindi");
		
		System.out.println("The cat " + c.getName() + " says: \n" + c.talk());
		System.out.println("The dog " + d.getName() + " says: \n" + d.talk());

	}

}

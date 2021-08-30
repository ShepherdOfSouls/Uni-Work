package lab8;

public class PersonTester {

	public static void main(String[] args) 
	{
		Person p1 = new Person(21, "Mia");
		System.out.println(p1.getName() + " " + p1.getAge());
		
		Person p2 = new Person();
		System.out.println(p2.getName() + " " + p2.getAge());
		
		p2.set(25, "James");
		System.out.println(p2.getName() + " " + p2.getAge());
		
		p2.setAge(35);
		System.out.println(p2.getName() + " " + p2.getAge());
		
		p2.setName("Michael");
		System.out.println(p2.getName() + " " + p2.getAge());
		
		p2.readInput();
		System.out.println(p2.getName() + " " + p2.getAge());
		
		if (p1.equals(p2))
		{
			System.out.println("p1 = p2");
		}
		else if (!p1.equals(p2))
		{
			System.out.println("p1 != p2");
		}
		
		if (p1.isSameName(p2))
		{
			System.out.println("p1 name = p2 name");
		}
		else if (!p1.isSameName(p2))
		{
			System.out.println("p1 name != p2 name");
		}
		
		if (p1.isSameAge(p2))
		{
			System.out.println("p1 age = p2 age");
		}
		else if (!p1.isSameAge(p2))
		{
			System.out.println("p1 age != p2 age");
		}
		
		if (p1.isOlderThan(p2))
		{
			System.out.println("p1 is older than p2");
		}
		else if (!p1.isOlderThan(p2))
		{
			System.out.println("p1 is not older than p2");
		}
		
		Person p3 = Person.createAdult();
		System.out.println(p3.getName() + " " + p3.getAge());
		
		Person p4 = Person.createTeenager();
		System.out.println(p4.getName() + " " + p4.getAge());

	}

}

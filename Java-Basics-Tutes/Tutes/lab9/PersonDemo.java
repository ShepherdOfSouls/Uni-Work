package lab9;

public class PersonDemo {

	public static void main(String[] args) 
	{
		Person p = new Person(111, "Amy");
		Student s = new Student(222, "Bobby", "Philosophy");
		Professor pr = new Professor(333, "Cathy", 1000000);
		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(pr.toString());
		
		p.writeOutput();
		s.writeOutput();
		pr.writeOutput();
		
		Person[] people = new Person[4];
		people[0] = new Professor(1982, "Christine", 60000);
		people[1] = new Student(1990, "Tim", "Engineering");
		people[2] = new Student(1992, "Lily", "Art/Computer Science");
		people[3] = new Person(1960, "Bob");
		
		for (int i = 0; i < people.length; i++)
		{
			people[i].writeOutput();
		}

	}

}

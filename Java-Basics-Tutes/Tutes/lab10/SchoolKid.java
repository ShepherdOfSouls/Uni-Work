package lab10;

public class SchoolKid 
{
	private String name;
	private int age;
	private String teacher;
	private String greeting;
	
	public SchoolKid(String name, int age, String teacher, String greeting)
	{
		this.name = name;
		this.age = age;
		this.teacher = teacher;
		this.greeting = greeting;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getTeacher()
	{
		return teacher;
	}
	
	public String getGreeting()
	{
		return greeting;
	}
	
	
}

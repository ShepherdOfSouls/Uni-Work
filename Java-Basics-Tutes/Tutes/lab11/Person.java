package lab11;

public class Person 
{
	protected String name;
	protected int birthYr;
	
	public Person(int yr, String n)
	{
		birthYr = yr;
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getYear()
	{
		return birthYr;
	}
	
	public String toString()
	{
		return ("Name: " + this.name + ", Year of birth: " + this.birthYr);
	}
	
	public void writeOutput()
	{
		System.out.println("\nName: " + getName());
		System.out.println("Year of birth: " + getYear() + "\n");
	}
	

}

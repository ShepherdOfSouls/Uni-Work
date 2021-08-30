package lab9;

public class Student extends Person
{
	private String degree;
	
	public Student(int yr, String n, String d)
	{
		super(yr, n);
		
		degree = d;
		
	}
	
	public String toString()
	{
		return ("Name: " + this.name + ", Year of birth: " + this.birthYr + ", Degree: " + this.degree);
	}
	
	public String getDegree()
	{
		return degree;
	}
	
	public void writeOutput()
	{
		System.out.println("\nName: " + getName());
		System.out.println("Year of birth: " + getYear());
		System.out.println("Degree: " + getDegree() + "\n");
	}
	

}

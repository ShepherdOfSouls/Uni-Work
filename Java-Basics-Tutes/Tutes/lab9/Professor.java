package lab9;

public class Professor extends Person
{
	private int salary;
	
	public Professor(int yr, String n, int s)
	{
		super(yr, n);
		
		salary = s;
	}
	
	public String toString()
	{
		return ("Name: " + this.name + ", Year of birth: " + this.birthYr + ", Salary: " + this.salary);
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void writeOutput()
	{
		System.out.println("\nName: " + getName());
		System.out.println("Year of birth: " + getYear());
		System.out.println("Salary: " + getSalary() + "\n");
	}

}

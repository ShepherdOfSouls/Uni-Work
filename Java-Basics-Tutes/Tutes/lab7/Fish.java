package lab7;

public class Fish 
{
	private int age;
	
	public Fish()
	{
		age = 0;
	}
	
	public void incrementAge()
	{
		age++;
	}
	
	public boolean canBreed()
	{
		if (age >= 12)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getAge()
	{
		return age;
	}
	

}

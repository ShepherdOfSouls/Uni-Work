package lab8;

import java.util.Scanner;

public class Person 
{
	Scanner keyboard = new Scanner(System.in);
	
	private int age;
	private String name;
	
	public Person()
	{
		name = "No name";
		age = 0;
	}
	
	public Person(int age, String name)
	{
		this.name = name;
		this.age = age;
	}
	
	public void set(int age, String name)
	{
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void readInput()
	{
		System.out.println("Name:");
		name = keyboard.next();
		System.out.println("Age:");
		age = keyboard.nextInt();
		while (age < 0)
		{
			age = keyboard.nextInt();
		}
	}
	
	public boolean equals(Person another)
	{
		if (this.age == another.age && this.name.equals(another.name))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isSameName(Person another)
	{
		if (this.name.equals(another.name))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isSameAge(Person another)
	{
		if (this.age == another.age)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isOlderThan(Person another)
	{
		if (this.age > another.age)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static Person createAdult()
	{
		Person p = new Person(21, "An adult");
		return p;
	}
	
	public static Person createTeenager()
	{
		Person p = new Person(15, "A teenager");
		return p;
	}
	

}

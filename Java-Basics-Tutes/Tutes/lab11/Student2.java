package lab11;

public class Student2 extends Person implements Comparable
{
	private String degree;
	private int studentID;
	
	public Student2(int yr, String n, String d, int ID)
	{
		super(yr, n);
		
		degree = d;
		
		studentID = ID;
		
	}
	
	public String toString()
	{
		return (super.toString() + ", Degree: " + this.degree + ", StudentID: " + studentID);
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
	
	//public int compareTo(Object otherObject)
	//{
	//	Student2 other = (Student2) otherObject;
		
	//	if (studentID < other.studentID)
	//	{
	//		return -1;
	//	}
	//	else if (studentID > other.studentID)
	//	{
	//		return 1;
	//	}
	//	else
	//	{
	//		return 0;
	//	}
	//}
	
	public int compareTo(Object otherObject)
	{
		Student2 otherStudent = (Student2) otherObject;
		return this.name.compareTo(otherStudent.name);
	}

}

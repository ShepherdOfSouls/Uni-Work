package lab11;

import java.util.Arrays;

public class Student2Tester {

	public static void main(String[] args) 
	{
		Student2[] students = new Student2[6];
		students[0] = new Student2(1, "a", "a", 1);
		students[1] = new Student2(3, "d", "d", 3);
		students[2] = new Student2(6, "e", "e", 6);
		students[3] = new Student2(4, "b", "b", 4);
		students[4] = new Student2(5, "f", "f", 5);
		students[5] = new Student2(2, "c", "c", 2);
		
		Arrays.sort(students);
		
		for(Student2 element : students)
		{
			System.out.println(element.toString());
		}

	}

}

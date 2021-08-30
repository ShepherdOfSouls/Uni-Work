package lab3;

import java.util.Scanner;

public class ExamGrades 
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		int HD = 0;
		int D = 0;
		int C = 0;
		int P = 0;
		int F = 0;
		int count = 0;
		double current = 0;
	
		while (current >= 0)
		{
			current = keyboard.nextDouble();
		
			if(current >= 85)
			{
				HD++;
				count++;
			}
			else if (current >= 75 && current < 85)
			{
				D++;
				count++;
			}
			else if (current >= 65 && current < 75)
			{
				C++;
				count++;
			}
			else if (current >= 50 && current < 65)
			{
				P++;
				count++;
			}
			else if (current >= 0 && current < 50)
			{
				F++;
				count++;
			}
		}
		
		System.out.println("Total number of grades = " + count);
		System.out.println("Number of HD's = " + HD);
		System.out.println("Number of D's = " + D);
		System.out.println("Number of C's = " + C);
		System.out.println("Number of P's = " + P);
		System.out.println("Number of F's = " + F);
	}

}

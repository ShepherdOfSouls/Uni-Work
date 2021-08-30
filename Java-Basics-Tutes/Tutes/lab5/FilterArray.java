package lab5;

import java.util.Scanner;

public class FilterArray 
	{
		public static final int N = 2; //number of rows
		public static final int M = 3; //number of columns
		public static final double FACTOR = 0.8; //factor for multiplication	
		
		public static void main(String[] args) 
		{		
		      double[][] picture = readPicture();
		      System.out.println("\nOld picture:");
		      printArray(picture);
		      double[][] newPicture = applyThreshold(picture, FACTOR);
		      System.out.println("\nNew picture:");
		      printArray(newPicture);							
		}
		
		
		public static double[][] readPicture() 
		{
			Scanner keyboard = new Scanner(System.in);
			double[][] ar = new double[N][M];
			
			System.out.println("Please enter 6 numbers:");
			
			for (int i = 0; i < N; i++)
			{
				for (int j = 0; j < M; j++)
				{
					ar[i][j] = keyboard.nextDouble();
				}
			}
			
			return ar;
		}

		
		public static double[][] applyThreshold(double[][] pic, double coefficient) 
		{
	        
	      double[][] result = new double[N][M];
	      double sum = 0;
	      double amount = 0;
	      
	      for(int i = 0; i < N; i++)
	      {
	    	  for(int j = 0; j < M; j++)
	    	  {
	    		  sum = sum + pic[i][j];
	    		  amount++;
	    	  }
	      }
	      
	      double average = sum/amount;
	      double threshold = coefficient*average;
	      System.out.println("The average is: " + average + ";anything below " + threshold + " will be 0; and anything above will be 1");
	      
	      for (int i = 0; i < N; i++)
	      {
	    	  for(int j = 0; j < M; j++)
	    	  {
	    		  if (pic[i][j] > threshold)
	    		  {
	    			  result[i][j] = 1;
	    		  }
	    	  }
	      }
	      
	      return result;
	    }

		
		public static void printArray(double[][] ar)
		{
			
			for (int i = 0; i < N; i++)
			{
				for (int j = 0; j < M; j++)
				{
					System.out.printf("%6.2f", ar[i][j]);
				}
				
				System.out.println("\n");
			}
		}

	}

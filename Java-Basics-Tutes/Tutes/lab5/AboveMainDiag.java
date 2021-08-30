package lab5;

public class AboveMainDiag {

	public static void main(String[] args) 
	{
		final int N = 4;
		int[][] array = new int[N][N];
		
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				array[i][j] = (int) (Math.random()*100) + 1;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The sum of the elements above the main diagonal is: " + sumAboveMainDiag(array));
		

	}
	
	public static int sumAboveMainDiag(int[][] arr)
	{
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if (j > i)
				{
					sum = sum + arr[i][j];
				}
			}
		}
		
		return sum;
	}

}

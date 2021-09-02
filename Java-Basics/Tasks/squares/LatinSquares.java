package squares;

import java.util.Scanner;

public class LatinSquares {
	static Scanner keyboard = new Scanner(System.in);
		
	/**
	* Reads an integer representing N from the keyboard and returns it
	* 
	* @return the value for N
	*/
	public static int readSize() {
		int N = keyboard.nextInt();
		return N;
	}
		
	/**
	* Reads N x N integer numbers from the keyboard and arranges them in an N x
	* N array row-by-row
	* 
	* @param n - the size of the square
	* @return the n x n array (the square)
	*/
	public static int[][] readSquare(int n) {
		int[][] arr = new int[n][n];
	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = keyboard.nextInt();
			}
		}
		
		return arr;
	}
		
	/**
	* Checks if a given column contains the numbers 1 to N
	* 
	* @param n - the size of the square
	* @param square - an n x n array
	* @param columnNumber - the column to check
	* @return false if columnNumber is outside the range [0..(n-1)]; true if
	*         the column contains the numbers 1 to n; false otherwise
	*/
	public static boolean validColumn(int n, int[][] square, int columnNumber) {
		if (columnNumber < 0 || columnNumber > (n - 1)) {
			return false;
		}
			
		boolean[] track = new boolean[n];
			
		for (int i = 0; i < n; i++) {
			if (square[columnNumber][i] < 1 || square[columnNumber][i] > n) {
				return false;
			}
				
			if (track[(square[i][columnNumber] - 1)] == false) {
				track[(square[i][columnNumber] - 1)] = true;
			} else if(track[(square[i][columnNumber] - 1)] == true) {
				return false;
			}
		}
			
		return true;
	}

	/**
	* Checks if a given row contains the numbers 1 to N
	* 
	* @param n - the size of the square
	* @param square - an n x n array
	* @param rowNumber - the row to check
	* @return false if rowNumber is outside the range [0..(n-1)]; true if the
	*         row contains the numbers 1 to n; false otherwise
	*/
	public static boolean validRow(int n, int[][] square, int rowNumber) {
		if (rowNumber < 0 || rowNumber > (n - 1)) {
			return false;
		}
			
		boolean[] track = new boolean[n];
			
		for (int i = 0; i < n; i++)	{
			if (square[rowNumber][i] < 1 || square[rowNumber][i] > n) {
				return false;
			}
				
			if (track[(square[rowNumber][i] - 1)] == false)	{
				track[(square[rowNumber][i] - 1)] = true;
			} else if(track[(square[rowNumber][i] - 1)] == true) {
				return false;
			}
		}
			
		return true;
			
	}
		
	/**
	* Checks if the square is a Latin square by calling the methods
	* validColumn and validRow
	* 
	* @param n - the size of the square
	* @param square - an n x n square of numbers
	* @return true if square is a Latin square and false otherwise
	*/
	public static boolean validLatinSquare(int n, int[][] square) {
		boolean valid_row;
		boolean valid_column;
		
		for(int i = 0; i < n; i++) {
			valid_row = validRow(n, square, i);
			valid_column = validColumn(n, square, i);
			if (valid_row == false || valid_column == false) {
			return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Please enter the size of the square (N):");
		int n = readSize();
		if(n <= 0) {
			System.out.println("Invalid size entered.");
			return;
		}
		System.out.println("Please enter " + (n * n) + " numbers: ");
		int[][] square = readSquare(n);
		System.out.println("This is the square that you input:");
		printSquare(square);
		if (validLatinSquare(n, square)) {
			System.out.println("It's a Latin square!");
		} else {
			System.out.println("Not a Latin square!");
		}
		keyboard.close();
	}

	public static void printSquare(int[][] square) {
		final char corner = '+';
		final char vert = '|';
		final char horiz = '-';
			
		// Find how big each grid cell needs to be
		int space = 1;
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				space = Math.max(space, ((int)Math.log10(square[i][j])) + 1);
			}
		}
			
		// Build the horizontal grid line
		String sepLine = String.valueOf(corner);
		for(int i = 0; i < square.length; i++) {
			sepLine += String.format("%0" + space + "d", 0).replace('0', horiz);
			sepLine += corner;
		}
			
		// Print out the grid
		System.out.println(sepLine);
		for (int i = 0; i < square.length; i++)	{
			for (int j = 0; j < square[i].length; j++) {
				System.out.print(vert);
				System.out.printf("%" + space + "d" , square[i][j]);
			}
			System.out.println(vert);
			System.out.println(sepLine);
		}
	}

}
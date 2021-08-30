package lab3;

import java.util.*;

public class ListTest {
	
	public static void main(String[] args)
	{
		ArrayList<String> favouriteMovies = new ArrayList<String>();
		
		favouriteMovies.add("Inception");
		favouriteMovies.add("Kung Pow");
		favouriteMovies.add(1, "The Room");
		
		System.out.println("You have " + favouriteMovies.size() + " favourite movies.");
		
		for (int i = 0; i < favouriteMovies.size(); i++)
		{
			System.out.println((i+1) + ": " + favouriteMovies.get(i));
		}
	}

}

package lab2;

import java.util.Scanner;

public class RockPaperScissors 
{

	public static void main(String[] args) 
	{
		String rock = "rock";
		String paper = "paper";
		String scissors = "scissors";
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Player 1: Choose Rock, Paper or Scissors-");
		
		String player1 = scan.next().toLowerCase();
		
		System.out.println("Player 2: Choose Rock, Paper or Scissors-");
		
		String player2 = scan.next().toLowerCase();
		
		if ((player1.equals(rock)) && (player2.equals(scissors)))
		{
			System.out.println("PLAYER 1 WINS!");
		}
		
		if ((player1.equals(paper)) && (player2.equals(rock)))
		{
			System.out.println("PLAYER 1 WINS!");
		}
		
		if ((player1.equals(scissors)) && (player2.equals(paper)))
		{
			System.out.println("PLAYER 1 WINS!");
		}
		
		if ((player1.equals(paper)) && (player2.equals(scissors)))
		{
			System.out.println("PLAYER 2 WINS!");
		}
		
		if ((player1.equals(rock)) && (player2.equals(paper)))
		{
			System.out.println("PLAYER 2 WINS!");
		}
		
		if ((player1.equals(scissors)) && (player2.equals(rock)))
		{
			System.out.println("PLAYER 2 WINS!");
		}
		
		if (player1.equals(player2))
		{
			System.out.println("IT'S A TIE!");
		}
	}

}

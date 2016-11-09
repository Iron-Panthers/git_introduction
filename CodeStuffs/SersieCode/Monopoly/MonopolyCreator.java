import java.util.Scanner;
import java.lang.Math;
public class MonopolyCreator
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Monopoly.");
		Board board = new Board();
		Die die = new Die(0,0);
		boolean over = false; 
		int[] bals = {200,200,200};

		while(over == false)
		{
			bals = board.execute(die.rollDie(), 1, bals[0], bals[1], bals[2]);
			bals = board.execute(die.rollDie(), 2, bals[0], bals[1], bals[2]);
			bals = board.execute(die.rollDie(), 3, bals[0], bals[1], bals[2]);
	
			int count = 0;
			int winner = 0;

			for (int a = 0; a < 3; a++) 
			{
				if(bals[a] <= 0)
				{
					count++;
				}
				else
				{
					winner = a;
				}
			}
			if(count == 2)
			{
				System.out.println("Player " + winner + " is the winner!");
				over = true; 
			}
		}
	}
}
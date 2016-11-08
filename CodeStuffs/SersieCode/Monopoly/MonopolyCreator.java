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
		int[] bals = new int[3];

		while(over == false)
		{
			
			bals = board.execute(die.rollDie(), board.player1, bals[0], bals[1], bals[2]);
			bals = board.execute(die.rollDie(), board.player2, bals[0], bals[1], bals[2]);
			bals = board.execute(die.rollDie(), board.player3, bals[0], bals[1], bals[2]);
		}
	}
	/* takes care of creating all the other classes
	manages actions:
		-asks user for input
	*/
}
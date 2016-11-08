import java.util.Scanner;
public class Monopoly
{
	public static void main(String[] args)
	{
		Property p = new Property();
		Die d1 = new Die();
		Board b1 = new Board();
		Player p1 = new Player(1, 0, 200);
		Player p2 = new Player(2, 0, 200);
		Scanner sc = new Scanner(System.in);
		boolean playing = true;
		while(playing)
		{
			int spaces = d1.rollValue();
			System.out.println("Player 1 moved " + spaces + " steps");
			p1.movePlayer(spaces, b1);
			System.out.println("You are on " + b1.properties[p1.getposition()].name);
			sc.next();
			System.out.println("Price: " + b1.properties[p1.getposition()].price);
			System.out.println("Rent: " + b1.properties[p1.getposition()].rent);

			System.out.println("Player 2 moved " + spaces + "steps");
			System.out.println("You are on " + b1.properties[p2.getposition()].name);
		}
	}
}
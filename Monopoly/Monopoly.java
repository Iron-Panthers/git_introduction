import java.util.Scanner;
public class Monopoly
{
	public static void main(String[] args)
	{
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
			p1.movePlayer(spaces, b1, d1);
			System.out.println("You have " + p1.getMoney() + " dollars");
			System.out.println("You are on " + b1.properties[p1.getPosition()].name);
			System.out.println("Price: " + b1.properties[p1.getPosition()].price);
			System.out.println("Rent: " + b1.properties[p1.getPosition()].rent);
			if(b1.properties[p1.getPosition()].owner == p1.getOwner())
			{
				System.out.println("You already own this unit.");
			}
			else if(b1.properties[p1.getPosition()].owner == 0)
			{
				System.out.println("Would you like to buy this unit?");
				String yesno1 = sc.nextLine();
				if (yesno1.equals("Yes"))
				{
					p1.buyProperty(b1);
				}
			}
			else if(b1.properties[p1.getPosition()].owner == 2)
			{
				System.out.println("This unit is owned by the other player. You must pay " + b1.properties[p1.getPosition()].rent + " dollars.");
				p1.payRent(b1);
				p2.gainRent();
				if(p1.getPosition() == 3)
				{
					System.out.println("Baneling exploded. It is now free to buy.");
				}
			}
			System.out.println("Player 2 moved " + spaces + " steps");
			p2.movePlayer(spaces, b1, d1);
			System.out.println("You have " + p2.getMoney() + " dollars");
			System.out.println("You are on " + b1.properties[p2.getPosition()].name);
			System.out.println("Price: " + b1.properties[p2.getPosition()].price);
			System.out.println("Rent: " + b1.properties[p2.getPosition()].rent);
			if(b1.properties[p2.getPosition()].owner == p2.getOwner())
			{
				System.out.println("You already own this unit.");
			}
			else if(b1.properties[p2.getPosition()].owner == 0)
			{
				System.out.println("Would you like to buy this unit?");
				String yesno1 = sc.nextLine();
				if (yesno1.equals("Yes"))
				{
					p2.buyProperty(b1);
				}
			}
			else if(b1.properties[p2.getPosition()].owner == 2)
			{
				System.out.println("This unit is owned by the other player. You must pay " + b1.properties[p1.getPosition()].rent + " dollars.");
				p2.payRent(b1);
				p1.gainRent();
				if(p2.getPosition() == 3)
				{
					System.out.println("Baneling exploded. It is now free to buy.");
				}
			}
		}
	}
}
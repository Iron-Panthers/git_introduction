import java.util.Scanner;
public class Board
{

	Property[] list = new Property[20];
	int player1;
	int player2;
	int player3;

	public Board() 
	{
		list[0] = new Property("Daniel's Dam Ducks", 0, 75, 8);
		list[1] = new Property("Adam's Apple Auction", 0, 80, 10);
		list[2] = new Property("Leland's Loopy Laxitives", 0, 90, 13);
		list[3] = new Property("Isabel's Irresistable Ice", 0, 85, 11);
		list[4] = new Property("Max's Mad Mops", 0, 50, 6);
		list[5] = new Property("Justin's Jacked Jail", 0, 60, 7);
		list[6] = new Property("Ryan's Russian Routlette", 0, 40, 4);
		list[7] = new Property("Tiffany's Terrific Toys", 0, 95, 14);
		list[8] = new Property("Kim's Krusty Kmart", 0, 20, 2);
		list[9] = new Property("Emily's Erotic Enamel", 0, 55, 7);
		list[10] = new Property("Mona's Majestic Monkeys", 0, 70, 8);
		list[11] = new Property("Grace's Galant", 0, 75, 9);
		list[12] = new Property("Austin's Angry Art", 0, 65, 8);
		list[13] = new Property("Stella's Sterotypical Serfdom", 0, 55, 4);
		list[14] = new Property("Rory's Rad Roofies", 0, 45, 3);
		list[15] = new Property("Erina's Edgy Elephants", 0, 80, 10);
		list[16] = new Property("Charmaine's Classic Cats", 0, 65, 5);
		list[17] = new Property("David's Dank Dolls", 0, 35, 4);
		list[18] = new Property("Wayne's Whimsical Waffles", 0, 55, 6);
		list[19] = new Property("Jerry's Jiggly Jello", 0, 25, 3);
		list[20] = new Property("Ariana's Anxious Angles", 0, 75, 8);
		player1 = -1;
		player2 = -1;
		player3 = -1;
	}	
	public void execute(int dieRoll, int player, int bal1, int bal2, int bal3)
	{
		Scanner in = new Scanner(System.in);

		//player 1
		if (player == 1) {
			if (bal1 <= 0)
			{
				return;
			}
			player1 += dieRoll;
			if (player1 > 20) {
				player1 -= 21;
			}
			System.out.println(bal1);
			if (list[player1].getOwner() == 1) 
			{
				System.out.println("You already own this property!");
				return;
			}
			if (list[player1].getOwner() == 2) 
			{
				bal1 -= list[player1].getRent();
				bal2 += list[player1].getRent();
			}
			if (list[player1].getOwner() == 3) 
			{
				bal1 -= list[player1].getRent();
				bal3 += list[player1].getRent();
			}
			if (bal1 <= 0)
			{
				for (int r = 0; r < list.length; r++) 
				{
					if(list[r].getOwner() == 1)
					{
						list[r].setOwner(0);
					}
				}
				return;
			}
			if (list[player1].getOwner() == 0) 
			{
				System.out.println("Would you like to buy " + list[player1].getName() + "? It costs " + list[player1].getPrice() + ".");
				if (in.next().equals("Yes")) 
				{
					if(bal1 >= list[player1].getPrice())
					{
						list[player1].setOwner(1);
						System.out.println("You are now the owner of " + list[player1].getName() + " . Congradulations!");

					}
					else
					{
						System.out.println("You do not have enough money to buy this property, you only have " + bal1 + ".");
					}
				}
				else
				{
					return;
				}
			}
		}

		//player 2
		if (player == 2) 
		{
			if (bal2 <= 0)
			{
				return;
			}
			player2 += dieRoll;
			if (player2 > 20) 
			{
				player2 -= 21;
			}
			System.out.println(bal2);
			if (list[player2].getOwner() == 2) 
			{
				System.out.println("You already own this property!");
				return;
			}
			if (list[player2].getOwner() == 3) 
			{
				bal2 -= list[player2].getRent();
				bal3 += list[player2].getRent();
			}
			if (list[player2].getOwner() == 1) 
			{
				bal2 -= list[player2].getRent();
				bal1 += list[player2].getRent();
			}
			if (bal2 <= 0)
			{
				for (int r = 0; r < list.length; r++) 
				{
					if(list[r].getOwner() == 1)
					{
						list[r].setOwner(0);
					}
				}
				return;
			}
			if (list[player2].getOwner() == 0) 
			{
				System.out.println("Would you like to buy " + list[player2].getName() + "? It costs " + list[player2].getPrice() + ".");
				if (in.next().equals("Yes")) 
				{
					if(bal2 >= list[player2].getPrice())
					{
						list[player2].setOwner(2);
						System.out.println("You are now the owner of " + list[player2].getName() + " . Congradulations!");
					}
					else
					{
						System.out.println("You do not have enough money to buy this property, you only have " + bal2 + ".");
					}
				}
				else
				{
					return;
				}
			}
			
		}

		//player 3
		if (player == 3) 
		{
			if (bal1 <= 0)
			{
				return;
			}
			player3 += dieRoll;
			if (player3 > 20) 
			{
				player3 -= 21;
			}
			System.out.println(bal1);
			if (list[player3].getOwner() == 3) 
			{
				System.out.println("You already own this property!");
				return;
			}
			if (list[player3].getOwner() == 2) 
			{
				bal3 -= list[player3].getRent();
				bal2 += list[player3].getRent();
			}
			if (list[player3].getOwner() == 1) 
			{
				bal3 -= list[player3].getRent();
				bal1 += list[player3].getRent();
			}
			if (bal1 <= 0)
			{
				for (int r = 0; r < list.length; r++) 
				{
					if(list[r].getOwner() == 1)
					{
						list[r].setOwner(0);
					}
				}
				return;
			}
			if (list[player3].getOwner() == 0) 
			{
				System.out.println("Would you like to buy " + list[player3].getName() + "? It costs " + list[player3].getPrice() + ".");
				if (in.next().equals("Yes")) 
				{
					if(bal3 >= list[player3].getPrice())
					{
						list[player3].setOwner(3);
						System.out.println("You are now the owner of " + list[player3].getName() + " . Congradulations!");
					}
					else
					{
						System.out.println("You do not have enough money to buy this property, you only have " + bal3 + ".");
					}
				}
				else
				{
					return;
				}
			}
			
		}
	}
}
import java.util.Scanner;
public class Board
{

	Property[] list = new Property[21];
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
		list[11] = new Property("Grace's Great Goggles", 0, 75, 9);
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
	public int[] execute(int dieRoll, int player, int bal1, int bal2, int bal3)
	{
		Scanner in = new Scanner(System.in);
		int[] balances = {bal1, bal2, bal3};

		//player 1
		if (player == 1) 
		{
			System.out.println("\n\tIt is now Player 1's turn.");
			if (bal1 <= 0)
			{
				return balances;
			}
			player1 += dieRoll;
			System.out.println("\nYou have moved " + dieRoll + " spots.");
			if (player1 > 20) 
			{
				player1 -= 21;
				balances[0] += 200;
			}
			System.out.println("Balance: " + bal1 + " dollars");
			if (list[player1].getOwner() == 1) 
			{
				System.out.println("\nYou already own this property!");
				return balances;
			}
			if (list[player1].getOwner() == 2) 
			{
				System.out.println("\nThe Rent costs " + list[player1].getRent() + " dollars.");
				bal1 -= list[player1].getRent();
				bal2 += list[player1].getRent();
			}
			if (list[player1].getOwner() == 3) 
			{
				System.out.println("\nThe Rent costs " + list[player1].getRent() + " dollars.");
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
				return balances;
			}
			if (list[player1].getOwner() == 0) 
			{
				System.out.println("\nWould you like to buy " + list[player1].getName() + "? It costs " + list[player1].getPrice() + " dollars. Say Yes or No.");
				if (in.nextLine().equals("Yes")) 
				{
					if(bals >= list[player1].getPrice())
					{
						list[player1].setOwner(1);
						System.out.println("\nYou are now the owner of " + list[player1].getName() + ". Congratulations!");
						bals[0] = bal[0] - list[player1].getPrice();
					}
					else
					{
						System.out.println("\nYou do not have enough money to buy this property, you only have " + bal1 + " dollars.");
					}
				}
				else
				{
					return balances;
				}
			}
			System.out.println("Balance: " + bal1 + " dollars");
			return balances;
		}

		//player 2
		if (player == 2) 
		{
			System.out.println("\n\tIt is now Player 2's turn.");
			if (bal2 <= 0)
			{
				return balances;
			}
			player2 += dieRoll;
			System.out.println("\nYou have moved " + dieRoll + " spots.");
			if (player2 > 20) 
			{
				player2 -= 21;
				balances[0] += 200;
			}
			System.out.println("Balance: " + bal2 + " dollars");
			if (list[player2].getOwner() == 2) 
			{
				System.out.println("\nYou already own this property!");
				return balances;
			}
			if (list[player2].getOwner() == 3) 
			{
				System.out.println("\nThe Rent costs " + list[player2].getRent() + " dollars.");
				bal2 -= list[player2].getRent();
				bal3 += list[player2].getRent();
			}
			if (list[player2].getOwner() == 1) 
			{
				System.out.println("\nThe Rent costs " + list[player2].getRent() + " dollars.");
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
				return balances;
			}
			if (list[player2].getOwner() == 0) 
			{
				System.out.println("\nWould you like to buy " + list[player2].getName() + "? It costs " + list[player2].getPrice() + " dollars. Say Yes or No.");
				if (in.nextLine().equals("Yes")) 
				{
					if(bal2 >= list[player2].getPrice())
					{
						list[player2].setOwner(2);
						System.out.println("\nYou are now the owner of " + list[player2].getName() + ". Congratulations!");
						bals[1] = bals[1] - list[player2].getPrice();
					}
					else
					{
						System.out.println("\nYou do not have enough money to buy this property, you only have " + bal2 + " dollars.");
					}
				}
				else
				{
					return balances;
				}
			}
			System.out.println("Balance: " + bal2 + " dollars");
			return balances;
		}

		//player 3
		if (player == 3) 
		{
			System.out.println("\n\tIt is now Player 3's turn.");
			if (bal1 <= 0)
			{
				return balances;
			}
			player3 += dieRoll;
			System.out.println("\nYou have moved " + dieRoll + " spots.");
			if (player3 > 20) 
			{
				player3 -= 21;
				balances[0] += 200;
			}
			System.out.println("Balance: " + bal3 + " dollars");
			if (list[player3].getOwner() == 3) 
			{
				System.out.println("\nYou already own this property!");
				return balances;
			}
			if (list[player3].getOwner() == 2) 
			{
				System.out.println("\nThe Rent costs " + list[player3].getRent() + " dollars.");
				bal3 -= list[player3].getRent();
				bal2 += list[player3].getRent();
			}
			if (list[player3].getOwner() == 1) 
			{
				System.out.println("\nThe Rent costs " + list[player3].getRent() + " dollars.");
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
				return balances;
			}
			if (list[player3].getOwner() == 0) 
			{
				System.out.println("\nWould you like to buy " + list[player3].getName() + "? It costs " + list[player3].getPrice() + " dollars. Say Yes or No.");
				if (in.nextLine().equals("Yes")) 
				{
					if(bal3 >= list[player3].getPrice())
					{
						list[player3].setOwner(3);
						System.out.println("\nYou are now the owner of " + list[player3].getName() + ". Congratulations!");
						bals[2] = bals[2] - list[player3].getPrice();
					}
					else
					{
						System.out.println("\nYou do not have enough money to buy this property, you only have " + bal3 + " dollars.");
					}
				}
				else
				{
					return balances;
				}
			}
			System.out.println("Balance: " + bal3 + " dollars");
			return balances;
		}
		return balances;
	}
}
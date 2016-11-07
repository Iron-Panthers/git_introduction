import java.util.Scanner;
import java.lang.Math;
public class war
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		String rep = "Yes";
		int times = 10;

		while(rep.equals("Yes") || rep.equals("yes"))
		{
			int humanwins = 0;
			int compwins = 0;
			int ties = 0;
			int x = 0;
			int y = 0;

			int[] humandek = new int[times];
			for (x = 0; x < times; x++) 
			{
				boolean inDek = true;
				int human = 0;
				while(inDek)
				{
					human = (int) (Math.random()* 20 + 1);
					inDek = false;
					for(int q = 0; q < x; q++)
					{
						if (human == humandek[q]) 
						{
							inDek = true;
							break;
						}
					}
				}
				humandek[x] = human;
			}
			int[] compdek = new int[times];
			for (y = 0; y < times; y++) 
			{
				boolean inDek = true;
				int comp = 0; 
				while(inDek)
				{
					comp = (int) (Math.random()* 20 + 1);
					inDek = false;
					for(int w = 0; w < y; w++)
					{
						if(comp == compdek[w])
						{
							inDek = true;
							break;
						}
					}
				}
				compdek[y] = comp;
			}

			for (int z = 0; z < times; z++) 
			{
				System.out.println("The computer had a number of " + compdek[z]);
				System.out.println("The human had a number of " + humandek[z]);
				if(humandek[z] > compdek[z])
				{	
					System.out.println("The human won.");				
					humanwins = humanwins + 1;
				}
				else if(compdek[z] > humandek[z])
				{
					System.out.println("The computer won.");
					compwins = compwins + 1;
				}
				else if(compdek[z] == humandek[z])
				{
					System.out.println("It was a tie.");
					ties = ties + 1;
				}
			}

			
			System.out.println("The Computer won " + compwins + " rounds.");
			System.out.println("The Human won " + humanwins + " rounds.");
			System.out.println("The Computer had a win percentage of " + (compwins/20.00 * 100));
			System.out.println("The Human had a win percentage of " + (humanwins/20.00 * 100));
			System.out.println("There were " + ties + " ties.");
			if(humanwins > compwins)
			{
				System.out.println("The Human has won.");
			}
			else if(compwins > humanwins)
			{
				System.out.println("The Computer has won.");
			}
			else if(compwins == humanwins)
			{
				System.out.println("Tie Game Loser, ur trash at RNG. Go pray to RNGesus some more.");
			}
			

			System.out.println("Play again? Yes or No?");
			rep = in.next();
		}
	}
}
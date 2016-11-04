import java.util.Scanner;
import java.lang.Math;
public class morearrays

{
	public static void main (String args[])
	{	
		Scanner in = new Scanner(System.in);

		int x = 0; 
		int a = 0;
		int humanwins = 0;
		int compwins = 0;
		int ties = 0;
		
		String y = "Yes";
		while(y.equals("Yes"))

		int[] human = new int[10];
		System.out.println("The Human's numbers:");
		for(x = 0; x < human.length; x++)
		{
			int y = (int) (Math.random()*21);
			human[x] = y;
			System.out.println(human[x]);
		}

		int[] comp = new int[10];
		System.out.println("The Computer's numbers:");
		for(a = 0; a <comp.length; a++)
		{
			int b = (int) (Math.random()*21);
			comp[a] = b;
			System.out.println(comp[a]);
		}

		{
			for (int c = 1; c <= 20; c++) 
			{
				System.out.println("The computer had a number of " + comp);
				System.out.println("The human had a number of " + human);
				if(human > comp)
				{	
					System.out.println("The human won.");				
					humanwins = humanwins + 1;
				}
				else if(comp > human)
				{
					System.out.println("The computer won.");
					compwins = compwins + 1;
				}
				else if(comp == human)
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
			y = in.next();
		}
	}
}
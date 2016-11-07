import java.util.Scanner;
import java.lang.Math;
public class winrate
{	
	public static void main(String args[])
	{	
		int winz = 0;

		for(int x = 0; x < 20; x++)
		{
			int willtheywin = (int)(Math.random()* 100 + 1);

			if(willtheywin <= 10)
			{
				System.out.println("I mean.. you're Korean");
				winz = winz + 1;
			}
			else
			{
				System.out.println("you just lost to albus????");
			}

		}

		System.out.println("You won " + winz + " games out of 20");


	}
}




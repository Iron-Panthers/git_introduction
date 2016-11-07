import java.util.Scanner;
import java.lang.Math;
public class Guessing
{
	public static void main(String args[])

	{
		int x = (int) (Math.random() * 20 + 1);
		Scanner in = new Scanner(System.in);
		System.out.println("Guess a number.");
		int y = 0;
		{
			while(y<5)
			{
				int sux = in.nextInt();

				if(sux == x)
				{
					System.out.println("nice!");
				}
				else if(sux != x)
				{
					System.out.println("wrong!");
				}
				y ++ ;
			}

			System.out.println(x);
		}
	}

}






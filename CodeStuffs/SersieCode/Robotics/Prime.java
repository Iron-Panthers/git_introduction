import java.util.Scanner;
import java.lang.Math;
public class Prime
{	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in 10 numbers." );
		int ask = 0;
		int x = 0;
		boolean isPrime = true;

		while(ask < 10)
		{
			x = in.nextInt();
			int z = 2;
			ask++;
			while(z < x)
			{
				if(x%z == 0)
				{
					System.out.println("This is a not a prime number.");
					isPrime = false;
					break;
				}
				else
				{
					isPrime = true;
				}
				z++; 

			}
			if(isPrime)
			{
				System.out.println("This is a prime number.");
			}

		}






	}
}




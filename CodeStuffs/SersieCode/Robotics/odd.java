import java.util.Scanner;
import java.lang.Math;
public class odd
{
	public static void main(String args[])
	{
		int x = (int) (Math.random() * -101);
		int negative = (int) (Math.random() * 2);
		if (negative == 1) 
		{
			x = -1 * x;
		}

		System.out.println(x);

		if(x%2 == 0)
		{
			System.out.println("This number is even.");
		}
		else if(x%2 != 0)
		{
			System.out.println("This number is odd.");
		}
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

}




import java.util.Scanner;
import java.lang.Math;
public class SquareRoot
{	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double x = in.nextInt();
		{
			if(x%2 == 0)
			{
				System.out.println("even");
			}
			else if(x%2 != 0);
			{
				System.out.println("odd");
			}
		}
		x = Math.sqrt(x);
		System.out.println(x);
		{
			if(x%5 == 0)
			{
				System.out.println("Your variable is divisable by 5");
			}
			else if(x%5 != 0)
			{
				System.out.println("Your variable is not divisable by 5");
			}

			if(x%3 == 0)
			{
				System.out.println("Your variable is divisable by 3");
			}
			else if(x%3 != 0)
			{
				System.out.println("Your variable is not divisable by 3");
			}
		
		}
	
	}


}




 
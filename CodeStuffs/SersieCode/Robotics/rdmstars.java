import java.util.Scanner;
import java.lang.Math;
public class rdmstars
{
	public static void main(String args[])

	{
		int y = 0;
		int sum = 0;


		while(y <= 5)
		{
			int x = (int) (Math.random() * 10 + 1);

			y++;
			sum = sum + (x + 1);

			for(int b = 1; b <= x; b++)
			{
				System.out.print("*");
			}
			for (int c = 0; c <= (11-x); c++)
			{
				System.out.print(" ");	
			}
			System.out.println(x);
		
		}
		System.out.println(sum/6.00);



	}
}
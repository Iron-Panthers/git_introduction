import java.util.Scanner;
import java.lang.Math;
public class Dad
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What is day of the month is it?");
		String date = in.next();
		if(date.equals("18"))
		{
			System.out.println("Happy Birthday Dad!");
			System.out.println();
			System.out.println(" **** **** ");
			int stars = 11;
			int origStars = stars;
			
			for(int x = 0; x < 4; x++) 
			{
				for (int left = 0; left < (stars-1)/2; left++)
				{
					System.out.print("*");
				}
				System.out.print("*");
				for (int right = 0; right < (stars-1)/2; right++)
				{
					System.out.print("*");
				}
				System.out.println();

				for (int spaces = 0; spaces < ((-stars/2) + (origStars/2 + 1)); spaces++) 
				{
					System.out.print(" ");
				}
				stars -= 2;
			}
			System.out.println("***");
			System.out.print("     *");
		}
	}
}

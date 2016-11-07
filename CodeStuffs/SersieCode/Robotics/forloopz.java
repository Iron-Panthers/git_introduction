import java.util.Scanner;
import java.lang.Math;
public class forloopz
{	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int guesses = (int)(Math.random()* 30 + 1);
		int guess = (int) (Math.random() * 100 + 1);
		System.out.println("Give me a number from 1-100.");

		for (int a = 1; a <= guesses; a++) 
		{
			int b = in.nextInt();

			if(b > guess)
			{
				System.out.println("You guessed too high.");
			}
			else if(b < guess)
			{
				System.out.println("You guessed too low.");
			}
			else if(b == guess)
			{
				System.out.println("Your guessed correctly!");
				break;
			}
			System.out.println("You have " + (guesses - a) + " guesses left.");
		}





	}
}




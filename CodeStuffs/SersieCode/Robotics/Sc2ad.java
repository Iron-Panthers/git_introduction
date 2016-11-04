import java.util.Scanner;
import java.lang.Math;
public class Sc2ad
{	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int guesses = 10;
		System.out.println("Guess a number between 1 and a 100, you have " + guesses + " tries." );
		int y = (int) (Math.random() * 100 + 1);
		
		{
			while(guesses > 0)
			{
				int sux = in.nextInt();

				if(sux == y)
				{
					System.out.println("You guessed correctly!");
					break;
				}
				if(guesses == 1)
				{
					System.out.println("You are out of guesses!");
					break;
				}
				else if(sux < y)
				{
					System.out.println("Guess again, you guessed too low.");
				}
				else if(sux > y)
				{
					System.out.println("Guess again, you guessed too high.");
				}
				guesses -- ;


			System.out.println("You have " + guesses + " guesses left. ");
			
			}


		}


  	}
}








//Creates the Board object and all the players. 
//Handles turns and victory conditions, as well as rolling of die

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		boolean gameLoop = true;
		while (gameLoop) {

			int numDoubles = 0;
			boolean canRoll = true;
			while (canRoll) {

				Scanner ui = new Scanner(System.in);
				Die die = new Die();

				System.out.println("Type anything to roll the die!");
				ui.nextLine();

				int roll1 = die.getRoll();
				int roll2 = die.getRoll2();

				System.out.println(roll1); 
				System.out.println(roll2);

				int dieSum = roll1 + roll2;
				System.out.println("You got " + dieSum + "!");

					if (roll1 == roll2) {

			     		System.out.println("You rolled doubles!  Go again!");
			     		ui.nextLine();

			     		System.out.println(die.getRoll());
			     		System.out.println(die.getRoll2());

			     		numDoubles += 1;
			     		
					} else {
						canRoll = false;
					} 
					
					if (numDoubles == 3) {
						System.out.println("Three doubles!  Go to jail!");
						canRoll = false;
					} 
				}
			}
		}
	}
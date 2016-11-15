import java.util.Scanner;

public class Monopoly {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Board board = new Board();
		int turn = 0;
		boolean isBankrupt = false;
		if (numPlayers != 1) {
			isBankrupt = false;
		}
		else {
			isBankrupt = true;
		}
		
		System.out.println("How many players?");
		Scanner input = new Scanner(System.in);
		int numPlayers = input.nextInt();
		Player[] players = new Player[numPlayers];
		for (int i = 0; i < numPlayers; i++) {
			players[i] = new Player("Player" + (i + 1));
		}
		while (isBankrupt = false) {
			for (turn; turn < numPlayers; turn++) {
				cPlayer = players[turn]
				System.out.println("Current player: " + players[turn].name);
				System.out.println("Current Position: " + board.properties.get(cPlayer.position));
				System.out.println(cPlayer.name + "what would you like to do? \nMove   End Turn");
				String answer = input.nextLine();
				if (answer.toLowerCase().equals("move")) {
					cPlayer.move();
				}
				else if (answer.toLowerCase().equals("end turn")) {
					turn++;
				}
				else {
					System.out.println("That's that a valid option.");
				}
				if (cPlayer.isDouble == true) {
					System.out.println("You rolled a double.");
					cPlayer.move();	
				}
			}
		}
	}
}
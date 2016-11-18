import java.util.Scanner;

public class Monopoly {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Board board = new Board();
		boolean isBankrupt = false;
		
		System.out.println("How many players?");
		int numPlayers = input.nextInt();
		Player[] players = new Player[numPlayers];
		for (int i = 0; i < numPlayers; i++) {
			players[i] = new Player("Player" + (i + 1));
		}
		if (numPlayers != 1) {
			isBankrupt = false;
		}
		else {
			isBankrupt = true;
		}
		
		while (isBankrupt == false) {
			for (int turn = 0; turn < numPlayers; turn++) {
				Player cPlayer = players[turn];
				System.out.println("Current player: " + cPlayer.name);
				//System.out.println(board.properties.get(cPlayer.position));
				System.out.println("Current Position: " + board.properties.get(cPlayer.position));
				System.out.println(cPlayer.name + ", what would you like to do? \nMove   End Turn");
				String bogus = input.next();
				String answer = input.nextLine();
				if (bogus.toLowerCase().equalsIgnoreCase("move")) {
					while (cPlayer.isInJail == false && cPlayer.doubles < 3) {
						cPlayer.move();
						System.out.println("Current Position: " + board.properties.get(cPlayer.position));
						
						if (cPlayer.properties.contains(board.properties.get(cPlayer.position)) == false) {
							
							if (board.properties.get(cPlayer.position).isOwned == false) {
								cPlayer.properties.add(board.properties.get(cPlayer.position));
								cPlayer.dollars -= board.properties.get(cPlayer.position).pvalue;
								board.properties.get(cPlayer.position).isOwned = true;
							}
							else if (board.properties.get(cPlayer.position).isOwned == true){
								cPlayer.dollars -= board.properties.get(cPlayer.position).rent;
								for (int i = 0; i < numPlayers; i++) {
									if (players[i].properties.contains(board.properties.get(cPlayer.position))) {
										players[i].dollars += board.properties.get(cPlayer.position.rent);
									}
								}
								
							}
							
							
						}
						
						//System.out.println(board.properties.get(cPlayer.position));
						if (cPlayer.isDouble == true) {
							System.out.println("You rolled a double.");
						}
						else {
							break;
						}
					}
				}
				else if (bogus.toLowerCase().equalsIgnoreCase("end turn")) {
					turn++;
				}
				else {
					System.out.println("That's not a valid option.");
				}
			}
		}
	}
}
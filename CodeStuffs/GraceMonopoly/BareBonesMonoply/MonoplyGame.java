import java.util.ArrayList;
import java.util.Scanner;

public class MonoplyGame {

	private static ArrayList<Player> activePlayers;
	private static Board theBoard;
	private static Scanner playerInput = new Scanner(System.in);
	
	public static Scanner getPlayerInput() {
		return playerInput;
	}
	
	
	public static void takeTurn(Player player) {
		
		// first, player rolls dice
		
		int dieRoll = Die.roll(2);
		
		
		int currentInput;
		
		System.out.println("\n" + player.getName() + " rolls two die for a total of: " + dieRoll);
		
		// player moves
		
		theBoard.movePlayer(player, dieRoll);
		
		// player either gets to (choose to buy) or (doesn't buy) or (doesn't buy and pays rent)
		
		if (player.getLocation().getOwner() == null) {
			System.out.println(player.getLocation().getName() + " isn't owned. Do you want to buy it?: Enter 1 for Yes and 2 for No");
			currentInput = Integer.parseInt(playerInput.nextLine());
			
			if (currentInput == 1 ) {
				theBoard.purchaseProperty(player, player.getLocation() );
				
			}
		} else {
			if (!player.getLocation().getIsMortgaged()) {
				// if the user can't pay rent even after mortgaging
				
				if (!theBoard.payRent(player, player.getLocation().getOwner(), player.getLocation().getCurrentRent() )) {
					System.out.println(player.getName() + " can't pay their rent. It's game over for " + player.getName() + ".");
					activePlayers.remove(player);
				} // end inner if
			} // end outer if
		} // end elses		
	} // end takeTurn
	
	
	
	public static void populateBoard() {
		
		Property[] properties = new Property[40]; // normally you'd read this kind of info in from a file, but I'm just going to hardcode it here
		// I'm just going to generate some arbitrary values to populate list - for the actual game you'd want to manually add each of these,
		// or read them off a support file
		Property currentProperty;
		for (int x = 0; x < 40; x++) {
			currentProperty = new Property(("property " + x), 50 + (int)(Math.random() * 250), 100 + (int)(Math.random() * 300), new int[]{(int)(Math.random() * 100),
					                        50 + (int)(Math.random() * 100), 100 + (int)(Math.random() * 100), 150 + (int)(Math.random() * 100),
					                        200 + (int)(Math.random() * 100), 250 + (int)(Math.random() * 100) } );
		
			properties[x] = currentProperty;
			
		} // end for
		
		
		theBoard = new Board(properties);
	} // end populateBoard
	

	public static int startingPlayer(int numPlayers) {
		return (int)(Math.random() * numPlayers);
		
	}
	
	public static void gameSetup() {
		activePlayers = new ArrayList<Player>();	
		populateBoard();
		int numPlayers;
		System.out.println("Enter the number of players: ");
		numPlayers = Integer.parseInt(playerInput.nextLine());
		
		Player currentPlayer;
		String currentInput;
		
		
		
		for (int x = 1; x <= numPlayers; x++) {
			System.out.println("Enter the name of the " + x +  " player: ");
			currentInput = playerInput.nextLine();
			currentPlayer = new Player(currentInput);
			currentPlayer.setLocation(theBoard.getProperties()[0]);
			activePlayers.add(currentPlayer);
		}
		
	}
		
	public static void main(String[] args) {
			
		gameSetup();
		
		if (activePlayers.size() > 1) {
			
			int firstPlayerIndex = startingPlayer(activePlayers.size());
			int counter = 0;
			System.out.println(activePlayers.get(firstPlayerIndex).getName() + " starts first.");
			while (activePlayers.size() > 1) { // this is where the game really starts
				
				takeTurn(activePlayers.get( (firstPlayerIndex + counter) % activePlayers.size() ) );
				counter += 1;
				
				
				
			 } // end outer while
		
			System.out.println(activePlayers.get(0).getName() + " wins! All the other players are bankrupt." + "Congratulations! ");
			
			
		
		} // end outer if
		
		
		playerInput.close();
		
	}	// end main
	
} // end class

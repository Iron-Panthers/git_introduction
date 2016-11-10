public class Monopoly {
	public static void main(String[] args) {
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
				cPlayer.move();
				System.out.println("Current Position: " + board.properties.get(cPlayer.position));
				System.out.println(cPlayer.name + "what would you like to do? + \n" );
			}
		}
	}
}
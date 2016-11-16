import java.util.ArrayList;

public class Game {
	
	public static void run(Board board, Player...player) {
		ArrayList<Player> players = new ArrayList<>();
		for(Player p: player) {
			players.add(p);
		}
		
		//main game loop
		
		while(true) {
			for(Player p: players) {
				System.out.println(String.format("it is player %s turn. they have %s", p.ID, p.money));
				if(p.money <= 0) {
					players.remove(p);
					if(players.size() == 1) {
						break;
					}
				} else {
					p.movePlayer(board);
					p.checkProperty(board);
					System.out.println();
				}
			}
			if(players.size() == 1) {
				System.out.println("player " + players.get(0).ID + " won!");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Board board = new Board();
		Player player1 = new Player(1, 0, 1000);
		Player player2 = new Player(2, 0, 1000);
		
		run(board, player1, player2);
	}
}

import java.util.*;
public class MonopolyMain {
	public static void main (String[] args) {
		Player player1 = new Player(1, 0, 1500);
		Player player2 = new Player(2, 0, 1500);
	
		Dice dice1 = new Dice();

		Scanner scan = new Scanner(System.in);
		MonopolyBoard board = new MonopolyBoard();

		while(true){
			
			System.out.println("Player 1 rolled a "  + dice1.rollDice());
			player1.movePlayer(board);
			
		}
	}
}
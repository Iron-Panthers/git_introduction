import java.util.*;
public class MonopolyMain {
	public static void main (String[] args) {
		Player player1 = new Player(1, 0, 1500);
		Player player2 = new Player(2, 0, 1500);
	
		Dice dice1 = new Dice();

		Scanner scan = new Scanner(System.in);
		MonopolyBoard board = new MonopolyBoard();
		boolean player1Turn = true;
		boolean player2Turn = false;
		String userInput;
		while(true){
			while(player1Turn == true) {
				
						System.out.println("Player 1 rolled a "  + dice1.rollDice());
						player1.movePlayer(board);
						if(board.propertyList[player1.playerPosition] == null) {
							System.out.println("Would you like to buy this property: Name: " + board.propertyList[player1.playerPosition].name + " Price:" + board.propertyList[player1.playerPosition].price);
							userInput = scan.nextLine();
							if(userInput.equals("yes")) {
									
								} else { 
									player1Turn = false;
									player2Turn = true;
									}
						} else if(board.propertyList[player1.playerPosition].owner == player1.playerNumber) {
							player1Turn = false;
							player2Turn = true;
						} else {
							System.out.println("You need to pay rent");
							player1.payRent();
							player2.getRent();
							}
								
					
				//board.propertyList[playerPosition].rent
			}

			while(player2Turn == true) {
				System.out.println("What would you like to do? (Type roll, mortgage)");
				userInput = scan.nextLine();
					if(userInput.equals("roll")) {
						System.out.println("Player 2 rolled a "  + dice1.rollDice());
						player2.movePlayer(board);
						if(board.propertyList[player2.playerPosition] == null) {
							System.out.println("Would you like to buy this property: Name:" + board.propertyList[player2.playerPosition].name + "Price:" + board.propertyList[player2.playerPosition].price);
							userInput = scan.nextLine();
							if(userInput.equals("yes")) {
									
								} else { 
									player2Turn = false;
									player1Turn = true;
									}
						} else if(board.propertyList[player2.playerPosition].owner == player2.playerNumber) {
							player2Turn = false;
							player1Turn = true;
						} else {
							System.out.println("You need to pay rent");
							player2.payRent();
							player1.getRent();
							}
								
					}	
				//board.propertyList[playerPosition].rent
			}

		}
	}
}
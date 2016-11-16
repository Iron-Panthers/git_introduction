public class Player {
	int playerPosition;
	int playerMoney;
	int playerNumber;

	public Player(int playerNumber, int playerPosition, int playerMoney) {
		this.playerNumber = playerNumber;
		this.playerPosition = playerPosition;
		this.playerMoney = playerMoney;

	}
	public void movePlayer(MonopolyBoard board) {
	int tilesMoved = (int) (Math.random() * 6) + 1;
	playerPosition += tilesMoved;
	if(playerPosition > board.propertyList.length -1) {
		playerPosition -= board.propertyList.length;
		playerMoney +=200;
	}
	}
}
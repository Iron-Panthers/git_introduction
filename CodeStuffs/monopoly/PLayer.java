public class Player {
	int playerPosition;
	int playerMoney;
	int playerNumber;

	public Player(int playerNumber, int playerPosition, int playerMoney) {
		this.playerNumber = playerNumber;
		this.playerPosition = playerPosition;
		this.playerMoney = playerMoney;
	
	}
	public void movePlayer(int playerPosition) {
		playerPosition += totalRoll;
	}
}
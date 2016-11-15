public class Dice {
	int dice1Roll;
	int dice2Roll;
	int totalRoll;

	public int rollDice() {
		dice1Roll = (int) Math.random() * 6 + 1;
		dice2Roll = (int) Math.random() * 6 + 1;
		totalRoll = dice1Roll + dice2Roll;
		return totalRoll;

	}

}
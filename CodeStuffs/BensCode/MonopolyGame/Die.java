public class Die {

	int diceRoll1;
	int diceRoll2; 

	public Die() {
		diceRoll1 = (int)(Math.random() * 6 + 1);
		diceRoll2 = (int)(Math.random() * 6 + 1);
	}

	public int getRoll() {
		return (int)(Math.random() * 6 + 1);
	}

	public int getRoll2() {
		return (int)(Math.random() * 6 + 1);
	}
}
public class Player {
	private int position;
	private String name;
	private boolean isInJail;
	private Dice d1;
	private Dice d2;
	private Board board;
	private boolean isDouble;
	private int doubles;
	
	public static void main(String[] args) {
		
	}
	public Player(String name) {
		Money dollars = new Money();
		boolean isDouble = false;
		int doubles = 0;
	}
	public void move() {
		int change = d1.roll + d2.roll;
		if (position < board.properties.size()) {
			position += change;
		}
		else {
			position = 0;
		}
		if (d1.roll == d2.roll) {
			isDouble = true;
			change = d1.roll + d2.roll;
			doubles += 1;
			isDouble = false;
		}
		if (doubles == 3) {
			double = 0;
		}
	}
}

public class Player {
	private int position;
	private String name;
	private boolean isInJail;
	private Dice d1;
	private Dice d1;
	private Board board;
	
	public static void main(String[] args) {
		
	}
	public Player(String name) {
		Money dollars = new Money();
	}
	public void move() {
		int doubles = 0;
		int change = d1.roll + d2.roll;
		if (position < board.properties.size()) {
			position += change;
		}
		else {
			position = 0;
		}
		
		
		if (d1.roll == d2.roll) {
			change = d1.roll + d2.roll;
			doubles += 1;
		}
		if (doubles == 3) {
			double = 0;
		}
	}
}

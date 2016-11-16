import java.util.ArrayList;

public class Player {
	public int position;
	public String name;
	public boolean isInJail;
	private Dice d1;
	private Dice d2;
	private Board board;
	public boolean isDouble;
	public int doubles;
	public Money dollars;
	public ArrayList properties;
	
	public static void main(String[] args) {
		
	}
	public Player(String name) {
		this.name = name;
		Money dollars = new Money();
		boolean isDouble = false;
		int doubles = 0;
		ArrayList<Property> ownProp = new ArrayList<Property>();
		isInJail = false;
	}
	public void move() {
		int change = this.d1.roll() + this.d2.roll();
		if (position < board.properties.size()) {
			position += change;
		}
		else {
			position = 0;
		}
		if (this.d1.roll() == this.d2.roll()) {
			isDouble = true;
			change = this.d1.roll() + this.d2.roll();
			doubles += 1;
			isDouble = false;
		}
		if (doubles == 3) {
			doubles = 0;
		}
	}
}


public class Dice {
	private int num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public Dice() {
		num = 0;
	}
	public int roll() {
		num = (int) Math.random() * 6 + 1;
		return num;
	}

}

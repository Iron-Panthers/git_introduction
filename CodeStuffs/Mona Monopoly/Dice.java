package october;

public class Dice {
	
	int result;
//dice does not have an owner
	public int roll(){
		//rolls random number 1-6
		result = (int) (Math.random() * 6 + 1);
		return result;
	}
}
import java.util.ArrayList;
import java.util.Scanner;


public class Board {
	public ArrayList properties;

	
	public static void main(String[] args) {
		//Create arraylist
		
	}
	public Board() {
		properties = new ArrayList<Property>();
		
		properties.add(new Property("Go", 0, 0, 0));
		properties.add(new Property("a", 100, 30, 10));
		properties.add(new Property("b", 100, 30, 10));
		properties.add(new Property("c", 125, 36, 12));
		properties.add(new Property("d", 150, 45, 15));
		properties.add(new Property("e", 150, 45, 15));
		properties.add(new Property("f", 175, 51, 17));
		properties.add(new Property("g", 200, 60, 20));
		properties.add(new Property("h", 200, 60, 20));
		properties.add(new Property("i", 225, 66, 22));
		properties.add(new Property("j", 250, 75, 25));
		properties.add(new Property("k", 250, 75, 25));
		properties.add(new Property("l", 275, 81, 27));
		properties.add(new Property("m", 300, 90, 30));
		properties.add(new Property("n", 300, 90, 30));
		properties.add(new Property("o", 325, 96, 32));
		properties.add(new Property("p", 350, 105, 35));
		properties.add(new Property("q", 350, 105, 35));
		properties.add(new Property("r", 375, 111, 37));
		properties.add(new Property("s", 400, 120, 40));
		properties.add(new Property("t", 400, 120, 40));
		properties.add(new Property("u", 425, 126, 42));
		properties.add(new Property("v", 450, 135, 45));
		properties.add(new Property("w", 450, 135, 45));
		properties.add(new Property("x", 475, 141, 47));
		properties.add(new Property("y", 550, 165, 55));
		properties.add(new Property("z", 550, 165, 55));
	}
}
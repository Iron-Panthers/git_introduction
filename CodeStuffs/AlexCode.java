import java.util.Scanner;

public class AlexCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().trim();
		if (input.equals("5000")) {
			System.out.println("you picked " + input);
		} else {
			System.out.println("thats the wrong number :(");
		}
	}
}
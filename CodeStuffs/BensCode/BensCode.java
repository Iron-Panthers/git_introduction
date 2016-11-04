import java.util.Scanner;

public class BensCode {
	public static void main(String[] args) {

		while (true) {

			Scanner ui = new Scanner(System.in);
			System.out.println("Please enter password.");
			int password = ui.nextInt();

			if (password == 5026) {
				System.out.println("You are now part of the BHS Iron Panthers!");
				break;
			} else {
				System.out.println("Wrong!  Try again!");
			}
		}
	}
}
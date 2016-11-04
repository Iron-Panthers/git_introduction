import java.util.Scanner;

public class MonasCode {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Adam's last name is always butchered.");
		System.out.println("Type your last name");
		String lastname = in.next();
		if (lastname.equals("Faham")){
			System.out.println("This last name is also butchered.");
		}
		else if (lastname.equals("Dominik")){
			System.out.println("This last name is also butchered.");
		}
		else {
			System.out.println("This last name is not butchered.");
		}
	}
}
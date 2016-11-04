import java.util.Scanner;

public class Adam
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Put in your name.");
		String name = in.next();
		if(name.equalsIgnoreCase("Adam"))
		{
			System.out.println("Fight me!!!");
		}
		else
		{
			System.out.println("Who is Robby?");
		}
	}
}
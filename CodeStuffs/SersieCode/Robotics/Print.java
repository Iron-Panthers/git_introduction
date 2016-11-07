import java.util.Scanner;

public class Print
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println("Do you want to subtract or add?");
		String str = in.next();
		String sub = "subtract";
		if(str.equals("add"))
		{
			System.out.println(x + y);
		}
		else
		{
			System.out.println(x - y);
		}
	
	}
}
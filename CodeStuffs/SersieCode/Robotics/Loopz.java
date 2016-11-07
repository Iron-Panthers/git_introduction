import java.util.Scanner;
import java.lang.Math;
public class Loopz
{	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int x = 1;
		int y = 0;
		System.out.println("Type in a number.");
		int z = in.nextInt();

		while(x <= z)
		{
			y= y+x;
			x++;
		}
		System.out.println(y);

		


	}
}


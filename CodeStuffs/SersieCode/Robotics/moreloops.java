import java.util.Scanner;
import java.lang.Math;
public class moreloops
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		int x = 0;
		int left = 0;
		int right = 0;
		int space = 0; 
		while(x <= 2)
		{
			x++;
			left = x;
			right = x;  
			space = 2*left-2;

			while(left <= 3)
			{
				System.out.print("*");
				left ++ ;

			}
			while(space > 0)
			{
				System.out.print(" ");
				space--;
			}
			while(right <= 3)
			{
				System.out.print("*");
				right++;
			}
			System.out.println();
		}

	}

}


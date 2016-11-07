import java.util.Scanner;

public class AdamSucks
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		while(x<=100)
		{
			if(x%2 == 0)
			{
				System.out.println(x);
			}

			x = (x + 1);

		}
	
	}


}
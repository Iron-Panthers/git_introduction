import java.util.Scanner;
import java.lang.Math;
public class Array

{
	public static void main (String args[])
	{	
		Scanner in = new Scanner(System.in);

		int x = 0;

		int[] cactus = new int[60];
		for(x = 0; x < cactus.length; x++)
		{
			cactus[x] = x;
		}

		
		for(int index = 0; index < cactus.length; index++)
		{
			System.out.println(cactus[index]);
			cactus[index] = index;
		}
		
	}
}
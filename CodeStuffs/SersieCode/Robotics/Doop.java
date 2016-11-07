import java.lang.Math;
public class Doop
{
	public static void main (String args[])
	{
		int a = 10;

		int[] arr = new int[a];
		for(int i = 0; i < a ; i++) 
		{
			// Add a for loop that goes through all the PREVIOUS values of the array
			boolean die = false;
			while(!die)
			{
				arr[i] = (int) (Math.random()* 20 + 1);
				for (int b = 0; b < i; b++) 
				{
					if (arr[b] == arr[i]) 
					{
						die = true;
						break;
						// when this is true, you know that ur random number already exists in ur array
						// do something
					}
					else
					{

					}
					// arr[b] is ur previous numbers
					// arr[i] is ur current number (the random one that u want to make sure
					// doesnt exist in ur array already)
				}
			}
			System.out.print(arr[i]);
		}
	}
}

/* {0,5,14,-8}
i = 0, no prev. values
i = 1, 0
i = 2, 0,5
i = 3, 0,5,14 */
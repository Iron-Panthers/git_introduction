public class SerenaCode
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What is your favorite color.");
		String name = in.next();
		if(name.equalsIgnoreCase("Brown"))
		{
			System.out.println("That's an ugly color.");
		}
		else
		{
			System.out.println("Thats a nice color.");
		}
	}
}
import java.util.Scanner;
import java.lang.Math;
public class Grade
{	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = in.next();

		System.out.println("What is your age?");
		int age = in.nextInt();

		String grade = "";
		if(age == 14)
		{	
			System.out.println("You are a Freshman");
			grade = "freshman";
		}

		if(age == 15)
		{	
			System.out.println("You are a Sophomore");
			grade = "sophomore";
		}

		if(age == 16)
		{	
			System.out.println("You are a Junior");
			grade = "junior";
		}

		if(age == 17)
		{	
			System.out.println("You are a Senior");
			grade = "senior";
		}	


		System.out.println("What is your birthday month?");
		String birth = in.next();

		System.out.println("What is your favorite word?");
		String favword = in.next();

		System.out.println("Your name is " + name + ", you are " + age + " and you are a " + grade + ". You were born in " + birth + " and your favorite word is " + favword + "." );
		
		int x = 0;
		while(x<=10)
		{
			System.out.println(favword);
			x ++ ;
		}

	}

}

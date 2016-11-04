public class Stars {
	public static void main(String[] args) {
		/* 
			Create a program that prints out
				*****
				****
				***
				**
				*

			using a for loop and variables to keep track of how many stars/lines you need to print out.
		*/

		String star = "*";

		for(int i = 0; i < 5; i++) {
			//System.out.println(star);
			for(int x = 0; x < i ; x++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}
}
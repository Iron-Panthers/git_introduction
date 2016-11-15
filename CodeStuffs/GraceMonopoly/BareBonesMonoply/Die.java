public class Die { 
		public static int roll(int numDie) {
			public int maxValue = 6;
			public int minValue = 1;
			
			return (int)(Math.random() * maxValue * numDie) + minValue;		
		}	
}
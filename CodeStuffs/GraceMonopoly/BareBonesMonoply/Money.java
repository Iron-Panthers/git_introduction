public class Money {
		private Player owner; 
		private int currentMoney;
		
		public Money(Player owner, int startingMoney) {
			this.owner = owner;
			this.setMoney(startingMoney);
		}
		
		public Player getowner() {
			return this.owner;
		}
		
		public int getMoney() {
			return this.currentMoney;
		}
		
		public void setMoney(int amount) {
			this.currentMoney = amount;
		}
		
		public void addMoney(int amount) {
			if (amount > 0) {
				this.currentMoney += amount;
			}		
		}
		
		public void subtractMoney(int amount) {
			if (amount > 0) {
				this.currentMoney -= amount;
			}	
		}
		
		public void resetMoney() {
			public int startingMoney = 1500;
			this.currentMoney = startingMoney; 
		}
}

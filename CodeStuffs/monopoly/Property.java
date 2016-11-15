public class Property {
	int price;
	int owner;
	int houses;
	int color;
	int rent;
	int position;
	String name;
	

	public Property(String name, int price, int color, int rent, int position) {
	this.price = price;
	this.owner = 0;
	this.houses = 0;
	this.color = color;
	this.rent = rent;
	this.position = position;
	this.name = name;
	this.landedOn = false;
	}

	public void landOn(int playerPosition, int position) {
		if(playerPosition == position) {
			System.out.println("What would you like to do?");
		}
	}
}
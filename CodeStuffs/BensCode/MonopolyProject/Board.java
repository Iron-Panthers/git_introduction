//Creates an array of properties which indicates the board. 
//Handles movement of all the players, based off of what number they roll. 
//Also handles purchasing of properties and rent, as well as money when passing Go

public class Board {

	Property[] properties = new Property[12];
	Player player = new Player();

	public Board() {

		properties[0] = new Property("BHS", 300, 30, 20);
		properties[1] = new Property("San Mateo HS", 300, 30, 20);
		properties[2] = new Property("Aragon HS", 300, 30, 20);
		properties[3] = new Property("AT&T Park", 500, 50, 40);
		properties[4] = new Property("Wrigly Field", 500, 50, 40);
		properties[5] = new Property("Fenway Park", 500, 50, 40);
		properties[6] = new Property("Carnegie Hall", 700, 70, 60);
		properties[7] = new Property("Trump Tower (Manhattan, NY)", 850, 85, 75);
		properties[8] = new Property("U.S. Capitol", 925, 92, 82);
		properties[9] = new Property("White House", 1000, 100, 90);
		properties[10] = new Property("Income Tax", 200, 0, 0);
		properties[11] = new Property("Luxury Tax", 100, 0, 0);

		switch player {
			case 
		}

	}
}
package october;

public class Board {
//manages locations, property locations, converts roll to number of moves(where you will end up on the board)
	//try making twenty properties and 5 per side
	int spaces=26;
	Property[] listOfProperties = new Property[spaces];
	public Board(){
		listOfProperties[0] = new Property("USA",5,5);
		listOfProperties[1] = new Property("Turkey",6,6);
		listOfProperties[2] = new Property("Egypt",7,7);
		listOfProperties[3] = new Property("Italy",8,8);
		listOfProperties[4] = new Property("Peru",9,9);
		listOfProperties[5] = new Property("Japan",10,10);
		listOfProperties[6] = new Property("Spain",11,11);
		listOfProperties[7] = new Property("England",12,12);
		listOfProperties[8] = new Property("Morroco",13,13);
		listOfProperties[9] = new Property("Syria",14,14);
		listOfProperties[10] = new Property("Algeria", 15,15);
		listOfProperties[11] = new Property("Russia",16,16);
		listOfProperties[12] = new Property("Saudi Arabia", 17,17);
		listOfProperties[13] = new Property("Syria",18,18);
		listOfProperties[14] = new Property("Lebanon",19,19);
		listOfProperties[15] = new Property("Canada",20,20);
		listOfProperties[16] = new Property("North Korea",21,21);
		listOfProperties[17] = new Property("China",22,22);
		listOfProperties[18] = new Property("Argentina",23,23);
		listOfProperties[19] = new Property("South Africa",24,24);
		listOfProperties[20] = new Property("Yemen",25,25);
		listOfProperties[21] = new Property("Palestine",26,26);
		listOfProperties[22] = new Property("Pakistan",27,27);
		listOfProperties[23] = new Property("Afganistan",28,28);
		listOfProperties[24] = new Property("Sweden",29,29);
		listOfProperties[25] = new Property("Germany",30,30);
	}
	if(/*property ylocation==player ylocation && property xlocation == propertylocation*/){
		System.out.println("Do you want to buy this property?");
	}
}

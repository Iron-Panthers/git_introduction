import java.util.Scanner;
public class Board
{	
	Property[] properties = 
	{
		new Property("Zergling", 0, 20, 2),
		new Property("Marine", 0, 40, 4),
		new Property("Adept", 0, 50, 5),
		new Property("Baneling", 0, 90, 500),
		new Property("Reaper", 0, 117, 13),
		new Property("Zealot", 0, 135, 15),
		new Property("Roach", 0, 160, 20),
		new Property("Marauder", 0, 176, 22),
		new Property("High Templar", 0, 200, 25),
		new Property("Hydralisk", 0, 224, 32),
		new Property("Ghost", 0, 238, 34),
		new Property("Dark Templar", 0, 245, 35),
		new Property("Infestor", 0, 252, 42),
		new Property("Hellion/Hellbat", 0, 264, 44),
		new Property("Stalker", 0, 270, 45),
		new Property("Ravager", 0, 310, 62),
		new Property("Siege Tank", 0, 320, 64),
		new Property("Immortal", 0, 330, 66),
		new Property("Queen", 0, 360, 90),
		new Property("Thor", 0, 380, 95),
		new Property("Colossus", 0, 400, 100),
	};
	public Board()
	{
	}
}

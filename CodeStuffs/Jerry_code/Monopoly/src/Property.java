
public class Property {
	String name;
	Player owner;
	int cost;
	int rent;
	
	public Property(String name, Player owner, int cost, int rent) {
		this.owner = owner;
		this.name = name;
		this.cost = cost;
		this.rent = rent;
	}
	
	public void buy(Player player) {
		player.money -= cost;
		owner = player;
	}
	
	public void rent(Player rentingplayer, Player ownerplayer) {
		rentingplayer.money -= rent;
		ownerplayer.money += rent;
	}
}

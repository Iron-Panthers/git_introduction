public class Property
{
	int price;
	int rent;
	int owner;
	String name;
	public Property(String name, int owner, int price, int rent)
	{
		this.rent = rent;
		this.owner = owner;
		this.price = price;
		this.name = name;
	}

	public void setOwner(Player player)
	{
		owner = player.owner;
	}
}
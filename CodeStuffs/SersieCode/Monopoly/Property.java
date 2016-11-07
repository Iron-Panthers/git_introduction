public class Property
{
	int rent;
	int owner;
	int price;
	String name;

	public Property(String name, int owner, int price, int rent)
	{
		this.name = name;
		this.owner = owner;
		this.price = price;
		this.rent = rent;
	}
	public int getRent()
	{
		return rent;
	}
	public int getPrice()
	{
		return price;
	}
	public int getOwner()
	{
		return owner;
	}
	public String getName()
	{
		return name;
	}
	public void setOwner(int owner)
	{
		this.owner = owner; 
	}
}
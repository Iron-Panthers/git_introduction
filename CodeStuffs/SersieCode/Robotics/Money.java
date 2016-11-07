public class Money
{
	int value;
	int owner;

	public Money(int value, int owner)
	{
		this.value = value;
		this.owner = owner;
	}
	public int getOwner()
	{
		return owner;
	}
	public int getValue()
	{
		return value;
	}
	public void setOwner(int owner)
	{
		this.owner = owner;
	}
}
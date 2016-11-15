public class Player
{
	int money;
	int owner;
	int position;
	public Player(int owner, int position, int money)
	{
		this.owner = owner;
		this.position = position;
		this.money = money;
	}
	public int getPosition()
	{
		return position;
	}
	public void movePlayer(int spaces, Board board, Die die) 
	{
		position += spaces;
		if (position + spaces > board.properties.length) 
		{
			this.position = spaces - (board.properties.length - position);
			this.money = money + 50;
		}
	}
	public void payRent(Board board)
	{
			if(position == 3)
			{
				board.properties[position].owner = 0;
			}
			money = money - board.properties[position].rent;
	}
	public void gainRent()
	{
		money += payment;
	}
	public void buyProperty(Board board)
	{
		board.properties[position].owner = owner;
		money = money - board.properties[position].price;
	}
	public int getMoney()
	{
		return money;
	}
	public int getOwner()
	{
		return owner;
	}
} 
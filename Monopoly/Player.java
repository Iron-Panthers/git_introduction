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
	public int getposition()
	{
		return position;
	}
	public void movePlayer(int spaces, Board board) 
	{
		position += spaces;
		/*if (position + die.rollValue() > board.properties.length) 
		{
			// TOO FAR, PASS GO AGAIN AND ADD THE REMAINING SPACES//
			position = die.rollValue() - (board.properties.length - position);
		}
		*/
	}
	public void payRent(Board board)
	{
		if(board.properties[position].owner != 0 && board.properties[position].owner != owner)
		{
			
		}
	}
}
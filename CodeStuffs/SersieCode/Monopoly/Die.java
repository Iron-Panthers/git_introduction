public class Die
{
	int die1;
	int die2;

	public Die(int die1, int die2)
	{
		this.die1 = die1;
		this.die2 = die2;
	}
	public int rollDie() 
	{
		int die1 = (int) (Math.random() * 6 + 1);
		int die2 = (int) (Math.random() * 6 + 1);
		int moves = die1 + die2;
		return moves;
	}
}
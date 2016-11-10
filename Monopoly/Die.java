public class Die
{
	int value;
	public Die()
	{
	}
	public int rollValue()
	{
		this.value = (int)(Math.random()*6 + 1) + (int)(Math.random()*6 + 1);
		return value;
	}
}
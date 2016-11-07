public class Building
{
	private int walls;
	private int windows;
	public Building(int walls, int windows)
	{
		this.walls = walls;
		this.windows = windows;
	}
	public int getWalls()
	{
		return walls;
	}
	public void setWalls(int walls)
	{
		this.walls = walls;
	}
}
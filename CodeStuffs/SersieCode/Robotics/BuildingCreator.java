public class BuildingCreator
{
	public static void main(String[] args)
	{
		Building b1 = new Building(4,3);
		System.out.println(b1.getWalls());
		b1.setWalls(7);
	}
}
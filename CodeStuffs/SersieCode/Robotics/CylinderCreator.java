import java.lang.Math;
import java.util.Scanner;
public class CylinderCreator
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert a radius.");
		double radius = in.nextInt();
		System.out.println("Please insert a height.");
		double height = in.nextInt();
		Cylinder c1 = new Cylinder(radius,height);
		System.out.println("This is the volume: " + c1.getVolume());
		System.out.println("This is the radius: " + c1.getRadius());
		System.out.println("Please insert a height.");
		double height2 = in.nextInt();
		c1.setHeight(height2);
		System.out.println("Please insert a volume.");
		double volume = in.nextInt();
		c1.setVolume(volume);
		System.out.println("This is the volume: " + c1.getVolume());
		System.out.println("This is the radius: " + c1.getRadius());
	}
}
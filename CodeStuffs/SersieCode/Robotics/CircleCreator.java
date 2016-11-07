import java.lang.Math;
public class CircleCreator
{
	public static void main (String[] args)
	{
		Circle c1 = new Circle(1.378);
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		System.out.println(c1.getCircumference());
		c1.setRadius(3);
		c1.setArea(10);
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		System.out.println(c1.getCircumference());
	}
}
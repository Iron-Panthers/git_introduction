import java.lang.Math;
import java.util.Scanner;
public class TrapezoidCreator
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Please insert the width of the top side.");
		double widtht = in.nextDouble();

		System.out.println("Please insert the width of the bottom side.");
		double widthb = in.nextDouble();

		System.out.println("Please insert the height.");
		double height = in.nextDouble();

		Trapezoid t1 = new Trapezoid(widtht, widthb, height);

		System.out.println("This is the Area: " + t1.getArea());
		System.out.println("Please set a new height.");
		double height2 = in.nextDouble();
		t1.setHeight(height2);

		System.out.print("Please set a new area: ");
		double newArea1 = in.nextDouble();
		t1.setHeightWithArea(newArea1);

		System.out.println("The new height is: " + t1.getHeight());
		System.out.println("Please set a new area: ");
		double newArea2 = in.nextDouble();
		t1.setWidthtWithArea(newArea2);

		System.out.println("The new width of the top side is: " + t1.getWidtht());
		System.out.println("Please set a new area: ");
		double newArea3 = in.nextDouble();
		t1.setWidthbWithArea(newArea3);
		
		System.out.println("The new width of the bottom side is: " + t1.getWidthb());
	}
}
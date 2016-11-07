public class Rectangle
{
	public double width;
	public double height;
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	public double getArea()
	{
		return (width * height);
	}
	public void setHeightWithArea(double area)
	{
		this.height = area/width;
	}
	public void setWidthWithArea(double area)
	{
		this.width = area/height;
	}
}
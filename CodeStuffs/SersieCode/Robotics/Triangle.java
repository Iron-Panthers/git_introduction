public class Triangle
{
	public double base;
	public double height;
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	public double getArea()
	{
		return (base*height/2);
	}
	public void setHeightWithArea(double area)
	{
		this.height = (area * 1/2)/base;
	}
	public void setBaseWithArea(double area)
	{
		this.base = (area * 1/2)/height;
	}
}
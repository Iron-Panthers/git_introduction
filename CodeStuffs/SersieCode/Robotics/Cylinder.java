public class Cylinder
{
	public Circle base;
	public double height;
	public Cylinder (double radius, double height)
	{
		this.base = new Circle(radius);
		this.height = height;
	}
	public double getVolume()
	{
		return (base.getArea()) * (height);
	}
	public double getRadius()
	{
		return (base.getRadius());
	}
	public void setVolume(double volume)
	{
		this.base.setArea(volume / height);
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
}
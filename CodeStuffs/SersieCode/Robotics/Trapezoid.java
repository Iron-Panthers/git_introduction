
public class Trapezoid
{
	public double widtht;
	public double widthb;
	public double height;
	public Rectangle rectangle;
	public Triangle triangle1;
	public Triangle triangle2;
	public Trapezoid(double widthb, double widtht, double height)
	{
		this.triangle1 = new Triangle(Math.abs(widthb-widtht), height);
		this.triangle2 = new Triangle(Math.abs(widthb-widtht), height);
		if (widtht > widthb) 
		{
			this.rectangle  = new Rectangle (widthb, height);
		} 
		else 
		{
			this.rectangle = new Rectangle (widtht, height);
		}
	}
	public double getArea()
	{
		return (rectangle.getArea() + triangle1.getArea() + triangle2.getArea());
	}
	public double getHeight()
	{
		return rectangle.getHeight();
	}
	public double getWidtht(double widtht)
	{
		return widtht;
	}
	public double getWidthb(double widthb)
	{
		return widthb;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public void setHeightWithArea(double area)
	{
		this.rectangle.setHeightWithArea(area);
		this.triangle1.setHeightWithArea(area);
		this.triangle2.setHeightWithArea(area);
	}
	public void setWidthtWithArea(double area)
	{
		this.rectangle.setWidthWithArea(area);
		this.triangle1.setBaseWithArea(area);
		this.triangle2.setBaseWithArea(area);
	}
	public void setWidthbWithArea(double area)
	{
		this.rectangle.setWidthWithArea(area);
		this.triangle1.setBaseWithArea(area);
		this.triangle2.setBaseWithArea(area);
	}
}
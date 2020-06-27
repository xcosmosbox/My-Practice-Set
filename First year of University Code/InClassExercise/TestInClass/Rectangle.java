/**
 *	This is a Rectangle class and extends GcometricObject class
 */
public class Rectangle extends GcometricObject
{
	//Create width and height variable
	private double width;
	private double height;
	
	//no-args construction method
	public Rectangle() 
	{
		super();
	}
	//construction method about width and height
	public Rectangle(double width, double height)
	{
		super();
		this.width = width;
		this.height = height;
	}
	//construction method about width, height, color and filled
	public Rectangle(double width, double height, String color, boolean filled) 
	{
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	//Getter and Setter
	public double getWidth() 
	{
		return width;
	}
	public void setWidth(double width) 
	{
		this.width = width;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	//Get area
	public double getArea()
	{
		return this.getHeight()*this.getWidth();
	}
	
	//Get perimeter
	public double getPerimeter()
	{
		return 2*(this.getHeight()+this.getWidth());
	}
	
	
}

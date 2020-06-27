/**
 *	This is a Circle class and extends GcometricObject class
 */
public class Circle extends GcometricObject
{
	//Create radius variable
	private double radius;

	//no-args construction method
	public Circle() 
	{
		super();
	}
	//construction method about radius
	public Circle(double radius) 
	{
		super();
		this.radius = radius;
	}
	//construction method about radius,color and filled
	public Circle(double radius, String color, boolean filled)
	{
		super(color, filled);
		this.radius = radius;
	}

	//Getter and Setter
	public double getRadius() 
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	// Return diameter
	public double getDiameter()
	{
		return 2*this.radius;
	}
	
	//Get area
	public double getArea()
	{
		return Math.PI*Math.pow(getRadius(), 2);
	}
	
	//Get perimeter
	public double getPerimeter()
	{
		return Math.PI*this.getDiameter();
	}
	
}

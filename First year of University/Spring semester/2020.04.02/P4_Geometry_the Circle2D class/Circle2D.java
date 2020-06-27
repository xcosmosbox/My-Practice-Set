//This is a class for creating planar circles.
public class Circle2D 
{
	//center and radius
	private double x;
	private double y;
	private double radius;
	
	// no-arg construction method
	public Circle2D() 
	{
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}

	// have x,y,radius construction method
	public Circle2D(double x, double y, double radius) 
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// Get x,y,radius value
	public double getX() 
	{
		return this.x;
	}
	public double getY() 
	{
		return this.y;
	}
	public double getRadius() 
	{
		return this.radius;
	}

	// Get circle area
	public double getArea()
	{
		return (this.radius*this.radius*Math.PI);
	}
	
	// Get circle perimeter
	public double getPerimeter()
	{
		return (2*Math.PI*this.radius);
	}
	
	// Return the center of a circle distance between circle and one point
	private double distance(double x , double y)
	{
		return (Math.sqrt((Math.pow((x-this.x), 2))+(Math.pow((y-this.y), 2))));
	}
	
	// Judge whether the point is in the circle
	public boolean contains(double x, double y)
	{
		return  this.radius >= distance(x,y);
	}
	
	// Judge whether it is inscribed and contained
	public boolean contains(Circle2D circle)
	{
		return Math.abs(this.radius - circle.getRadius()) >= distance(circle.getX() , circle.getY());
	}
	
	// Judge whether two circles intersect
	public boolean overlaps(Circle2D circle)
	{
		return (this.radius + circle.getRadius() >= distance(circle.getX() , circle.getY())) && 
			    (Math.abs(this.radius - circle.getRadius()) < distance(circle.getX() , circle.getY()));
	}
	
	
	
}

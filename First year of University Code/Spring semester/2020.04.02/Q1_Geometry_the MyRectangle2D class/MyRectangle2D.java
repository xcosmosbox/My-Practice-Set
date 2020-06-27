// This is a class about rectangles. Can return the area and perimeter of the rectangle. 
// And judge the position relationship between the rectangles.
public class MyRectangle2D 
{
	// x and y is center coordinate of rectangle
	private double x;
	private double y;
	//Height and width of rectangle
	private double width;
	private double height;
	
	// no-arg constructor method
	public MyRectangle2D() 
	{
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}
	
	// About x,y,width,height have args constructor method
	public MyRectangle2D(double x, double y, double width, double height) 
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// All getter and setter method for variable x,y,width and height 
	public double getX() 
	{
		return this.x;
	}
	public void setX(double x) 
	{
		this.x = x;
	}
	public double getY() 
	{
		return this.y;
	}
	public void setY(double y) 
	{
		this.y = y;
	}
	public double getWidth() 
	{
		return this.width;
	}
	public void setWidth(double width) 
	{
		this.width = width;
	}
	public double getHeight() 
	{
		return this.height;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	// Return rectangle area
	public double getArea()
	{
		return (this.width*this.height);
	}
	
	// Return rectangle perimeter
	public double getPerimeter()
	{
		return 2*(this.width+this.height);
	}
	
	// Judge whether the point is in the rectangle
	public boolean contains(double x, double y)
	{
		return (Math.abs(x-this.x) <= (width/2) && Math.abs(y-this.y) <= (height/2));
	}
	
	// Determine whether one rectangle is inside another
	public boolean contains(MyRectangle2D rectangle)
	{
		return contains(rectangle.getX(),rectangle.getY()) && 
				((Math.abs(rectangle.getX())+(rectangle.getWidth()/2)) <= (Math.abs(this.x)+(this.getWidth()/2)) &&
					(Math.abs(rectangle.getY())+(rectangle.getHeight()/2)) <= (Math.abs(this.y)+(this.getHeight()/2)));
	}
	
	// Judge whether two rectangles intersect
	public boolean overlaps(MyRectangle2D rectangle)
	{
		return (!contains(rectangle.getX(),rectangle.getY()) && !contains(rectangle) ) &&
				((Math.abs(rectangle.getX() - this.x) <= ((rectangle.getWidth()+this.width)/2)) &&
				  (Math.abs(rectangle.getY() - this.y) <= ((rectangle.getHeight()+this.height)/2)));
						
				
	}
	
}

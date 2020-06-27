//Regular polygon class
public class RegularPolygon 
{
	//Default value of initialization variable
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	//Construction method without parameters
	public RegularPolygon()
	{
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	//A construction method with edge number and edge length
	public RegularPolygon(int n, double side)
	{
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}
	
	//A construction method with the number of sides, side length, 
	//X-axis coordinate and y-axis coordinate.
	public RegularPolygon(int n, double side, double x, double y)
	{
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	//Accessors and modifiers for four variables
	public int getN() 
	{
		return n;
	}
	public void setN(int n) 
	{
		this.n = n;
	}
	public double getSide() 
	{
		return side;
	}
	public void setSide(double side) 
	{
		this.side = side;
	}
	public double getX() 
	{
		return x;
	}
	public void setX(double x) 
	{
		this.x = x;
	}
	public double getY() 
	{
		return y;
	}
	public void setY(double y) 
	{
		this.y = y;
	}
	
	//Method to return perimeter
	public double getPerimeter()
	{
		return (n*side);
	}
	
	//Return area method
	public double getArea()
	{
		return ((n*side*side)/(4*Math.tan(Math.PI/n)));
	}
	
}

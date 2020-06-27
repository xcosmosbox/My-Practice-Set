/**
 *	This is a regular octagon class that can output area and perimeter. 
 *	At the same time, it can clone itself and compare the circumference of the figure. 
 */
public class Octagon extends GeometricObject implements Cloneable 
{
	//Create side variable
	private double side;
	
	//Construction method
	public Octagon() {}
	public Octagon(double side)
	{
		this.side = side;
	}

	//Clone oneself
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		Octagon cloneRectangle = new Octagon(this.side);
		return cloneRectangle;
	}
	
	//Compare perimeter sizes between drawings
	@Override
	public int compareTo(GeometricObject obj) 
	{
		if(this.getPerimeter() > ((GeometricObject)obj).getPerimeter()) return 1;
		else if(this.getPerimeter() == ((GeometricObject)obj).getPerimeter()) return 0;
		else return -1;
	}

	//Output area
	@Override
	public double getArea() 
	{
		return (2+(4*Math.sqrt(2)))*side*side;
	}

	//Output perimeter
	@Override
	public double getPerimeter() 
	{
		return 8*side;
	}

}

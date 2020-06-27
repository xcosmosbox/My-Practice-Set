/**
 *	This is a rectangular class that can output area and perimeter. 
 *	At the same time, it can clone itself and compare the perimeter and area of the figure. 
 */
public class Rectangle extends GeometricObject implements Cloneable 
{
	//Create width and height variable
	private double width;
	private double height;
	
	//Construction method
	public Rectangle() {}
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	//Compare area sizes between drawings
	@Override
	public boolean equals(Object obj)
	{  
		return this.getArea() == ((GeometricObject)obj).getArea();  
	}
	
	//Clone oneself
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		Rectangle cloneRectangle = new Rectangle(this.width,this.height);
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
		return this.height*this.width;
	}

	//Output perimeter
	@Override
	public double getPerimeter() 
	{
		return 2*(this.width+this.height);
	}

}

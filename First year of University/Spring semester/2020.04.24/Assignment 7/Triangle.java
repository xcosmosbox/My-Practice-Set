/**
 * This is a triangle class that can output area and perimeter. 
 * At the same time, it can clone itself and compare the circumference of the figure.
 */
public class Triangle extends GeometricObject implements Cloneable 
{
	//Create three side variable
	private double side_1;
	private double side_2;
	private double side_3;
	
	//Construction method
	public Triangle() {}
	public Triangle(double side_1, double side_2, double side_3)
	{
		this.side_1 = side_1;
		this.side_2 = side_2;
		this.side_3 = side_3;
	}

	//Clone oneself
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		Triangle cloneRectangle = new Triangle(this.side_1, this.side_2, this.side_3);
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
		double s = (side_1 + side_2 + side_3)/2;
		return Math.sqrt(s * (s-side_1) * (s-side_2) * (s-side_3));
	}

	//Output perimeter
	@Override
	public double getPerimeter() 
	{
		return (side_1 + side_2 + side_3);
	}

}

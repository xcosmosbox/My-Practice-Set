/**
 * 
 */

/**
 * @author apple
 *
 */
public class Triangle 
{
	private double side1;
	private double side2;
	private double side3;
	private static int numberOfObjects = 0;
	double perimeter;
	double area;
	
	public Triangle()
	{
		side1 = 1;
		side2 = 1;
		side3 = 1;
		numberOfObjects++;
	}
	
	public double getPerimeter() 
	{
		return perimeter = side1+side2+side3;
	}

	public double getArea() 
	{
		double s = (side1+side2+side3)/2;
		return area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}

	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		numberOfObjects++;
	}

	public int getnumberOfObjects() 
	{
		return numberOfObjects;
	}	
	
	
}

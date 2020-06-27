package Q2ForTriangleException;

/**
 *	 This is a triangle class, which can create and test whether the three sides of a triangle are legal
 */
public class Triangle
{
	//Three sides of a triangle
	private double side_1;
	private double side_2;
	private double side_3;
	
	//Statistics successfully created several triangles
	private static int numberOfObjects = 0;
	
	//Construction method
	public Triangle() throws IllegalTriangleException 
	{
		this(3,4,5);
	}
	public Triangle(double side_1, double side_2, double side_3) throws IllegalTriangleException 
	{
		//Throw exception
		try 
		{
			setSides(side_1,side_2,side_3);
			numberOfObjects++;
		}
		catch(IllegalTriangleException ex)
		{
			System.out.println(ex);
		}
	}
	
	//Getter method
	public double getSide_1() 
	{
		return side_1;
	}
	public double getSide_2() 
	{
		return side_2;
	}
	public double getSide_3() 
	{
		return side_3;
	}
	
	//Check whether three sides of triangle are normal
	public void setSides(double side_1, double side_2, double side_3) throws Exception
	{
		if(sumSides(side_1,side_2,side_3) && sumSides(side_1,side_3,side_2) 
			&& sumSides(side_2,side_3,side_1) && subSides(side_1,side_2,side_3)
			&& subSides(side_1,side_3,side_2) && subSides(side_2,side_3,side_1))
		{
			this.side_1 = side_1;
			this.side_2 = side_2;
			this.side_3 = side_3;
		}
		else
		{
			throw new IllegalTriangleException(side_1,side_2,side_3);
		}
	}
	
	//Judge the sum of the two sides
	private boolean sumSides(double firstSide, double secondSide, double thirdSide)
	{
		return (firstSide + secondSide)>thirdSide;
	}
	
	//Judge the difference between the two sides
	private boolean subSides(double firstSide, double secondSide, double thirdSide)
	{
		return (firstSide - secondSide)<thirdSide;
	}
	
	//Get the number of successful triangles created
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	//Get perimeter
	public double getPerimeter()
	{
		return (this.side_1+this.side_2+this.side_3);
	}
}

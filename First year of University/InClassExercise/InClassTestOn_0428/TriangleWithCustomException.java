
public class TriangleWithCustomException
{
	private double side_1;
	private double side_2;
	private double side_3;
	
	private static int numberOfObjects = 0;
	
	public TriangleWithCustomException() throws InvalidTriangleException 
	{
		this(3,4,5);
	}
	public TriangleWithCustomException(double side_1, double side_2, double side_3) throws InvalidTriangleException 
	{
		setSides(side_1,side_2,side_3);
		numberOfObjects++;
	}
	
	
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
	
	public void setSides(double side_1, double side_2, double side_3) throws InvalidTriangleException
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
			throw new InvalidTriangleException(side_1,side_2,side_3);
		}
	}
	
	private boolean sumSides(double firstSide, double secondSide, double thirdSide)
	{
		return (firstSide + secondSide)>thirdSide;
	}
	private boolean subSides(double firstSide, double secondSide, double thirdSide)
	{
		return (firstSide - secondSide)<thirdSide;
	}
	
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	public double getPerimeter()
	{
		return (this.side_1+this.side_2+this.side_3);
	}
	
	
}

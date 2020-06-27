
public class InvalidTriangleException extends Exception 
{
	private double side_1;
	private double side_2;
	private double side_3;
	
	public InvalidTriangleException(double side_1, double side_2, double side_3) 
	{
		super("Invalid sides " + side_1+" "+side_2+" "+side_3);
		this.side_1 = side_1;
		this.side_2 = side_2;
		this.side_3 = side_3;
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
}

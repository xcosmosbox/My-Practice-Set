/**
 * This is a class for creating points, with the horizontal and vertical coordinates of a point
 */
public class PointGroup 
{
	//Create variable x and y
	private double point_X;
	private double point_Y;
	
	//no-args construction method
	public PointGroup() {}
	
	//Construction method about x and y
	public PointGroup(double point_X, double point_Y)
	{
		this.point_X = point_X;
		this.point_Y = point_Y;
	}
	
	//Getter and Setter
	public double getPoint_X()
	{
		return point_X;
	}
	public void setPoint_X(double point_X)
	{
		this.point_X = point_X;
	}
	public double getPoint_Y() 
	{
		return point_Y;
	}
	public void setPoint_Y(double point_Y) 
	{
		this.point_Y = point_Y;
	}
	
}

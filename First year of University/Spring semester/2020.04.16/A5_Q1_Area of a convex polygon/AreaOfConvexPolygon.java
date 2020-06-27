import java.util.ArrayList;

/**
 *	This is a class to calculate the area of convex polygon 
 */
public class AreaOfConvexPolygon 
{
	//Store a collection of all points
	private ArrayList<PointGroup> pointsList = new ArrayList<>();
	//Create the origin
	private PointGroup origin;
	
	// No-args construction method
	public AreaOfConvexPolygon() 
	{
		origin = new PointGroup(0,0);
	}
	
	//Getter and Setter
	public PointGroup getOrigin() {
		return origin;
	}
	public void setOrigin(PointGroup origin) {
		this.origin = origin;
	}
	public ArrayList<PointGroup> getPointsList() 
	{
		return pointsList;
	}

/**
 *	This is the first method I wrote to calculate the area, using the cross product of vectors. 
 *	This is a correct method, which can calculate the area of concave polygon and convex polygon at the same time. 
 *	But due to the wrong answer to the example, I think I did it wrong, so I didn't use this method. 
 *	When I found that my method was right, I had no energy to write it again. 
 */
//	private PointGroup getVector(PointGroup point_1, PointGroup point_2)
//	{
//		return (new PointGroup( (point_2.getPoint_X()-point_1.getPoint_X()), (point_2.getPoint_Y()-point_1.getPoint_Y())));
//	}
//	
//	private double getCrossProduct(PointGroup point_1, PointGroup point_2)
//	{
//		return ((point_1.getPoint_X()*point_2.getPoint_Y()) - (point_2.getPoint_X()*point_1.getPoint_Y()));
//	}
	
	//Get the data S in Helen's formula
	private double getS(PointGroup point_1, PointGroup point_2)
	{
		double s = 0;
		
		//Get three sides
		double side_1 = this.getSide(getOrigin(), point_1);
		double side_2 =	this.getSide(getOrigin(), point_2);
		double side_3 = this.getSide(point_2, point_1);
		s = 0.5*(side_1 + side_2 + side_3);
		
		return s;
	}
	
	//Using the distance between two points to get the side length
	private double getSide(PointGroup point_1, PointGroup point_2)
	{
		return Math.sqrt(Math.pow(point_2.getPoint_X()-point_1.getPoint_X(), 2) + Math.pow(point_2.getPoint_Y()-point_1.getPoint_Y(), 2));
	}
	
	//Get the area of convex polygon
	public double getTotalArea()
	{
		double totalArea = 0;
		double s;
		s = this.getS(pointsList.get(0), pointsList.get(pointsList.size()-1));
		
		//Helen formula is used to calculate the area of each triangle. 
		//The sum of the areas of all triangles is the area of convex polygon
		totalArea = totalArea + Math.sqrt(
					s*(s-this.getSide(pointsList.get(0), pointsList.get(pointsList.size()-1)))*
					(s-this.getSide(this.getOrigin(), pointsList.get(0)))*
					(s-this.getSide(this.getOrigin(), pointsList.get(pointsList.size()-1)))
					);
		for(int i=0; i<pointsList.size()-1; i++)
		{
			s = this.getS(pointsList.get(i), pointsList.get(i+1));
			totalArea = totalArea + Math.sqrt(
						s*(s-this.getSide(pointsList.get(i), pointsList.get(i+1)))*
						(s-this.getSide(this.getOrigin(), pointsList.get(i)))*
						(s-this.getSide(this.getOrigin(), pointsList.get(i+1)))
						);
		}
		
		return totalArea;
	}
	
	//Stores each point created in the main method in the collection
	public void creatPoinList(double x, double y)
	{
		pointsList.add(new PointGroup(x,y));
	}
}

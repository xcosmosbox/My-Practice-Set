import java.util.ArrayList;

/**
 * This program can output the area and perimeter of geometry, 
 * compare the size between them, and clone a specific figure at the same time.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/23
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTest 
{
	public static void main(String[] args) throws Exception
	{
		//Create rectangle, triangle, and regular octagon objects
		Octagon o1 = new Octagon(5);
		Rectangle r1 = new Rectangle(2,3);
		Triangle t1 = new Triangle(3,4,5);
		
		//Area and perimeter of output geometry
		System.out.println("---------------------------------------------------------------");
		System.out.println("The octagon area are: "+o1.getArea()+" and perimeter are: "+o1.getPerimeter());
		System.out.println("The rectangle area are: "+r1.getArea()+" and perimeter are: "+r1.getPerimeter());
		System.out.println("The triangle area are: "+t1.getArea()+" and perimeter are: "+t1.getPerimeter());
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		//Compare area sizes between geometry
		System.out.println("---------------------------------------------------------------");
		System.out.println("The equals to rectangle with octagon are result: "+r1.equals(o1));
		System.out.println("The equals to rectangle with triangle are result: "+r1.equals(t1));
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		//Clone geometry
		Octagon o2 = (Octagon)o1.clone();
		Rectangle r2 = (Rectangle)r1.clone();
		Triangle t2 = (Triangle)t1.clone();
	
		
		
		//Compare perimeter sizes between drawings
		System.out.println("---------------------------------------------------------------");
		System.out.println("The compare to rectangle_1 with octagon_2 are result: "+r1.compareTo(o2));
		System.out.println("The compare to rectangle_2 with triangle_1 are result: "+r2.compareTo(t1));
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		//Create an array list and store the corresponding geometry, Z
		ArrayList<GeometricObject> list = new ArrayList<>();
		list.add(o1);
		list.add(o2);
		list.add(r1);
		list.add(r2);
		list.add(t1);
		list.add(t2);
		//Output the sum of the areas of all drawings
		System.out.println("The all geometric area are: "+ sumArea(list));
		
	}

	//This method can calculate the area sum of all graphs.
	public static double sumArea ( ArrayList<GeometricObject> list )
	{
		double totalArea = 0;
		for(int i=0; i<list.size(); i++)
		{
			totalArea = totalArea + list.get(i).getArea();
		}
		return totalArea;
	}
}

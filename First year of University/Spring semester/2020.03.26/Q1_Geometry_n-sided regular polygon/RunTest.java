/**
 * The program can create three regular polygon class object.
 * And the program can print polygon perimeter and area.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/03/20
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTest 
{
	public static void main(String[] args) 
	{
		//The first regular polygon class object
		RegularPolygon polygon_01 = new RegularPolygon();
		System.out.println("Polygon 1 perimeter: "+polygon_01.getPerimeter());
		System.out.println("Polygon 1 area: "+polygon_01.getArea());
		
		//The second regular polygon class object
		RegularPolygon polygon_02 = new RegularPolygon(6,4);
		System.out.println("Polygon 2 perimeter: "+polygon_02.getPerimeter());
		System.out.println("Polygon 2 area: "+polygon_02.getArea());
		
		//The third regular polygon class object
		RegularPolygon polygon_03 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("Polygon 3 perimeter: "+polygon_03.getPerimeter());
		System.out.println("Polygon 3 area: "+polygon_03.getArea());
		
	}

}

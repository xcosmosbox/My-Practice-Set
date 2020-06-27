/**
 * This program can create a circle according to its center coordinates and circumference. 
 * The area of the perimeter of the output circle and the position relationship between the judgment circles.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/03/26
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTest 
{
	public static void main(String[] args) 
	{
		// Create 3 circle 2D class
		Circle2D c1 = new Circle2D(2,2,5.5);
		Circle2D c2 = new Circle2D(4,5,10.5);
		Circle2D c3 = new Circle2D(3,5,2.3);
		
		// Display circle area & perimeter
		System.out.println("The circlce c1 area is "+c1.getArea()+ " and the perimeter is "+c1.getPerimeter());
		System.out.println("The circlce c2 area is "+c2.getArea()+ " and the perimeter is "+c2.getPerimeter());
		System.out.println("The circlce c3 area is "+c3.getArea()+ " and the perimeter is "+c3.getPerimeter());
		System.out.println();
		
		//On the judgment of circle position
		System.out.println("The result of c1.contains(3,3) is "+c1.contains(3,3));
		System.out.println("The result of c1.contains(c2) is "+c1.contains(c2));
		System.out.println("The result of c1.overlaps(c3) is "+c1.overlaps(c3));
		

	}

}

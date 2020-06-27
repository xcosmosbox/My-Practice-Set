/**
 * This program can create a rectangle and output its area and perimeter. 
 * Finally, the position relationship between the rectangles is determined.
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
		// Create three rectangle
		MyRectangle2D rectangle_1 = new MyRectangle2D(2,2,5.5,4.9);
		MyRectangle2D rectangle_2 = new MyRectangle2D(4,5,10.5,3.2);
		MyRectangle2D rectangle_3 = new MyRectangle2D(3,5,2.3,5.4);
		
		// Display three rectangle area and perimeter
		System.out.println("The one rectangle area is "+rectangle_1.getArea()+" and the perimeter is "+rectangle_1.getPerimeter());
		System.out.println("The second rectangle area is "+rectangle_2.getArea()+" and the perimeter is "+rectangle_2.getPerimeter());
		System.out.println("The third rectangle area is "+rectangle_3.getArea()+" and the perimeter is "+rectangle_3.getPerimeter());
		System.out.println();
		
		// Judge and output the position relationship between rectangles
		System.out.println("The result of rectangle_1.contains(3, 3) is "+rectangle_1.contains(3, 3));
		System.out.println("The result of rectangle_1.contains(rectangle_2) is "+rectangle_1.contains(rectangle_2));
		System.out.println("The result of rectangle_1.overlaps(rectangle_3) is "+rectangle_1.overlaps(rectangle_3));
	}

}

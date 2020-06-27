import java.util.Scanner;

/**
 * This is a program that can create triangles, 
 * and can output the perimeter and area of the created 
 * triangles as well as the color and whether to fill them.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/16
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTest {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//Create triangle three sides
		System.out.print("Please enter three sides of the triangle \n");
		System.out.print("Side 1: ");
		double side_1 = input.nextDouble();
		System.out.print("Side 2: ");
		double side_2 = input.nextDouble();
		System.out.print("Side 3: ");
		double side_3 = input.nextDouble();
		System.out.println();
		
		//Create the color of the triangle
		System.out.print("Please enter the color of the triangle: \n");
		String color = input.next();
		System.out.println();
		
		//Create the fill of the triangle
		System.out.print("Please confirm whether to fill the triangle: \n");
		boolean filled = input.nextBoolean();
		System.out.println();
		
		//Create triangle class
		TriangleClass triangle = new TriangleClass(side_1,side_2,side_3,color,filled);
		
		System.out.println("The area of the triangle is: "+triangle.getArea());
		System.out.println("The perimeter of a triangle is: "+triangle.getPerimeter());
		System.out.println("The colors of triangles are: "+triangle.getColor());
		System.out.println("Fill values for triangles: "+triangle.getFilled());
	}
	

}

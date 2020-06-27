/**
 *This program can detect whether a point is inside a circle.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/28
 * @version 1.0
 */ 
public class PointInCircle 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Explain
		System.out.println("Welcome to use this system!");
		System.out.println("Description: Input point coordinates to detect whether in the circle"+'\n');
		
		//Read user input
		java.util.Scanner number = new java.util.Scanner(System.in);
		System.out.print("Enter a point: ");
		double point_X = number.nextDouble();
		double point_Y = number.nextDouble();
		//double realPoint_X = (point_X * point_X);
		//double realPoint_Y = (point_Y * point_Y);
		//double pointDistance = realPoint_X + realPoint_Y;
		double distance = Math.pow(((point_X * point_X)+(point_Y * point_Y)), 0.5 );
		
		//Compute results
		if(distance <= 10)
		{
			System.out.print("Point ("+point_X+", "+point_Y+") is in the circle");
		}
		else if(distance >10)
		{
			System.out.print("Point ("+point_X+", "+point_Y+") is not in the circle");
		}
		
		
	}

}

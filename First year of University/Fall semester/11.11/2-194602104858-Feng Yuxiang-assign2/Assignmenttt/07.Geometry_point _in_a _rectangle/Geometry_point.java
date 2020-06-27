/**The program can calculation point is within the specified area
 * 
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/10/15
 * @version 1.0
 */ 
public class Geometry_point 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//read user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double number_x = input.nextDouble();
		double number_y = input.nextDouble();
		
		//output result
		if((Math.abs(number_x) <= 5.0 && Math.abs(number_y) <= 2.5))
		{
			System.out.println("Point ("+number_x+", "+number_y+") is in the rectangle");
			
		}
		else
		{
			System.out.println("Point ("+number_x+", "+number_y+") is not in the rectangle");
		}

	}

}

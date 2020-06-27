/**
 *This program can displays the area and perimeter of a circle
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/25
 * @version 1.0
 */ 
public class AnPCircle 
{
	static double radius;
	static double pi;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		//Defining variables
		double radius = 5.5;
		double pi = 3.1415926;

		
		//Output result
		System.out.println("Area is "+(radius*radius*pi));
		System.out.println("Perimeter is "+(2*radius*pi));
		System.out.println("//The accuracy of PI is 3.1415926.");
	
	}

}

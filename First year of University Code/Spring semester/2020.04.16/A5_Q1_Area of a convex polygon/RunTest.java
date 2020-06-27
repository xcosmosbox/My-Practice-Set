import java.util.Scanner;

/**
 * This program can output the area of convex polygon enclosed by all the points input by users.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/14
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTest 
{
	public static void main(String[] args) 
	{
		//How many points do I need to input?
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of the points: ");
		int pointNum = input.nextInt();
		
		//The data of each point is created as a "point object" and stored in the ArrayList collection of calculated area
		AreaOfConvexPolygon areaClass = new AreaOfConvexPolygon();
		double[][] coordinatePoint = new double[pointNum][2];
		System.out.println("Enter the coordinates of the points: ");
		for(int i=0; i<pointNum; i++)
		{
			areaClass.creatPoinList(input.nextDouble(), input.nextDouble());
		}
		
		//Output convex polygon area
		System.out.print("The total area is: ");
		System.out.print(areaClass.getTotalArea());
		
	}

}

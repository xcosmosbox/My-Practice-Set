/**
 *This program can calculating the Area of an Arbitrary Triangle
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/28
 * @version 1.0
 */ 
public class AreaTriangle 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Explain
		System.out.println("Welcome to use this system!");
		System.out.println("Description: Input coordinates of three vertices of a triangle"+'\n'+"The triangle area can be calculated.");
		
		//Read user input
		java.util.Scanner point = new java.util.Scanner(System.in);
		double point_X1;
		double point_Y1;
		double point_X2;
		double point_Y2;
		double point_X3;
		double point_Y3;
		
		//Read user input
		System.out.print("Enter 1st point for a triangle: ");
		point_X1 = point.nextDouble();
		point_Y1 = point.nextDouble();	
		System.out.print("Enter 2nd point for a triangle: ");
		point_X2 = point.nextDouble();
		point_Y2 = point.nextDouble();
		System.out.print("Enter 3rd point for a triangle: ");
		point_X3 = point.nextDouble();
		point_Y3 = point.nextDouble();
		
		//Calculation results
		double number_01 = ((point_X2-point_X1)*(point_X2-point_X1)) + ((point_Y2-point_Y1)*(point_Y2-point_Y1)); 
		double number_02 = ((point_X2-point_X3)*(point_X2-point_X3)) + ((point_Y2-point_Y3)*(point_Y2-point_Y3));
		double number_03 = ((point_X3-point_X1)*(point_X3-point_X1)) + ((point_Y3-point_Y1)*(point_Y3-point_Y1));
		double side_1 = Math.pow(number_01,0.5);
		double side_2 = Math.pow(number_02,0.5);
		double side_3 = Math.pow(number_03,0.5);
		double s = (side_1+side_2+side_3)/2;
		double inArea = s*(s-side_1)*(s-side_2)*(s-side_3);
		double realArea = Math.pow(inArea,0.5);
		
		//Compute results
		System.out.println("The area of the triangle is "+realArea);
		
		
	}

}

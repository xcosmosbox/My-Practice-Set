/**
 *This program can compute distance between any two points
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/27
 * @version 1.0
 */ 
public class Distance2Points 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Explain
		System.out.println("Welcome to use this system!");
		System.out.println("Instructions for Use: The distance between two points can be obtained"+'\n'+ " by inputting coordinates of any two points.");
		
		//Read user input
		java.util.Scanner number = new java.util.Scanner(System.in);
		double number_X1;
		double number_Y1;
		double number_X2;
		double number_Y2;
		
		//Read user input
		System.out.print("Enter X1 and Y1: ");
		number_X1 = number.nextDouble();
		number_Y1 = number.nextDouble();	
		System.out.print("Enter X2 and Y2: ");
		number_X2 = number.nextDouble();
		number_Y2 = number.nextDouble();
		
		//Compute results
		double point_01 = (number_X2-number_X1)*(number_X2-number_X1);
		double point_02 = (number_Y2-number_Y1)*(number_Y2-number_Y1);
		double endResult = Math.pow((point_01+point_02),0.5);
		System.out.println("The distance of the two points is "+endResult);
	}

}

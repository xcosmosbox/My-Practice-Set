/**
 *This program reads in the radius and length of a cylinder and computes the
  surface area and volume.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/26
 * @version 1.0
 */ 
public class ComputeCylinder 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Welcome to use this system !"+'\n'+"Instructions for use: As long as any radius and length are input"+'\n'+" the volume and surface area of the cylinder can be obtained"+'\n');
		//Read user input
		java.util.Scanner radius = new java.util.Scanner(System.in);
		java.util.Scanner length = new java.util.Scanner(System.in);
		
		//Defining variables and Calculation results
		System.out.print("Enter the radius of a cylinder: ");
		double realRadius = radius.nextDouble();
		System.out.print("Enter the length of a cylinder: ");
		double realLength = length.nextDouble();
		
		//Check the validity of the input value
		if(realRadius >0 && realLength >0){}
		else
		{
			System.out.println("The value you entered is not valid !");
			return;
		}
		
		//Calculation results
		double pi = 3.1415926;
		double surfaceArea = (2*realRadius*pi*realLength)+(2*realRadius*realRadius*pi);
		double volume = realLength*realRadius*realRadius*pi;
		
		//Compute
		System.out.println("The area is "+surfaceArea);
		System.out.println("The volume of the cylinder is "+volume);
		
		
		
		
		
	}

}

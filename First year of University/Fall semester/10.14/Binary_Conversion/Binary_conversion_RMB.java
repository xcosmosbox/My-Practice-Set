/**
 * 
 */

/**
 * @author apple
 *
 */
public class Binary_conversion_RMB 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Read user input
		java.util.Scanner money = new java.util.Scanner(System.in);
		System.out.print("Enter a money in RMB: ");
				
		//Defining variables
		double RMB = money.nextDouble();
		double dollar = RMB*0.1403;
		double pound = RMB*0.1141;
				
		System.out.println(RMB+" RMB is "+dollar+" dollar");
		System.out.println(RMB+" RMB is "+pound+" pound");

	}

}

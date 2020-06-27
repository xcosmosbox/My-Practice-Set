/**
 *This program can calculate acceleration
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/26
 * @version 1.0
 */ 
public class Acceleration 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Explain
		System.out.println("Welcome to use this system!");
		System.out.println("Instructions:"+'\n'+"The acceleration can be calculated by inputting the starting "+'\n'+"and ending velocities and the moving time."+'\n');
		
		//Read user input
		java.util.Scanner physics = new java.util.Scanner(System.in);
		System.out.print("Enter v0: ");
		double startV0 = physics.nextDouble();
		System.out.print("Enter v1: ");
		double endV1 = physics.nextDouble();
		System.out.print("Enter t: ");
		double time = physics.nextDouble();
		
		//Check the validity of the values
		if(startV0 >= 0)
		{
			if(endV1 >= 0)
			{
				if(time >0){}
			}
		}
		else
		{					
			System.out.println("The value you entered is not valid !");
			return;
		}
		
		double acceleration = (endV1-startV0)/time;
		System.out.println("The average acceleration is "+acceleration);
		
		
		
	}

}

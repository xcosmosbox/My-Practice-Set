/**
 *This program to calculating the energy required for any kilogram of water from its initial temperature to its final temperature
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/26
 * @version 1.0
 */ 
public class CalculatingEnergy 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Explain
		System.out.println("Welcome to use this system!");
		System.out.println("Instructions: The weight of the input water, "+'\n'+ "the starting temperature and the termination temperature "+'\n'+ "can be used to calculate the required energy."+'\n');
		
		//Read user input
		java.util.Scanner water = new java.util.Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double waterKilograms = water.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double waterStarTem = water.nextDouble();
		System.out.print("Enter the final temperature: ");
		double waterFinalTem = water.nextDouble();

		
		//Check the validity of the value entered by the user
		if(waterKilograms>0 | waterStarTem>0) 
		{
			if(waterFinalTem>0) {}
		}
		else
		{
			System.out.println("The value you entered is not valid !");
			return;
		}
		
		//Compute results
		System.out.println("The energy needed is "+(waterKilograms*(waterFinalTem-waterStarTem)*4184)+" joules");
		
	}

}

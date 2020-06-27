/**
 *This program can displays the number of years and days for the minutes
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/26
 * @version 1.0
 */ 
public class NumberOfYears 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Explain
		System.out.println("Welcome to use this system!");
		System.out.println("Instructions for Use: "+'\n'+ "Input any number of minutes to determine the corresponding number of years and days");
		
		//Read user input
		java.util.Scanner numberMins = new java.util.Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int realMinutes = numberMins.nextInt();
		
		//Define the number of minutes per year
		int yearMinutes = 525600;
		int dayMinutes = 1440;
		int yearTimes =0;
		int dayTimes =0;
		
		//Check the validity of the values
		if(realMinutes > 0 ){}
		else
		{					
			System.out.println("The value you entered is not valid !");
			return;
		}
		
		//Calculate results
		yearTimes = realMinutes / yearMinutes;
		dayTimes = (realMinutes-(yearTimes*525600)) / dayMinutes;
		
		//Compute results
		System.out.println(realMinutes+" minutes is approximately "+yearTimes+" years and "+dayTimes+" days");
		
	}

}

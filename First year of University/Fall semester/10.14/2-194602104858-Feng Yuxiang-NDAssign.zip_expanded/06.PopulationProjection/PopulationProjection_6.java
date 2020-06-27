import java.util.Scanner;
/**
 *This program to prompt the user to enter the number of years 
      and displays the population after the number of years
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/25
 * @version 1.0
 */ 
public class PopulationProjection_6 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Define variables and the number of seconds in a year.
		//Calculate variables about population in one year
		double population = 312032486.0;
		double One_year_seconds = 31536000.0; 
		double birth = One_year_seconds / 7;
		double death = One_year_seconds / 13;
		double immigrant = One_year_seconds /45;
		
		//Output instructions
		System.out.println("This program can calculate the number of population after any year!"+'\n');
		System.out.println("The following are instructions for use:");
		System.out.println("1. Be sure to enter integers and decimal numbers, and the program will report errors."+'\n'+"2. Enter an integer and press Enter to calculate."+'\n');
		System.out.print("Enter the number of years:");
		
		//Read input from console
		java.util.Scanner yearScanner = new java.util.Scanner(System.in);
		int realYear = yearScanner.nextInt();
		
		//Calculating population results
		long sum = (long)(population + realYear*(birth - death + immigrant));
		
		//Compute population results
		System.out.println("The population in "+realYear+" years is "+sum);
		
	}

}

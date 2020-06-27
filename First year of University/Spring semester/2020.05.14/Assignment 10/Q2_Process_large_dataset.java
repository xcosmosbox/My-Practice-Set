import java.net.URL;
import java.util.Scanner;

/**
 * This program can count the total and average salaries of the designated employees in the web page
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/05/14
 * @version 1.0
 * @teacher Mike , Tim
 */
public class Q2_Process_large_dataset 
{
	public static void main(String[] args) 
	{
		//Web address of given query
		String URL = "http://liveexample.pearsoncmg.com/data/Salary.txt";
		
		//Call method to query salary information of three different employees
		double[] assistant = statistics(URL,"assistant");
		double[] associate = statistics(URL,"associate");
		double[] full = statistics(URL,"full");
		
		//Output results
		System.out.println("The total salary of assistant is: "+assistant[0]);
		System.out.println("The average salary of assistant is: "+assistant[1]);
		System.out.println();
		
		//Output results
		System.out.println("The total salary of associate is: "+associate[0]);
		System.out.println("The average salary of associate is: "+associate[1]);
		System.out.println();
		
		//Output results
		System.out.println("The total salary of full is: "+full[0]);
		System.out.println("The average wage of full is: "+full[1]);
		System.out.println();
		
		//Output results
		System.out.println("The total wage for all is: "+(assistant[0]+associate[0]+full[0]));
		System.out.println("The average wage for all is: "+((assistant[0]+associate[0]+full[0])/1000));
	}
	
	/**
	 *	This method will determine salary information by querying position information 
	 */
	public static double[] statistics(String startURL, String target)
	{
		try 
		{
			//Initialize variables and open web address
			URL url = new URL(startURL);
			Scanner input = new Scanner(url.openStream());
			
			//Create total wage and total number of people variables
			double[] result = new double[2];
			double salarySum = 0.0;
			double peopleNum = 0.0;
			int index = 0;
			
			//The position information is judged by circular statement, and the salary information is further stored
			while(input.hasNext())
			{
				String str = input.next();
				
				//Use indexOf method to intercept the position of each occurrence, and add one times
				while((index = str.indexOf(target,index)) != -1)
				{
					peopleNum++;
					index += target.length();
					
					//Convert salary information in string form to floating point form
					salarySum += Double.parseDouble(input.next());
				}
			}
			
			//Store the total wage and average wage in the array and return the result
			result[0] = salarySum;
			result[1] = (salarySum/peopleNum);
			return result;
		}
		catch(java.net.MalformedURLException e)
		{
			System.out.println("Invalid URL");
			double[] result = null;
			return result ;
		}
		catch(java.io.IOException e)
		{
			System.out.println("I/O Errors: no such file");
			double[] result = null;
			return result ;
		}
	}

}

/**
 *This program can calculate the sum of all digits.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/26
 * @version 1.0
 */ 
public class SumDigits 
{
	static int sum;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Welcome to use this system!");
		System.out.println("The system can calculate the sum of any number in the range of 0 to 1000."+'\n');
		
		//Read user input
		java.util.Scanner number = new java.util.Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000: ");
		int realNumber = number.nextInt();
		
		//Check the validity of the values
		if(realNumber > 0){}
		else
		{					
			System.out.println("The value you entered is not valid !");
			return;
		}
		int startNumber = realNumber;
		
		//calculate results
		for(; realNumber >0 ;) 
		{
			sum = realNumber%10 + sum;
			realNumber = realNumber / 10;
		}
		
		//Compute results
		System.out.println("The sum of all digits in "+startNumber+" is "+sum);
		
		
	}

}

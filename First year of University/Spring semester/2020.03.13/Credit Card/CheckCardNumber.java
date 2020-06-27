/**
 * The program can prompts the user to enter a credit card number as a long integer. 
 * Judge and display whether the number is valid or invalid.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/3/3
 * @version 1.0
 * @teacher Mike , Tim
 */

import java.util.Scanner;

public class CheckCardNumber 
{
	public static void main(String[] args) 
	{
		//Prompt user for data of long type
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number as a long integer: ");
		long creditNum = input.nextLong();
		
		//Verify credit card number is legal
		String cardTemp = ""+creditNum;
		//Detection length
		if(cardTemp.length()<13 || cardTemp.length()>16)
		{
			System.out.println(creditNum+" is invalid.");
			return;
		}
		//Detect header text
		if(cardTemp.charAt(0)=='4' || cardTemp.charAt(0)=='5' || cardTemp.charAt(0)=='6' || cardTemp.charAt(0)=='3')
		{
			if(cardTemp.charAt(0)=='4' || cardTemp.charAt(0)=='5' || cardTemp.charAt(0)=='6')
			{
				checkProgram(creditNum,cardTemp.length());
			}
			else if(cardTemp.charAt(0)=='3' && cardTemp.charAt(1)=='7')
			{
				checkProgram(creditNum,cardTemp.length());
			}
			else
			{
				System.out.println(creditNum+" is invalid.");
			}
		}
		else
		{
			System.out.println(creditNum+" is invalid.");
		}
		
	}
	
	/**
	 * Judge whether the card number conforms to the rules
	 */
	public static void checkProgram(long creditNum, int cardLength)
	{
		//Using two methods to judge
		long checkStep1 = double_Interval_RightToLeft(creditNum , cardLength);
		long checkStep2 = sum_OddDigits_RightToLeft(creditNum , cardLength);
		
		//Correct card number if divisible
		if(((checkStep1+checkStep2)%10) == 0L)
		{
			System.out.println(creditNum+" is valid.");
		}
		else
		{
			System.out.println(creditNum+" is invalid.");
		}
		
	}
	
	/**
	 * From right to left, even numbers are doubled. 
	 * If it is double digit, the sum of single digit and ten digit is taken.
	 */
	public static long double_Interval_RightToLeft(long creditNum, int cardLength)
	{
		long sum = 0;
		long remainder;
		long exactDivision;
		long temp = 0;
		
		for(int i=2 ; i<=cardLength ; i+=2)
		{
			//Determine divisor size
			remainder = (long)Math.pow(10, (i));
			exactDivision = remainder/10;
			
			//Take out the number on the finger position and double it
			temp = 2*((creditNum%remainder)/exactDivision);
			if(temp >= 10)
			{
				//Sum of individual and ten
				temp = (temp%10) + (temp/10);
			}
			sum = sum + temp;
		}
		
		return sum;
	}
	
	/**
	 * Add the odd numbers in turn
	 */
	public static long sum_OddDigits_RightToLeft(long creditNum, int cardLength)
	{
		long sum = 0;
		long remainder;
		long exactDivision;
		
		for(int i=1 ; i<=cardLength ; i+=2)
		{
			//Determine divisor size
			remainder = (long)Math.pow(10, (i));
			
			//Judgment calculation method
			if(i > 1)
			{
				exactDivision = (long)Math.pow(10, (i-1));
				sum = sum + (creditNum%remainder)/exactDivision;
			}
			if(i <= 1)
			{
				sum = sum + (creditNum%remainder);
			}
			
		}
		
		return sum;
	}

}

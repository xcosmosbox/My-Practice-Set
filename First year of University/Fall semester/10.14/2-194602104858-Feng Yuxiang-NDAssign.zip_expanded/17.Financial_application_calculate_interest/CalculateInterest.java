/**
 *This program can display the interest for the next month
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/28
 * @version 1.0
 */ 
public class CalculateInterest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		//Explain
		System.out.println("Welcome to use this system!");
		System.out.println("Note: Input the percentage of current month balance and annual interest rate"+'\n'+"You can calculate the interest payable next month.");

		//Read user input
		java.util.Scanner money = new java.util.Scanner(System.in);
		System.out.print("Enter balance: ");
		double startMoney = money.nextDouble();
		System.out.print("Enter annual interest rate (e.g. 0.03 for 3%): ");
		double annualInterest = money.nextDouble();
		
		//Calculation results
		double interest = startMoney*(annualInterest/12);
		
		//Compute results
		System.out.println("This interest is "+interest);
		
		
		
		
		
		
	}

}

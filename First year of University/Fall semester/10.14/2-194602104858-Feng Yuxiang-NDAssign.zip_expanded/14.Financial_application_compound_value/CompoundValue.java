/**
 *This program to output money after six months
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/27
 * @version 1.0
 */ 
public class CompoundValue 
{
	static double endMoney;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Explain
		System.out.println("Welcome to use this system!");
		System.out.println("Instructions: Please enter the principal you deposited" +'\n'+ "The system will export money in six months");
		
		//Read user input
		java.util.Scanner money = new java.util.Scanner(System.in);
		System.out.print("Enter monthly saving amount: ");
		double startMoney = money.nextDouble();
		
		//Check the validity of the value entered by the user
		if(startMoney >= 0) {}
		else 
		{
			System.out.println("The value you entered is not valid !");
			return;
		}
		
		//Defining variables
		double interestMon = 1.00417;
		String monthly_01 = "first month, ";
		String monthly_02 = "second month, ";
		String monthly_03 = "third month, ";
		String monthly_04 = "fourth month, ";
		String monthly_05 = "fifth month, ";
		String monthly_06 = "sixth month, ";
		
		//Compute results
		endMoney = startMoney*interestMon;
		System.out.println("After the "+monthly_01+"the account value is "+endMoney);
		for(int times =2 ; times<=6 ; times++)
		{
			
			if(times ==2)
			{	
				endMoney = (startMoney + endMoney)*interestMon;
				System.out.println("After the "+monthly_02+"the account value is "+endMoney);
			
			}
			if(times ==3)
			{	
				endMoney = (startMoney + endMoney)*interestMon;
				System.out.println("After the "+monthly_03+"the account value is "+endMoney);
			
			}
			if(times ==4)
			{	
				endMoney = (startMoney + endMoney)*interestMon;
				System.out.println("After the "+monthly_04+"the account value is "+endMoney);
			
			}
			if(times ==5)
			{	
				endMoney = (startMoney + endMoney)*interestMon;
				System.out.println("After the "+monthly_05+"the account value is "+endMoney);
			
			}
			if(times ==6)
			{	
				endMoney = (startMoney + endMoney)*interestMon;
				System.out.println("After the "+monthly_06+"the account value is "+endMoney);
			
			}
		}
		
	}

}

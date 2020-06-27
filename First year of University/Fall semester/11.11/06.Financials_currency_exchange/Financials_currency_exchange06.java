/**The program can exchange rate conversion
 * 
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/10/15
 * @version 1.0
 */ 
public class Financials_currency_exchange06 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//read user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int exchange = input.nextInt();
		
		////Judge whether the value entered by the user is legal
		if(exchange != 0 && exchange != 1)
		{
			System.out.println("You data is error! Please input data again.");
			return;
		}
		
		//Calculate and output results
		switch(exchange)
		{
			case 0:	System.out.print("Enter the dollar amout: ");
					double money_0 = input.nextDouble();
					double endMoney_0 = money_0 * rate;
					System.out.println("$"+money_0+" is "+endMoney_0+" yuan");
					break;
			case 1:	System.out.print("Enter the RMB amout: ");
					double money_1 = input.nextDouble();
					double endMoney_1 = money_1 / rate;
					System.out.println(money_1+" yuan is "+"$"+endMoney_1);
					break;
		}
		
		
		
	}

}

/**
 * This program can create a new account. 
 * This account has name, ID, balance and other information. 
 * Each transaction can be billed and output at the end.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/03
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTestProgram 
{
	public static void main(String[] args) 
	{
		//Set annual interest rate
		NewAccount.setAnnualInterestRate(1.5);
		
		//Create NewAccount object
		NewAccount account = new NewAccount("George",1122,1000);
		
		//Three deposit transactions
		account.deposit('D',30, "ICBC");
		account.deposit('D',40, "ICBC");
		account.deposit('D',50, "ICBC");
		
		//Three expenditure transactions
		account.withDraw('W', 5, "Taobao--web");
		account.withDraw('W', 4, "JD--web");
		account.withDraw('W', 2, "eBuy--web");

		//Print details using the overridden toString method and for loop.
		System.out.println(account.toString());
		System.out.println("---------------------------------------------");
		System.out.println("Here is the bill flow: ");
		for(int i=0; i<account.getTransaction(); i++)
		{
			System.out.println(account.getTransactions().get(i));
			System.out.println("---------------------------------------------");
		}
		

	}

}

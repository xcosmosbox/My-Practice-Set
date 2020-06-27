/**
 * This program can deposit and withdraw money from two different accounts, 
 * and output basic information and transaction bills.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/17
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTest 
{
	public static void main(String[] args) 
	{
		//Set annual interest rate
		NewAccount.setAnnualInterestRate(4.5);
		
		//Create two different account objects
		NewAccount checking = new NewChecking (11111,"FENG Yuxiang",2000,300);
		NewAccount saving = new NewSaving (22222,"FENG Yuxiang",2000); 
		
		//Deposit and withdrawal of credit card account
		checking.withdraw('W', 2200, "Tao Bao");
		checking.withdraw('W', 1000, "JD web");
		checking.withdraw('W', 50, "eBuy");
		checking.deposit('D', 30, "ICBC");
		checking.deposit('D', 40, "ICBC");
		checking.deposit('D', 50, "ICBC");
		
		//Deposit and withdrawal operation of savings card account
		saving.withdraw('W', 2200, "Mobile Game");
		saving.withdraw('W', 1000, "Tencent Game");
		saving.withdraw('W', 50, "Steam Game");
		saving.deposit('D', 30, "CCB");
		saving.deposit('D', 40, "CCB");
		saving.deposit('D', 50, "CCB");
		
		//Output basic information and all transactions of checking card account
		System.out.println(checking.toString());
		System.out.println("---------------------------------------------");
		System.out.println("Here is the bill flow: ");
		for(int i=0; i<checking.getTransactions().size(); i++)
		{
			System.out.println(checking.getTransactions().get(i));
			System.out.println("---------------------------------------------");
		}
		System.out.println("/////////////////////////////////////////////");
		System.out.println("---------------------------------------------");
		System.out.println();
		
		//Output basic information and all transaction records of savings card account
		System.out.println(saving.toString());
		System.out.println("---------------------------------------------");
		System.out.println("Here is the bill flow: ");
		for(int i=0; i<saving.getTransactions().size(); i++)
		{
			System.out.println(saving.getTransactions().get(i));
			System.out.println("---------------------------------------------");
		}
		System.out.println("/////////////////////////////////////////////");
		System.out.println("---------------------------------------------");
		System.out.println();
	}

}

/**
 * This program can print two kinds of account ID, 
 * balance, monthly interest and special properties.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/03
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTest 
{
	public static void main(String[] args) 
	{
		//Set annual interest rate
		Account.setAnnualInterestRate(4.5);
		
		//Create Account object and make deposits and withdrawals
		Account account_0 = new Account(3937,20000.0);
		account_0.withDraw(2500);
		account_0.deposit(3000);
		
		//Print account information
		System.out.println(account_0.toString());
		System.out.println("-------------------------------");
		
		//Create saving account object and make deposits and withdrawals
		SavingAccount account_1 = new SavingAccount(1122,20000.0);
		System.out.println(account_1.getBalance());
		account_1.withDraw(2500);
		System.out.println(account_1.getBalance());
		account_1.deposit(3000);
		System.out.println(account_1.getBalance());
		
		//Print saving account information
		System.out.println(account_1.toString());
		System.out.println("-------------------------------");
		
		//Create Account object and make deposits and withdrawals
		CheckingAccount account_2 = new CheckingAccount(2211,20000.0);
		System.out.println(account_2.getBalance());
		account_2.withDraw(2500);
		System.out.println(account_2.getBalance());
		account_2.deposit(3000);
		System.out.println(account_2.getBalance());
		account_2.withDraw(23000);
		System.out.println(account_2.getBalance());
		
		//Print checking account information
		System.out.println(account_2.toString());
		System.out.println("-------------------------------");
	}

}

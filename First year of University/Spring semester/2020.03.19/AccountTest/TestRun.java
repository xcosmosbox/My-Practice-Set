/**
 * This program can create Account objects and perform access operations. 
 * Finally print out the account balance, monthly interest and account opening time.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/03/13
 * @version 1.0
 * @teacher Mike , Tim
 */
public class TestRun
{
	public static void main(String[] args) 
	{
		//Create Account object
		Account account = new Account(1122,20000.0);
		
		//Make deposits and withdrawals
		account.withDraw(2500);
		account.deposit(3000);
		
		//Print account information
		System.out.println("Account balance is: "+account.getBalance());
		System.out.println("Account monthly interest is: "+account.getMonthlyInterestRate());
		System.out.println("Account opening time is: "+account.getDateCreated().toString());
	}

}

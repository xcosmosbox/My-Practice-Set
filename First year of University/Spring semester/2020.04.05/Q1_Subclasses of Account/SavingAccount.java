/**
 * This is a subclass of an account class. 
 * This subclass is a savings account with no overdraft limit. 
 * You can print the information of this savings account by calling toString in this class.
 */
public class SavingAccount extends Account
{
	//Construction method without parameters
	public SavingAccount() 
	{
		super();
	}
	
	//Construction method with parameters
	public SavingAccount(int id, double balance) 
	{
		super(id, balance);
	}
	
	//Print information for this account
	public String toString()
	{
		return "The account is saving account and there are more information:\n"
				+"Saving account can not overdrawn.\n"
				+"Account ID is: "+this.getId()+"\n"
				+"Account balance is: "+this.getBalance()+"\n"
		        +"Account monthly interest is: "+this.getMonthlyInterestRate()+"\n"
		        +"Account opening time is: "+this.getDateCreated().toString();
	}
	
}

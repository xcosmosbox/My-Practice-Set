/**
 * This is a subclass of an account class. 
 * This subclass is a checking account with an overdraft limit. 
 * You can print the information of this checking account 
 * by calling toString in this class.
 */
public class CheckingAccount extends Account
{
	//Create overdraft lines for checking accounts
	private double overdrawn = 5000;

	//Construction method without parameters
	public CheckingAccount() 
	{
		super();
	}

	//Construction method with parameters
	public CheckingAccount(int id, double balance) 
	{
		super(id, balance);
	}
	
	//
	@Override
	public void withDraw(double money)
	{
		//Check whether the existing balance can be paid
		double temp = super.getBalance() - money;
		
		//Choose the appropriate deduction method through the judgment statement
		if(temp<=0 && this.getOverdrawn()>=0)
		{
			temp = money-super.getBalance();
			this.overdrawn = this.overdrawn - temp;
			super.setBalance(0);
		}
		else if(temp<=0 && this.getOverdrawn()<=0)
		{
			System.out.println("There is no overdraft balance, unable to consume!");
			System.exit(0);
		}
		else
		{
			super.withDraw(money);
		}
		
	}
	public void deposit(double money)
	{
		super.deposit(money);
	}
	
	//Getter and setter method of overdraft limit
	public double getOverdrawn() 
	{
		return overdrawn;
	}
	public void setOverdrawn(double overdrawn)
	{
		this.overdrawn = overdrawn;
	}

	//Print information for this account
	public String toString()
	{
		return "The account is checking account and there are more information:\n"
				+"Account ID is: "+this.getId()+"\n"
				+"Account overdrawn balance is: "+this.getOverdrawn()+"\n"
				+"Account balance is: "+this.getBalance()+"\n"
		        +"Account monthly interest is: "+this.getMonthlyInterestRate()+"\n"
		        +"Account opening time is: "+this.getDateCreated().toString();
	}

}

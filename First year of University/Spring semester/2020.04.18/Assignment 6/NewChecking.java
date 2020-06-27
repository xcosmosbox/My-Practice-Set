/**
 *	This is a credit card account class, which is a subclass of the NewAccount class.
 *	It has an overdraft. 
 */
public class NewChecking extends NewAccount
{
	//Create overdraft lines for checking accounts
	private double overdrawn;
	private double contrastOverdrawn;
	
	
	//Construction method with parameters
	public NewChecking(int id, String name, double balance, double overdrawn) 
	{
		super(id, name, balance);
		this.setOverdrawn(overdrawn);
		this.contrastOverdrawn = overdrawn;
	}

	//Getter and Setter about the overdrawn
	public double getOverdrawn() 
	{
		return overdrawn;
	}
	public void setOverdrawn(double overdrawn) 
	{
		this.overdrawn = overdrawn;
	}

	//Implements the abstract method of the parent class
	@Override
	public void withdraw(char type,double money,String description) 
	{
		//Check whether the existing balance can be paid
		double temp = super.getBalance() - money;
		double overDrawnTemp = this.getOverdrawn() - (money - super.getBalance());
		
		//Choose the appropriate deduction method through the judgment statement
		if((temp<=0 && this.getOverdrawn()>=0) && overDrawnTemp>=0)
		{
			//Store transaction bills
			addTransaction(type, money, description, false);
			temp = money-super.getBalance();
			this.overdrawn = overDrawnTemp;
			super.setBalance(0);
		}
		else if((temp<=0 && this.getOverdrawn()>=0) && overDrawnTemp<0)
		{
			//Store transaction bills
			addTransaction(type, money, description, true);
			System.out.println("Your balance and overdraft balance are not enough to perform this operation. \n");
		}
		else
		{
			//Store transaction bills
			addTransaction(type, money, description, false);
			
			//Modify the balance in the parent class
			super.setBalance(super.getBalance() - money);
			
		}
	}

	//Implements the abstract method of the parent class
	@Override
	public void deposit(char type,double money,String description) 
	{
		if(this.contrastOverdrawn == this.getOverdrawn())
		{
			//Operate on the balance in the parent class
			super.setBalance(this.getBalance() + money);
		}
		else
		{
			//Judge whether the deposit amount can fully repay the credit card debt
			if((this.overdrawn+money) <= this.contrastOverdrawn)
			{
				//It is stated here that the deposit amount shall be fully repaid by credit card
				this.setOverdrawn(this.getOverdrawn() + money);
			}
			else
			{
				//It is stated here that the deposit amount can fully repay the credit card debt
				this.setOverdrawn(this.contrastOverdrawn);
				
				//Operate on the balance in the parent class
				super.setBalance(this.getBalance() - money-this.contrastOverdrawn);
			}
			
		}
		//Store transaction bills
		addTransaction(type, money, description, false);
	}

}

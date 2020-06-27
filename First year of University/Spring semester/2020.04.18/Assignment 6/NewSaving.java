/**
 *	This is a savings account, which is a subclass of NewAccount.
 *	It implements two abstract methods from the parent class. 
 */
public class NewSaving extends NewAccount
{
	//Construction method with parameters
	public NewSaving(int id, String name, double balance)
	{
		super(id, name, balance);
	}

	//Implements the abstract method of the parent class
	@Override
	public void withdraw(char type,double money,String description) 
	{
		if((super.getBalance()-money) <= 0)
		{
			//The operation described here cannot be carried out normally
			addTransaction(type, money, description, true);
			System.out.println("You cannot do this because your balance is insufficient. \n");
		}
		else
		{
			//The transaction can be carried out normally
			addTransaction(type, money, description, false);
			
			//Operate on the balance in the parent class
			super.setBalance(this.getBalance() - money);
		}

	}

	//Implements the abstract method of the parent class
	@Override
	public void deposit(char type,double money,String description) 
	{
		addTransaction(type, money, description, false);
		
		//Operate on the balance in the parent class
		super.setBalance(this.getBalance() + money);
	}

}

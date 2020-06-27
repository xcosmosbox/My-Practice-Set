import java.util.Date;
/**
 * This is a transaction class. 
 * This class can form a bill for each transaction, 
 * and output information such as creation time and transaction amount. 
 */
public class Transaction
{
	//Create the required variables
	private Date transactionDate;
	private char type;
	private double balance;
	private double amount;
	private String description;
	
	//A method of parametric construction with identifying operation behavior
	public Transaction(char type, double amount, double balance, String description, boolean isError)
	{
		this.transactionDate = new Date();
		this.balance = balance;
		this.description = description;
		this.setAmount(amount);
		this.setType(type);
		if(!isError)
		{
			if(this.type == 'W') this.withDraw(amount);
			if(this.type == 'D') this.deposit(amount);
		}
		
	}
	
	//On setter and getter methods of all variables
	public Date getTransactionDate() 
	{
		return this.transactionDate;
	}
	public void setTransactionDate(Date transactionDate) 
	{
		this.transactionDate = transactionDate;
	}
	public char getType() 
	{
		return this.type;
	}
	public void setType(char type) 
	{
		this.type = type;
	}
	public double getAmount() 
	{
		return this.amount;
	}
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getBalance() 
	{
		return this.balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	//Deposit and withdrawal method
	public void withDraw(double amount)
	{
		this.setBalance(this.getBalance() - amount);
	}
	public void deposit(double amount)
	{
		this.setBalance(this.getBalance() + amount);
	}
	
	//Print transaction creation time, amount and other information
	@Override
	public String toString()
	{
		if(this.getType() == 'W')
		{
			return "Operation time: "+transactionDate.toString()+"\n"+
				   "Consumption: "+this.amount+"\n"+
				   "Transaction details: "+description+"\n";
		}
		else
		{
			return "Operation time: "+transactionDate.toString()+"\n"+
				   "Deposit: "+this.amount+"\n"+
				   "Transaction details: "+description+"\n";
		}
		
	}
	
	
	
}

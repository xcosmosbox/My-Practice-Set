import java.util.ArrayList;
import java.util.Date;

/**
 *	This class is an account class, a parent class. 
 *	It has some basic information of an account and can output basic information of the rewritten toString method. 
 */
public abstract class NewAccount
{
	//Create variable
	private int id = 0;
	private String name;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;
	
	//This is an ArrayList collection that implements the List interface. 
	//This collection uses generic to standardize the data model. 
	//This collection can store all bills. 
	//This is a linked list structure.
	private ArrayList<Transaction> t = new ArrayList<>();
	
	//Add each transaction to the transaction queue
	protected void addTransaction(char type,double money,String description, boolean isError)
	{
		t.add(new Transaction(type,money,this.balance,description,isError));
	}
	

	//A parametric construction method with three variables: id, name and balance
	public NewAccount(int id, String name, double balance) 
	{
		this.id = id;
		this.name = name;
		this.setBalance(balance);
		dateCreated = new Date();
	}
	
	//Getter and Setter about id/name/balance/annualInterestRate
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public static double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}
	public static void setAnnualInterestRate(double annualInterestRate) 
	{
		NewAccount.annualInterestRate = annualInterestRate;
	}
	public ArrayList<Transaction> getTransactions() 
	{
		return t;
	}
	public void setTransactions(ArrayList<Transaction> transactions)
	{
		this.t = transactions;
	}

	//Back to account opening time
	public Date getDateCreated() 
	{
		return this.dateCreated;
	}
	
	//Return monthly interest rate
	public double getMonthlyInterestRate()
	{
		return ((annualInterestRate/100.0)/12.0);
	}
	
	//Return monthly interest
	public double getMonthlyInterest()
	{
		return this.balance*((annualInterestRate/100.0)/12.0);
	}

	//On the abstract method of deposit and withdrawal
	public abstract void withdraw(char type,double money,String description);
	public abstract void deposit(char type,double money,String description);
	
	@Override
	//Output basic information of this account.
	public String toString()
	{
		return "Account name: "+this.getName()+"\n"+
			   "Account ID: "+this.getId()+"\n"+
			   "Account balance: "+this.getBalance()+"\n"+
			   "Account month in interest rate: "+this.getMonthlyInterestRate()+"\n"+
			   "Account month in interest: "+this.getMonthlyInterest()+"\n";
	}



	
	
}

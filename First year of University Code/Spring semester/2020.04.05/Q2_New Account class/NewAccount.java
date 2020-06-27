import java.util.ArrayList;
import java.util.Date;
/**
 * This is a new account class. This account class can create a 
 * collection of bills and store each transaction with the collection. 
 * Finally, it can output the basic information of the account and all the bills. 
 */
public class NewAccount 
{
	//Create the required variables
	private String name;
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	private int transaction = 0;
	
	//This is an ArrayList collection that implements the List interface. 
	//This collection uses generic to standardize the data model. 
	//This collection can store all bills. 
	//This is a linked list structure.
	private ArrayList<Transaction> transactions = new ArrayList<>();
	
	//Construction method without parameters
	public NewAccount() 
	{
		this.name = "null";
		this.id = 0;
		this.balance = 0;
		this.dateCreated = new Date();
	}
	//Constructor with parameters
	public NewAccount(int id, double balance) 
	{
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}
	//Parametric structure with name, ID and balance
	public NewAccount(String name, int id, double balance) 
	{
		this.setName(name);
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}
	
	
	//A set of getters and setters
	public String getName() 
	{
		return this.name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getId() 
	{
		return this.id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public double getBalance() 
	{
		return this.balance;
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
	public int getTransaction()
	{
		return transaction;
	}
	public void setTransaction(int transaction)
	{
		this.transaction = transaction;
	}
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	//Back to account opening time
	public Date getDateCreated() 
	{
		return this.dateCreated;
	}
	
	//Return monthly interest
	public double getMonthlyInterestRate()
	{
		double monthlyInterestRate;
		monthlyInterestRate = balance*((annualInterestRate/100.0)/12.0);
		return monthlyInterestRate;
	}

	//Deposit and withdrawal method
	//Both methods contain the operation and storage of statements. So that every transaction can be recorded.
	public void withDraw(char type,double money,String description)
	{
		transactions.add(new Transaction(type,money,this.balance,description));
		transaction++;
		this.balance = this.balance - money;
		
	}
	public void deposit(char type,double money,String description)
	{
		transactions.add(new Transaction(type,money,this.balance,description));
		transaction++;
		this.balance = this.balance + money;
	}
	
	//Output basic information of this account.
	@Override
	public String toString()
	{
		return "Account name: "+this.getName()+"\n"+
			   "Account month in interest rate: "+this.getMonthlyInterestRate()+"\n"+
			   "Account balance: "+this.getBalance()+"\n";
	}

}

import java.util.Date;

//This is an account object
public class Account 
{
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;
	
	//Construction method without parameters
	public Account() 
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	//Constructor with parameters
	public Account(int id, double balance) 
	{
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	//A set of getters and setters
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
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
		Account.annualInterestRate = annualInterestRate;
	}
	
	//Back to account opening time
	public Date getDateCreated() 
	{
		return dateCreated;
	}
	
	//Return monthly interest
	public double getMonthlyInterestRate()
	{
		double monthlyInterestRate;
		monthlyInterestRate = balance*((annualInterestRate/100.0)/12.0);
		return monthlyInterestRate;
	}
	
	//Deposit and withdrawal method
	public void withDraw(double money)
	{
		balance = balance - money;
	}
	public void deposit(double money)
	{
		balance = balance + money;
	}
	
}

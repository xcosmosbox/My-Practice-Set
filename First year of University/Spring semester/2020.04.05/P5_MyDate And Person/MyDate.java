import java.util.GregorianCalendar;
/**
 *  This class can calculate and output dates after importing the GregorianCalendar package.
 */
public class MyDate
{
	//Hint: the month is 0~11
	private int year;
	private int month;
	private int day;
	
	// no-arg constructor
	public MyDate() 
	{
		GregorianCalendar date = new GregorianCalendar();
		this.year = date.get(GregorianCalendar.YEAR);
		this.month = date.get(GregorianCalendar.MONTH);
		this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
		
	}

	//A construction method with parameters with ElapsedTime parameters
	public MyDate(long elapsedTime) 
	{
		GregorianCalendar date = new GregorianCalendar();
		date.setTimeInMillis(elapsedTime);
		this.year = date.get(GregorianCalendar.YEAR);
		this.month = date.get(GregorianCalendar.MONTH);
		this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
		
	}
	
	//A construction method with parameters of year, month and day
	public MyDate(int year,int mouth,int day) 
	{
		this.year = year;
		this.month = mouth;
		this.day = day;
	}

	//Getter method of year, month and day
	public int getYear()
	{
		return this.year;
	}
	public int getMonth()
	{
		return this.month+1;
	}
	public int getDay()
	{
		return this.day;
	}
	
	//Setter method of Date
	public void setDate(long elapsedTime) 
	{
		GregorianCalendar date = new GregorianCalendar();
		date.setTimeInMillis(elapsedTime);
		this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
		this.month = date.get(GregorianCalendar.MONTH);
		this.year = date.get(GregorianCalendar.YEAR);
		
	}	
	
	//Output the month, day and year
	@Override
	public String toString()
	{
		return (this.month+1)+" \\ "+this.day+" \\ "+this.year;
	}
	
}

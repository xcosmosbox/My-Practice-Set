public class printCalendar 
{
	/**part1
	 * This is main method
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Read user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter full year (e.g ,2012): ");
		int year = input.nextInt();
		System.out.print("Enter month as number between 1 and 12: ");
		int month = input.nextInt();
		System.out.println();
		
		//Transfer parameters
		printMonth(year,month);

	}
//-------------------------------------------------------------------------------------------// part 1
	
	/**part2
	 * Display month and day
	 */
	public static void printMonth(int year, int month)
	{
		//Display month title
		printMonthTitle(year , month);
		
		//Display month body
		printMonthBody(year , month);
	}
//-------------------------------------------------------------------------------------------// part 2 
	
	/**part3
	 * Display month title and month name
	 * @param year
	 * @param month
	 */
	public static void printMonthTitle(int year, int month)
	{
		String monthName = getMonthName(month);
		System.out.printf("%8s %6d",monthName,year);
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	public static String getMonthName(int month)
	{
		String title = "";
		switch(month)
		{
			case 1:title="January";break;
			case 2:title="February";break;
			case 3:title="March";break;
			case 4:title="April";break;
			case 5:title="May";break;
			case 6:title="June";break;
			case 7:title="July";break;
			case 8:title="August";break;
			case 9:title="September";break;
			case 10:title="October";break;
			case 11:title="November";break;
			case 12:title="December";break;
		}
		return title;
	}
//-------------------------------------------------------------------------------------------//	part 3 
	
	/**part4
	 * Display month body and judge start day.
	 * @param year
	 * @param month
	 */
	public static void printMonthBody(int year, int month)
	{
		int startDay = getStartDay(year,month);
		int numberOfDayInMonth = getNumberOfDayInMonth(year ,month);
		
		int i = 0;
		for(i=0; i<startDay; i++)
		{
			System.out.print("    ");
		}
		
		for(i=1; i<=numberOfDayInMonth; i++)
		{
			System.out.printf("%4d",i);
			if((startDay+i)%7 == 0)
			{
				System.out.println();
			}
		}
	}
	
	//The given month is calculated from the day of the week
	public static int getStartDay(int year, int month)
	{
		final int START_DAY_FOR_1_1_1800 = 3;
		
		//How many days in total
		int totalNumberOfDays = getTotalNumberOfDays(year , month);
		
		//What day of the week is the beginning of the return
		return (totalNumberOfDays + START_DAY_FOR_1_1_1800)%7;
	}
	
	//Calculate the total number of days since the date
	public static int getTotalNumberOfDays(int year, int month)
	{
		int total = 0;
		
		for(int i=1800; i<year; i++)
		{
			if(isLeapYear(year))
			{
				total = total + 366;
			}
			else 
			{
				total = total + 365;
			}
		}
		
		for(int j=1; j<month; j++)
		{
			total = total + getNumberOfDayInMonth(year,j);
		}
		return total;
	}
	
	//Judge the number of days in the month
	public static int getNumberOfDayInMonth(int year, int month)
	{
		int numOfDayInMonth = 0;
		if(isLeapYear(year) && month==2)
		{
			numOfDayInMonth = 29;
		}
		else if(isLeapYear(year)==false && month == 2)
		{
			numOfDayInMonth = 28;
		}
		
		if(month==4 || month==6 || month==9 || month==11)
		{
			numOfDayInMonth = 30;
		}
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		{
			numOfDayInMonth = 31;
		}
		return numOfDayInMonth;
	}
	
	//Determine if it is a leap year
	public static boolean isLeapYear(int year)
	{
		boolean result = false;
		if(year%400 == 0  ||  (year%4 == 0  &&  year%100 != 0))	
		{
			result = true;
		}
		return result;
	}
//-------------------------------------------------------------------------------------------//	part 4

}

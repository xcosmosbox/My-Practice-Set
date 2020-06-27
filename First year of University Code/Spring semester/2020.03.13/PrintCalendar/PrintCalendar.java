public class PrintCalendar 
{
	public static void main(String[] args)
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Read user input
		System.out.print("Enter full year(e.g.,2012): ");
		int year = input.nextInt();
		
		System.out.print("Enter month as number between 1 and 12: ");
		int month = input.nextInt();

		printMonth(year, month);
	}
	
	public static void printMonth(int year, int month)
	{
		printMonthTitle(year, month);
		
		printMonthBody(year, month);
	}
	
	public static void printMonthTitle(int year, int month)
	{
		System.out.println("     "+getMonthName(month)+" "+year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	public static String getMonthName(int month)
	{
		String monthName = "";
		switch(month)
		{
			case 1: monthName = "January";
			case 2: monthName = "February";
			case 3: monthName = "March";
			case 4: monthName = "April";
			case 5: monthName = "May";
			case 6: monthName = "June";
			case 7: monthName = "July";
			case 8: monthName = "August";break;
			case 9: monthName = "September";break;
			case 10: monthName = "October";break;
			case 11: monthName = "November";break;
			case 12: monthName = "December";break;
		}
		
		return monthName;
	}
	
	public static void printMonthBody(int year, int month)
	{
		int startDay = getStartDay(year, month);
		
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		
		for(int i=0; i<startDay; i++)
		{
			System.out.print("   ");
		}
		
		for(int i=1; i<=numberOfDaysInMonth; i++)
		{
			System.out.printf("%4d", i);
			
			if((i+startDay)%7 == 0)
			{
				System.out.println();
			}
		}
	}
	
	public static int getStartDay(int year, int month)
	{
		final int START_DAYS_FOR_1_JAN_1800 = 3;
		int totleNumberOfDays = getTotleNumberOfDays(year, month);
		
		return (totleNumberOfDays+3) % 7;
	}
	
	public static int getTotleNumberOfDays(int year, int month)
	{
		int totalDays = 0;
		for(int i=1800; i<year; i++)
		{
			if(isLeapYear(i))
			{
				totalDays = totalDays + 366;
			}
			else
			{
				totalDays = totalDays + 365;
			}
		}
		
		for(int i=1; i<month; i++)
		{
			totalDays = totalDays + getNumberOfDaysInMonth(year, i);
		}
		
		return totalDays;
	}
	
	public static int getNumberOfDaysInMonth(int year, int month)
	{
		if(month==1 ||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12)
		{
			return 31;
		}
		else if(month==4 ||month==6 ||month==9 ||month==11)
		{
			return 30;
		}
		
		if(isLeapYear(year))
		{
			return 29;
		}
		else
		{
			return 28;
		}
	}
	
	public static boolean isLeapYear(int year)
	{
		return year%400==0 || (year%4==0 && year%100!=0);
	}

}

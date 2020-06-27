/**The program can comput today and user enter the number of days after today
 * 
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/10/14
 * @version 1.0
 */ 
public class FindFutureDates_2 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//read user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter today's day : ");
		int today = input.nextInt();
		System.out.print("Enter the number of elapsed since today: ");
		int futureDay = input.nextInt();
		futureDay = futureDay + today;
		String todayNum = null; 
		String futureNum = null;
		
		//Check whether user input is legitimate
		if((today>= 0 & today<=6) && futureDay>0) {}
		else
		{
			System.out.println("The data you entered is not valid !");
			return;
		}
		
		//solve today's day result
		switch(today)
		{
			case 0:
				todayNum = "Sunday";
				break;
			case 1:
				todayNum = "Monday";
				break;
			case 2:
				todayNum = "Tuesday";
				break;
			case 3:
				todayNum = "Wednesday";
				break;
			case 4:
				todayNum = "Thursday";
				break;
			case 5:
				todayNum = "Thursday";
				break;
			case 6:
				todayNum = "Saturday";
				break;
		}
		
		//solve future's day result
		switch(futureDay = futureDay % 7)
		{
			case 0:
				futureNum = "Sunday";
				break;
			case 1:
				futureNum = "Monday";
				break;
			case 2:
				futureNum = "Tuesday";
				break;
			case 3:
				futureNum = "Wednesday";
				break;
			case 4:
				futureNum = "Thursday";
				break;
			case 5:
				futureNum = "Thursday";
				break;
			case 6:
				futureNum = "Saturday";
				break;
		}
		
		//Output result
		System.out.println("Toady is "+todayNum+" and the future day is "+futureNum);
		
		

	}

}

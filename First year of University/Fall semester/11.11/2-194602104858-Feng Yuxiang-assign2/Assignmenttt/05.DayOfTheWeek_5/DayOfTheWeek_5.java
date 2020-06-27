/**The program can calculate the day of the week.
 * 
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/10/15
 * @version 1.0
 */ 
public class DayOfTheWeek_5 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//read user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter year (e.g., 2012): ");
		int year = input.nextInt(); //year in the formula
		System.out.print("Enter month: ");
		int month = input.nextInt(); //m in the formula
		System.out.print("Enter the day of the month (1-31): ");
		int dayOfMon = input.nextInt(); //q in the formula
		String word = "Day of the week is ";
		
		//Judge whether the value entered by the user is legal
		if(year>0 && month>=1 && month<=12 && dayOfMon>=1 && dayOfMon<=31 ) {}
		else
		{
			System.out.println("You data is error!");
			return;
		}
		
		//Judge month
		if(month==1 || month ==2)
		{
			if(month == 1) month = 13;
			if(month == 2) month = 14;
		}
		
		//Calculate result
		int h; //day of the week
		int j=(year/100); //is the century
		int k=(year%100) ; //is the year of the century
		h = (dayOfMon+(26*(month+1)/10)+k+(k/4)+(j/4)+5*j)%7 ;
		
		//Output result
		switch(h)
		{
			case 0:System.out.println(word + "Saturday");break;
			case 1:System.out.println(word + "Sunday");break;
			case 2:System.out.println(word + "Monday");break;
			case 3:System.out.println(word + "Tuesday");break;
			case 4:System.out.println(word + "Wednesday");break;
			case 5:System.out.println(word + "Thursday");break;
			case 6:System.out.println(word + "Friday");break;
		
		}

	}

}

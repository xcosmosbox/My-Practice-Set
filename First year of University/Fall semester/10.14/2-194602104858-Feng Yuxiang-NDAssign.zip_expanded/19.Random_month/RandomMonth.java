import java.util.Random;

/**
 *This program can output the month corresponding to the number.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/28
 * @version 1.0
 */ 
public class RandomMonth 
{
	public static int number = new Random().nextInt(12)+1;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Explain
		System.out.println("Welcome to use this system!");
		System.out.println("Note: A random number can be obtained by clicking on it."+'\n'+"And get the month corresponding to that number.");
		
		//Compute results
		System.out.println("The random number is "+ number +" .");
		if(number == 1)
		{
			System.out.println("Month is January");
		}
		if(number == 2)
		{
			System.out.println("Month is February");
		}
		if(number == 3)
		{
			System.out.println("Month is March");
		}
		if(number == 4)
		{
			System.out.println("Month is April");
		}
		if(number == 5)
		{
			System.out.println("Month is May");
		}
		if(number == 6)
		{
			System.out.println("Month is June");
		}
		if(number == 7)
		{
			System.out.println("Month is July");
		}
		if(number == 8)
		{
			System.out.println("Month is August");
		}
		if(number == 9)
		{
			System.out.println("Month is September");
		}
		if(number == 10)
		{
			System.out.println("Month is October");
		}
		if(number == 11)
		{
			System.out.println("Month is November");
		}
		if(number == 12) 
		{
			System.out.println("Month is December");
		}
	}

}

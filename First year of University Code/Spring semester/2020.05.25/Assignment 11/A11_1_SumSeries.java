import java.util.Scanner;

/**
 *	 This program can calculate the sum of series
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/05/25
 * @version 1.0
 * @teacher Mike , Tim
 */
public class A11_1_SumSeries 
{
	public static void main(String[] args) 
	{
		//Using cycle to output the sum of series in different situations
		double number = 1.0;
		for(int i=0; i<10; i++)
		{
			//Output result
			System.out.println("The sum series m("+(int)number+") are: "+sumSerie(number));
			number++;
		}
	}
	
	/*The method of calculating the sum of sequence by recursion*/
	public static double sumSerie(double i)
	{
		if(i==1)
		{
			return 0.5;
		}
		else
		{
			return ((i/(i+1))+(sumSerie(i-1)));
		}
	}

}

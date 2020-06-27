import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program can check whether the two integers entered by 
 * the user are legal and calculate the result of addition
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/30
 * @version 1.0
 * @teacher Mike , Tim
 */
public class Q1_InputMismatchException 
{
	public static void main(String[] args) 
	{
		sumTwoInteger();
	}
	
	//The method of calculating the combination of two integers
	public static void sumTwoInteger() throws InputMismatchException
	{
		//Prompt user for input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two integers: ");
		
		//Abnormal receiving and throwing
		try
		{
			System.out.print("The integer one: ");
			int num_1 = input.nextInt();
			System.out.print("The integer two: ");
			int num_2 = input.nextInt();
			System.out.println("The sum of these two integers is: "+(num_1+num_2));
		}
		catch(InputMismatchException ex)
		{
			System.out.println("The data you entered is illegal. Please re-enter ------------ >");
			System.out.println("---------------------------------------------------------------");
			sumTwoInteger();
		}
		
		
	}

}

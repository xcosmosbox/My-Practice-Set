import java.util.Scanner;

/**
 *	 This program can get the greatest common divisor by rolling phase division
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/05/25
 * @version 1.0
 * @teacher Mike , Tim
 */
public class A11_3_ComputeGCD 
{
	public static void main(String[] args) 
	{
		//Prompt user for input
		Scanner input = new Scanner(System.in);
		System.out.print("Please input number of m: ");
		int m = input.nextInt();
		System.out.print("Please input number of n: ");
		int n = input.nextInt();
		
		//Get the greatest common divisor by recursion
		System.out.println("The greatest common divisor of M and N is: "+gcd(m,n));

	}
	
	/*This is a recursive method to get the greatest common divisor by the division of rolling phase*/
	public static int gcd(int m, int n)
	{
		if(m%n == 0)
		{
			return n;
		}
		else
		{
			return gcd(n,m%n);
		}
	}

}

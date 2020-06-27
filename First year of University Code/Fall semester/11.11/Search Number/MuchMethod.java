/**
 * 
 */

/**
 * @author apple
 *
 */
public class MuchMethod 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int biggest = input();
		output(biggest);
		int multiplier = factorial(biggest);
		System.out.println("this factorial is "+multiplier);
		
	}
	
	public static int factorial(int number)
	{
		int result = 1;
		for(int i=1 ;i<=number ;i++)
		{
			result = result*i;
		}
		return result;
	}
	
	public static int input()
	{
		int result;
		java.util.Scanner input = new java.util.Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		result = max(a,b,c);
		return result;
	}
	
	public static int max(int num1 , int num2 , int num3)
	{
		int result = 0;
		if(num1>num2 && num1>num3)
		{
			result = num1;
		}
		else if(num2>num1 && num2>num3)
		{
			result = num2;
		}
		else if(num3>num1 && num3>num2)
		{
			result = num3;
		}
		return result;
	}

	public static void output(double max)
	{
		System.out.println("the max number is: "+max);
	}
}

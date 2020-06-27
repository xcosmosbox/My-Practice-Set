import java.util.Scanner;

/**
 * This program can solve the equation input by the user according to the formula, 
 * and output the root of the equation to the console.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/05/07
 * @version 1.0
 * @teacher Mike , Tim
 */
public class TestAlgebraSolveQuadratic 
{
	public static void main(String[] args) 
	{
		//Prompt and get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//Output results
		if(checkRealRoot(a,b,c) == 2)
		{
			double sqrt = Math.sqrt((b*b) - (4*a*c));
			System.out.println("The roots are "+ (((-1*b)+sqrt)/(2*a)) + " and "+ (((-1*b)-sqrt)/(2*a)));
		}
		else if(checkRealRoot(a,b,c) == 1)
		{
			double sqrt = Math.sqrt((b*b) - (4*a*c));
			System.out.println("The root is "+ (((-1*b)+sqrt)/(2*a)) );
		}
		else
		{
			String sqrt = ""+ (Math.sqrt(Math.abs( (b*b) - (4*a*c) ))/(2*a))+"i" ;
			System.out.println("The roots are "+ ((-1*b)/(2*a))+" + "+sqrt +"  and  "+ ((-1*b)/(2*a))+" - "+sqrt  );
		}
	}
	
	/*
	 *	This method is used to detect the number of roots 
	 */
	public static int checkRealRoot(double a, double b, double c)
	{
		double temp = ((b*b) - (4*a*c));
		
		//Return the number of roots
		if(temp > 0)
		{
			return 2;
		}
		else if(temp == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}

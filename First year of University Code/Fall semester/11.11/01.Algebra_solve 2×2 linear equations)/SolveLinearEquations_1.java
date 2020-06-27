/**The program can solve that user enter a,b,c,d,e and f display the result
 * 
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/10/14
 * @version 1.0
 */ 

public class SolveLinearEquations_1 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//reading user input 
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a,b,c,d,e,f :");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		//Check whether user input is legitimate
		if(a*d - b*c == 0)
		{
			System.out.println("The equation has no solution!");
		}
		
		//Calculation results
		double x =(e*d-b*f)/(a*d-b*c);
		double y =(a*f-e*c)/(a*d-b*c);
		
		//Compute results
		System.out.println("x is "+ x);
		System.out.println("y is "+ y);
		

	}

}

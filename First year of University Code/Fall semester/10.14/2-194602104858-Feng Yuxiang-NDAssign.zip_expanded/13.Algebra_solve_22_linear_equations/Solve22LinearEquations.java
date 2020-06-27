/**
 *This program  that solves the following equation and displays the value for x and y
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/26
 * @version 1.0
 */ 
public class Solve22LinearEquations 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Defining variables
		double a =3.4;
		double b =50.2;
		double e =44.5;
		double c =2.1;
		double d =0.55;
		double f =5.9;
		
		//Calculation results
		double x =(e*d-b*f)/(a*d-b*c);
		double y =(a*f-e*c)/(a*d-b*c);
		
		//Compute results
		System.out.println("x is"+'\n'+ x);
		System.out.println("y is"+'\n'+ y);
		

	}

}

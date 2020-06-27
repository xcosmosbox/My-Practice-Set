/**
 *This program can compute expressions
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/25
 * @version 1.0
 */ 
public class ComputeExpressions 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Defining molecule variables
		double molecule_01 = 9.5;
		double molecule_02 = 4.5;
		double molecule_03 = 2.5;
		int molecule_04 = 3;
		
		//Defining denominator variables
		double denominator_01 = 45.5;
		double denominator_02 = 3.5;
		
		//Calculation results
		double result = ((molecule_01*molecule_02)-(molecule_03*molecule_04))/(denominator_01-denominator_02);
		
		//Compute expressions
		System.out.println("("+molecule_01+"*"+molecule_02+"-"+molecule_03+"*"+molecule_04+")"+" / "+"("+denominator_01+"-"+denominator_02+")"+"="+result);
	}

}
